package com.example.pcbilder.PcSelectComponent

import androidx.navigation.NavDirections
import com.example.pcbilder.RamSelectFragment5Directions

class SelectRam (caseNumber: Int, cpuNumber: Int, motherboardNumber: Int,
                 gpuNumber: Int, ramNumber: Int): SelectComponents {
    override val transferNumber: NavDirections = RamSelectFragment5Directions.actionRamSelectFragment5ToMemorySelectFragment6(caseNumber, cpuNumber, motherboardNumber, gpuNumber, ramNumber)
}