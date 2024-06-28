package com.zaksdanil.custom_drawer_jcp.domain.model

enum class CustomDrawerState {
    Opened,
    Closed
}

fun CustomDrawerState.isOpened(): Boolean {
    return this.name == "Opened"
}

fun CustomDrawerState.opposite(): CustomDrawerState {
    return if (this == CustomDrawerState.Opened)
        CustomDrawerState.Closed
    else
        CustomDrawerState.Opened
}