package com.example.pcbilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.pcbilder.PcSelectComponent.SelectCooler
import com.example.pcbilder.R
import kotlinx.android.synthetic.main.fragment7_cooler_select.*



class CoolerSelectFragment7 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment7_cooler_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args: CoolerSelectFragment7Args by navArgs()
        val caseNumber = args.caseNumber
        val cpuNumber = args.cpuNumber
        val motherboardNumber = args.motherboardNumber
        val gpuNumber = args.gpuNumber
        val ramNumber = args.ramNumber
        val memoryNumber = args.memoryNumber

        componentImage1.setImageResource(R.drawable.c_dc)
        SelectCooler(caseNumber,cpuNumber,motherboardNumber,gpuNumber,ramNumber,memoryNumber,1).selectComponent(componentImage1, view)

        componentImage2.setImageResource(R.drawable.c_pcc)
        SelectCooler(caseNumber,cpuNumber,motherboardNumber,gpuNumber,ramNumber,memoryNumber,2).selectComponent(componentImage2, view)

        componentImage3.setImageResource(R.drawable.c_cm)
        SelectCooler(caseNumber,cpuNumber,motherboardNumber,gpuNumber,ramNumber,memoryNumber,3).selectComponent(componentImage3, view)
    }
}