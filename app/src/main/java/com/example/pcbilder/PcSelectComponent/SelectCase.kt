package com.example.pcbilder.PcSelectComponent


import androidx.navigation.NavDirections
import com.example.pcbilder.PcComponentFragments.CaseSelectFragment1Directions


class SelectCase(caseNumber: Int): SelectComponents{
    override val transferNumber: NavDirections = CaseSelectFragment1Directions.actionCaseSelectFragment1ToCpuSelectFragment2(caseNumber)

}