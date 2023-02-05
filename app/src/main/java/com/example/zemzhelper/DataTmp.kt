package com.example.zemzhelper

import com.example.zemzhelper.model.entities.Machine
import com.example.zemzhelper.model.entities.Module

val machinesTMP: List<Machine> = listOf(
    Machine("18У", machineCount = 20, machineImage = R.drawable.ic_sadko),
    Machine("22Э", machineCount = 5, machineImage = R.drawable.ic_22),
    Machine("29Э", machineCount = 5, machineImage = R.drawable.ic_29),
    Machine("36Э", machineCount = 0, machineImage = R.drawable.ic_36),
    Machine("КМУ", machineCount = 0, machineImage = R.drawable.ic_kmu),
    Machine("АЛ30", machineCount = 0, machineImage = R.drawable.ic_al30),
)

val modules18: List<Module> = listOf(
    Module("Газ-ON", machinesTMP[0]),
    Module("Садко", machinesTMP[0]),
    Module("У(СН)", machinesTMP[0]),
    Module("600", machinesTMP[0]),
    Module("1000", machinesTMP[0]),
    Module("Стрела ${machinesTMP[0].machineName}", machinesTMP[0]),
    Module("Перекатное ${machinesTMP[0].machineName}", machinesTMP[0]),
    Module("Подвеска ${machinesTMP[0].machineName}", machinesTMP[0]),
    Module("Люлька ${machinesTMP[0].machineName}", machinesTMP[0]),
)
val modules22: List<Module> = listOf(
    Module("Газ-ON", machinesTMP[1]),
    Module("Поворотная рама ${machinesTMP[1].machineName}", machinesTMP[1]),
    Module("Стрела ${machinesTMP[1].machineName}", machinesTMP[1]),
    Module("Перекатное ${machinesTMP[1].machineName}", machinesTMP[1]),
    Module("Подвеска ${machinesTMP[1].machineName}", machinesTMP[1]),
    Module("Люлька ${machinesTMP[1].machineName}", machinesTMP[1])

)
val modules29: List<Module> = listOf(
    Module("Газ-ON", machinesTMP[2]),
    Module("Поворотная рама ${machinesTMP[2].machineName}", machinesTMP[2]),
    Module("Стрела ${machinesTMP[2].machineName}", machinesTMP[2]),
    Module("Перекатное ${machinesTMP[2].machineName}", machinesTMP[2]),
    Module("Подвеска ${machinesTMP[2].machineName}", machinesTMP[2]),
    Module("Люлька ${machinesTMP[2].machineName}", machinesTMP[2])

)
val modules36: List<Module> = listOf(
    Module("Газ-ON", machinesTMP[3]),
    Module("Поворотная рама ${machinesTMP[3].machineName}", machinesTMP[3]),
    Module("Стрела ${machinesTMP[3].machineName}", machinesTMP[3]),
    Module("Перекатное ${machinesTMP[3].machineName}", machinesTMP[3]),
    Module("Подвеска ${machinesTMP[3].machineName}", machinesTMP[3]),
    Module("Люлька ${machinesTMP[3].machineName}", machinesTMP[3])

)
val modulesKMU: List<Module> = listOf(
    Module("Газ-ON", machinesTMP[4]),
    Module("Поворотная рама ${machinesTMP[4].machineName}", machinesTMP[4]),
    Module("Стрела ${machinesTMP[4].machineName}", machinesTMP[4]),
    Module("Перекатное ${machinesTMP[4].machineName}", machinesTMP[4]),
    Module("Подвеска ${machinesTMP[4].machineName}", machinesTMP[4]),
    Module("Люлька ${machinesTMP[4].machineName}", machinesTMP[4])

)
val modulesAL30: List<Module> = listOf(
    Module("Газ-ON", machinesTMP[5]),
    Module("Поворотная рама ${machinesTMP[5].machineName}", machinesTMP[5]),
    Module("Стрела ${machinesTMP[5].machineName}", machinesTMP[5]),
    Module("Перекатное ${machinesTMP[5].machineName}", machinesTMP[5]),
    Module("Подвеска ${machinesTMP[5].machineName}", machinesTMP[5]),
    Module("Люлька ${machinesTMP[5].machineName}", machinesTMP[5])

)


val steelTMP: List<String> = listOf<String>(
    "ст3",
    "09г2С",
    "20",
    "45",
    "40Х",
    "38ХМЮА"
)

val detailNameTMP = listOf<String>(
    "Ось",
    "Втулка",
    "Штуцер",
    "Блок"
)

val numberDrawingTMP = listOf<String>(
    "18У(4)-01.04.02.11",
    "18У-01.01.00.00.07",
    "18У-01.02.00.00.02",
    "18У-01.01.00.00.11",
    "18У(4)-01.05.05.06",
    "18У-01.00.00.00.03",
    "18У-01.00.00.00.04",
    "18У-01.04.03.00.01",
    "18у-01.03.03.00.03",
    "18у-01.03.03.00.02",
    "18у-01.00.00.00.02"
)