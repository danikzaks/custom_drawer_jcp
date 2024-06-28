package com.zaksdanil.custom_drawer_jcp.domain.model

import com.zaksdanil.custom_drawer_jcp.R

enum class NavigationItem(
    val title: String,
    val icon: Int
) {
    Home(
        icon = R.drawable.ic_launcher_foreground,
        title = "Home"
    ),
    Profile(
        icon = R.drawable.ic_launcher_foreground,
        title = "Profile"
    ),
    Premium(
        icon = R.drawable.ic_launcher_foreground,
        title = "Premium"
    ),
    Settings(
        icon = R.drawable.ic_launcher_foreground,
        title = "Settings"
    )
}