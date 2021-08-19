package com.example.pcbilder.PcSelectComponent

import androidx.navigation.NavDirections
import com.example.pcbilder.CpuSelectFragment2Directions

class SelectCpu(caseNumber: Int, cpuNumber: Int): SelectComponents {
    override val transferNumber: NavDirections = CpuSelectFragment2Directions.actionCpuSelectFragment2ToMotherboardSelectFragment3(caseNumber,cpuNumber)
}