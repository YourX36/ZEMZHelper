package com.example.zemzhelper.model.services

import com.example.zemzhelper.model.entities.Detail
import com.example.zemzhelper.model.entities.SteelType
import com.example.zemzhelper.modules18
import com.github.javafaker.Faker

typealias DetailListener = (details: List<Detail>) -> Unit

class DetailService {
    private var details = mutableListOf<Detail>()

    private val listeners = mutableListOf<DetailListener>()

    fun getDetails(): List<Detail> = details

    init {
        val faker = Faker.instance()
        val generatedDetails: List<Detail> = (1..20).map {
            Detail(
                id = it,
                sketch = null,
                steel = faker.name().firstName(),
                detailName = faker.name().lastName(),
                numberDrawing = faker.name().name(),
                quantityPerModule = faker.number().numberBetween(1, 4),
                steelType = SteelType.Circle,
                length = faker.number().numberBetween(10, 660).toDouble(),
                diameter = faker.number().numberBetween(8, 130).toDouble(),
                pipeDiameter = null,
                drawing = null,
                module = modules18[it % modules18.size],
                logisticsPoints = null
            )
        }
    }

    fun addListener(listener: DetailListener) {
        listeners.add(listener)
        listener.invoke(details)
    }
    fun removeListener(listener: DetailListener) = listeners.remove(listener)

    private fun notifyChanges() = listeners.forEach { it.invoke(details) }

    fun deleteDetail(detail: Detail) {
        val indexToDelete: Int = details.indexOfFirst { it.id == detail.id }
        if (indexToDelete != -1) {
            details.removeAt(indexToDelete)
            notifyChanges()
        }
    }


}