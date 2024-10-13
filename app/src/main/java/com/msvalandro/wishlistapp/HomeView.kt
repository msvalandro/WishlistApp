package com.msvalandro.wishlistapp

import android.widget.Toast
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun HomeView() {
    val context = LocalContext.current

    Scaffold(
        topBar = { AppBarView(title = "Wishlist", {
            Toast.makeText(context, "Button clicked!", Toast.LENGTH_LONG).show()
        }) },
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier.padding(all = 20.dp),
                contentColor = Color.White,
                containerColor = Color.Black,
                onClick = { /*TODO Add navigation to Add screen*/ }
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add item")
            }
        },
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.statusBars)
    ) {
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(it)) {

        }
    }
}