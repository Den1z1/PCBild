package com.example.pcbilder.PcSelectComponent

import androidx.navigation.NavDirections
import com.example.pcbilder.CoolerSelectFragment7Directions
import com.example.pcbilder.PowerunitSelectFragment8
import com.example.pcbilder.PowerunitSelectFragment8Directions

class SelectPowerunit(caseNumber: Int, cpuNumber: Int, motherboardNumber: Int,
                      gpuNumber: Int, ramNumber: Int, memoryNumber: Int,
                      coolerNumber: Int, powerunitNumber: Int): SelectComponents  {
    override val transferNumber: NavDirections = PowerunitSelectFragment8Directions.actionPowerunitSelectFragment8ToResultsFragment(caseNumber, cpuNumber, motherboardNumber, gpuNumber, ramNumber, memoryNumber, coolerNumber, powerunitNumber)
}