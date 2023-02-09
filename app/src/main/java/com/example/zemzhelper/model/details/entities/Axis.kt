package com.example.zemzhelper.model.details.entities

import com.example.zemzhelper.model.details.Details
import com.example.zemzhelper.model.details.DetailType

class Axis(
    private var steel: String,
    private val name: String,
    private val number: String,
    private val diameter: String,
    private val length: String,
    private val stage: Int
) : Details {

    private val type: DetailType = DetailType.Axis

    override fun type(): DetailType = type

    override fun steel(): String = steel

    override fun name(): String = name

    override fun number(): String = number

    override fun length(): String = "L = $length"

    override fun diameter(): String = "Ø $diameter"

    override fun stage(): Int = stage
}