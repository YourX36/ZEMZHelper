package com.example.zemzhelper.model.details.entities

import com.example.zemzhelper.model.details.Details
import com.example.zemzhelper.model.details.DetailType

class Sleeve(
    private var steel: String,
    private val name: String,
    private val number: String,
    private val outsideDiameter: String,
    private val insideDiameter: String,
    private val length: String,
    private val stage: Int
) : Details {

    private val type: DetailType = DetailType.Sleeve

    override fun type(): DetailType = type

    override fun steel(): String = steel

    override fun name(): String = name

    override fun number(): String = number

    override fun length(): String = "L = $length"

    override fun diameter(): String = "Ø $outsideDiameter x $insideDiameter"

    override fun stage(): Int = stage

}