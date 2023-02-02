package com.example.zemzhelper

import com.example.zemzhelper.model.entities.Machine
import com.example.zemzhelper.model.entities.Module

val machines: List<Machine> = listOf(
    Machine("18У"),
    Machine("22Э"),
    Machine("29Э"),
    Machine("36Э"),
    Machine("КМУ"),
    Machine("АЛ30"),
)

val modules18: List<Module> = listOf(
    Module("Газ-ON", machines[0]),
    Module("Садко", machines[0]),
    Module("У(СН)", machines[0]),
    Module("600", machines[0]),
    Module("1000", machines[0]),
    Module("Стрела ${machines[0].machineName}", machines[0]),
    Module("Перекатное ${machines[0].machineName}", machines[0]),
    Module("Подвеска ${machines[0].machineName}", machines[0]),
    Module("Люлька ${machines[0].machineName}", machines[0]),
)
val modules22: List<Module> = listOf(
    Module("Газ-ON", machines[1]),
    Module("Поворотная рама ${machines[1].machineName}", machines[1]),
    Module("Стрела ${machines[1].machineName}", machines[1]),
    Module("Перекатное ${machines[1].machineName}", machines[1]),
    Module("Подвеска ${machines[1].machineName}", machines[1]),
    Module("Люлька ${machines[1].machineName}", machines[1])

)
val modules29: List<Module> = listOf(
    Module("Газ-ON", machines[2]),
    Module("Поворотная рама ${machines[2].machineName}", machines[2]),
    Module("Стрела ${machines[2].machineName}", machines[2]),
    Module("Перекатное ${machines[2].machineName}", machines[2]),
    Module("Подвеска ${machines[2].machineName}", machines[2]),
    Module("Люлька ${machines[2].machineName}", machines[2])

)
val modules36: List<Module> = listOf(
    Module("Газ-ON", machines[3]),
    Module("Поворотная рама ${machines[3].machineName}", machines[3]),
    Module("Стрела ${machines[3].machineName}", machines[3]),
    Module("Перекатное ${machines[3].machineName}", machines[3]),
    Module("Подвеска ${machines[3].machineName}", machines[3]),
    Module("Люлька ${machines[3].machineName}", machines[3])

)
val modulesKMU: List<Module> = listOf(
    Module("Газ-ON", machines[4]),
    Module("Поворотная рама ${machines[4].machineName}", machines[4]),
    Module("Стрела ${machines[4].machineName}", machines[4]),
    Module("Перекатное ${machines[4].machineName}", machines[4]),
    Module("Подвеска ${machines[4].machineName}", machines[4]),
    Module("Люлька ${machines[4].machineName}", machines[4])

)
val modulesAL30: List<Module> = listOf(
    Module("Газ-ON", machines[5]),
    Module("Поворотная рама ${machines[5].machineName}", machines[5]),
    Module("Стрела ${machines[5].machineName}", machines[5]),
    Module("Перекатное ${machines[5].machineName}", machines[5]),
    Module("Подвеска ${machines[5].machineName}", machines[5]),
    Module("Люлька ${machines[5].machineName}", machines[5])

)