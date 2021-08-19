package com.example.pcbilder.PcSelectComponent

import androidx.navigation.NavDirections
import com.example.pcbilder.MemorySelectFragment6Directions

class SelectMemory(caseNumber: Int, cpuNumber: Int, motherboardNumber: Int,
                   gpuNumber: Int, ramNumber: Int, memory: Int): SelectComponents {
    override val transferNumber: NavDirections = MemorySelectFragment6Directions.actionMemorySelectFragment6ToCoolerSelectFragment7()
}