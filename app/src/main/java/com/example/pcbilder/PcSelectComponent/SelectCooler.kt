package com.example.pcbilder.PcSelectComponent

import androidx.navigation.NavDirections
import com.example.pcbilder.CoolerSelectFragment7Directions

class SelectCooler(caseNumber: Int, cpuNumber: Int, motherboardNumber: Int,
                   gpuNumber: Int, ramNumber: Int, memoryNumber: Int,
                   coolerNumber: Int): SelectComponents  {
    override val transferNumber: NavDirections = CoolerSelectFragment7Directions.actionCoolerSelectFragment7ToPowerunitSelectFragment8(caseNumber, cpuNumber, motherboardNumber, gpuNumber, ramNumber, memoryNumber, coolerNumber)
}