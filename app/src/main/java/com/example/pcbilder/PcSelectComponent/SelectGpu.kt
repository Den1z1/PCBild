package com.example.pcbilder.PcSelectComponent

import androidx.navigation.NavDirections
import com.example.pcbilder.GpuSelectFragment4Directions

class SelectGpu(caseNumber: Int, cpuNumber: Int, motherboardNumber: Int,
                gpuNumber: Int): SelectComponents {
    override val transferNumber: NavDirections = GpuSelectFragment4Directions.actionGpuSelectFragment43ToRamSelectFragment5(caseNumber, cpuNumber, motherboardNumber, gpuNumber)
}