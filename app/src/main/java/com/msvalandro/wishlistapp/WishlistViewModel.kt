package com.msvalandro.wishlistapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WishlistViewModel: ViewModel() {
    var wishTitleState by mutableStateOf("")
    var wishDescriptionState by mutableStateOf("")

    fun onWishTitleChanged(newTitle: String) {
        wishTitleState = newTitle
    }

    fun onWishDescriptionChanged(newDescription: String) {
        wishDescriptionState = newDescription
    }
}
