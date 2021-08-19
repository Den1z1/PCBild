package com.example.pcbilder.PcSelectComponent

import androidx.navigation.NavDirections
import com.example.pcbilder.MotherboardSelectFragment3
import com.example.pcbilder.MotherboardSelectFragment3Directions

class SelectMotherboard(caseNumber: Int, cpuNumber: Int, motherboardNumber: Int): SelectComponents {
    override val transferNumber: NavDirections = MotherboardSelectFragment3Directions.actionMotherboardSelectFragment3ToGpuSelectFragment43(caseNumber,cpuNumber,motherboardNumber)
}