package com.msvalandro.wishlistapp

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.msvalandro.wishlistapp.data.DummyWishlist
import com.msvalandro.wishlistapp.data.Wish

@Composable
fun HomeView(navController: NavController, viewModel: WishlistViewModel) {
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
                onClick = {
                    navController.navigate(Screen.AddScreen.route)
                }
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add item")
            }
        }
    ) {
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(it)) {
            items(DummyWishlist.wishlist) {
                WishlistItem(wish = it, onClick = {})
            }
        }
    }
}

@Composable
fun WishlistItem(wish: Wish, onClick: () -> Unit) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 8.dp, start = 8.dp, end = 8.dp)
        .clickable {
            onClick()
        },
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = wish.title, fontWeight = FontWeight.ExtraBold)
            Text(text = wish.description)
        }
    }
}