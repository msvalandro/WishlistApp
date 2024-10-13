package com.msvalandro.wishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWishlist {
    val wishlist = listOf(
        Wish(title = "Google Pixel 8", description = "The latest Android smartphone from Google"),
        Wish(title = "Samsung Galaxy Buds Pro", description = "High-quality wireless earbuds with noise cancellation"),
        Wish(title = "Sony PlayStation 5", description = "Next-gen gaming console with 4K gaming support"),
        Wish(title = "Apple MacBook Pro 14", description = "Powerful laptop with M2 Pro chip for creative professionals"),
        Wish(title = "DJI Mini 3 Pro", description = "Compact drone with 4K video capabilities and long battery life")
    )
}
