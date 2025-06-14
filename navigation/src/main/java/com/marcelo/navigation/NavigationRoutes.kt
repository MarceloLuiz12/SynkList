package com.marcelo.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
object HomeScreen: NavKey

@Serializable
data class DetailScreen(val id: Int) : NavKey