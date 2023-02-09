package com.example.zemzhelper.model.details

interface Details {

    fun type() : DetailType
    fun steel() : String
    fun name() : String
    fun number() : String
    fun length() : String
    fun diameter() : String
    fun stage() : Int

}

enum class DetailType {
    Axis,
    Sheet,
    Sleeve,
    Hexagon
}
