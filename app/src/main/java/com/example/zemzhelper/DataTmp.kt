package com.example.zemzhelper

import com.example.zemzhelper.model.entities.Machine
import com.example.zemzhelper.model.entities.Module

val machinesTMP: List<Machine> = listOf(
    Machine("18У", machineCount = 20),
    Machine("22Э", machineCount = 5),
    Machine("29Э", machineCount = 5),
    Machine("36Э", machineCount = 0),
    Machine("КМУ", machineCount = 0),
    Machine("АЛ30", machineCount = 0),
)


val modules22: List<Module> = listOf(
    Module("Газ-ON", machinesTMP[1], 1),
    Module("Поворотная рама ${machinesTMP[1].machineName}", machinesTMP[1], 1),
    Module("Стрела ${machinesTMP[1].machineName}", machinesTMP[1], 1),
    Module("Перекатное ${machinesTMP[1].machineName}", machinesTMP[1], 1),
    Module("Подвеска ${machinesTMP[1].machineName}", machinesTMP[1], 1),
   // Module("Люлька ${machinesTMP[1].machineName}", machinesTMP[1])
)
