package com.example.zemzhelper.model.entities

data class Detail(
    val id : Int,
    var sketch : Int?,
    var steel : String,
    var detailName: String,
    var numberDrawing : String?,
    var count : Int,
    var steelType: SteelType,
    var length : Double?,
    var diameter: Double?,
    var pipeDiameter: PipeDiameter?,
    var thickness: String,
    var drawing : String?,
    var module: Module,
    var logisticsPoints: String?
)

enum class SteelType {
    Circle,
    Pipe,
    Sheet
}

class PipeDiameter(private val outside : Double, private val inside : Double) {
    fun getPipeDiameter() = "$outside x $inside"
}

