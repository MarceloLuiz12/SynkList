package com.marcelo.navigation

import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import com.marcelo.ui.Test2Screen
import com.marcelo.ui.TestScreen

fun <T : NavKey> provideEntry(backStack: NavBackStack, key: T): NavEntry<T> {
    return when (key) {
        is HomeScreen -> NavEntry(key) {
            TestScreen(onItemClick = { id -> backStack.add(DetailScreen(id)) })
        }
        is DetailScreen -> NavEntry(key) {
            Test2Screen(onBack = { backStack.removeAt(backStack.lastIndex)})
        }
        else -> throw IllegalArgumentException("Invalid NavKey: $key")
    }
}