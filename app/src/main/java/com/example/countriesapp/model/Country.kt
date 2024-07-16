package com.example.countriesapp.model

import java.io.Serializable

data class Country(
    val flag: Int,
    val name: String,
    val language: String,
    val capital: String,
    val population: String,
    val economy: String,
):Serializable
