package com.example.pcbilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.pcbilder.PcSelectComponent.SelectCpu
import com.example.pcbilder.PcSelectComponent.SelectRam
import com.example.pcbilder.R
import kotlinx.android.synthetic.main.fragment1_case_select.*

class RamSelectFragment5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment5_ram_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args:RamSelectFragment5Args by navArgs()
        val caseNumber = args.caseNumber
        val cpuNumber = args.cpuNumber
        val motherboardNumber = args.motherboardNumber
        val gpuNumber = args.gpuNumber

        componentImage1.setImageResource(R.drawable.ram_hpx3_1)
        SelectRam(caseNumber,cpuNumber,motherboardNumber,gpuNumber,1).selectComponent(componentImage1,view)

        componentImage2.setImageResource(R.drawable.ram_hpx1_2)
        SelectRam(caseNumber,cpuNumber,motherboardNumber,gpuNumber,2).selectComponent(componentImage2,view)

        componentImage3.setImageResource(R.drawable.ram_hpx2_2)
        SelectRam(caseNumber,cpuNumber,motherboardNumber,gpuNumber,3).selectComponent(componentImage3,view)

        componentImage4.setImageResource(R.drawable.ram_ad1_2)
        SelectRam(caseNumber,cpuNumber,motherboardNumber,gpuNumber,4).selectComponent(componentImage4,view)

        componentImage5.setImageResource(R.drawable.ram_ad2_2)
        SelectRam(caseNumber,cpuNumber,motherboardNumber,gpuNumber,5).selectComponent(componentImage5,view)

    }
}