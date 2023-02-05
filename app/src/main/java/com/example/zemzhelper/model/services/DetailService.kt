package com.example.zemzhelper.model.services

import com.example.zemzhelper.detailNameTMP
import com.example.zemzhelper.model.entities.Detail
import com.example.zemzhelper.model.entities.SteelType
//import com.example.zemzhelper.modules18
import com.example.zemzhelper.numberDrawingTMP
import com.example.zemzhelper.steelTMP
import com.github.javafaker.Faker


class DetailService {
    private var details = mutableListOf<Detail>()


    fun getDetails(): List<Detail> = details

/*    init {
        val faker = Faker.instance()
        details = (1..20).map {
            Detail(
                id = it,
                sketch = null,
                steel = steelTMP[it % steelTMP.size],
                detailName = detailNameTMP[it % detailNameTMP.size],
                numberDrawing = numberDrawingTMP[it % numberDrawingTMP.size],
                count = faker.number().numberBetween(1, 4),
                steelType = SteelType.Circle,
                length = faker.number().numberBetween(10, 660).toDouble(),
                diameter = faker.number().numberBetween(8, 130).toDouble(),
                pipeDiameter = null,
                thickness = faker.number().numberBetween(6, 40).toString(),
                drawing = null,
                module = modules18[it % modules18.size],
                logisticsPoints = null
            )
        }.toMutableList()
    }*/


}