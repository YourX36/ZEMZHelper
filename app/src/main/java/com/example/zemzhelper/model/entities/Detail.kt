package com.example.zemzhelper.model.entities

data class Detail(
    var sketch : Int?,
    var steel : String,
    var numberDrawing : String?,
    var quantityPerModule : Int,
    var steelType: SteelType,
    var length : Double?,
    var diameter: Double?,
    var pipeDiameter: PipeDiameter?,
    var drawing : String?,
    var module: Module
)

enum class SteelType {
    Circle,
    Pipe,
    Sheet
}

class PipeDiameter(private val outside : Double, private val inside : Double) {
    fun getPipeDiameter() = "$outside x $inside"
}

