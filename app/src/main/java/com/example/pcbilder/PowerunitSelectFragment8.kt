package com.example.pcbilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.pcbilder.PcSelectComponent.SelectPowerunit
import com.example.pcbilder.R
import kotlinx.android.synthetic.main.fragment8_powerunit_select.*


class PowerunitSelectFragment8 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment8_powerunit_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args: PowerunitSelectFragment8Args by navArgs()
        val caseNumber = args.caseNumber
        val cpuNumber = args.cpuNumber
        val motherboardNumber = args.motherboardNumber
        val gpuNumber = args.gpuNumber
        val ramNumber = args.ramNumber
        val memoryNumber = args.memoryNumber
        val coolerNumber = args.coolerNumber


        componentImage1.setImageResource(R.drawable.pu_chieftec2)
        SelectPowerunit(caseNumber,cpuNumber,motherboardNumber,gpuNumber,ramNumber,memoryNumber,coolerNumber,1).selectComponent(componentImage1, view)

        componentImage2.setImageResource(R.drawable.pu_chieftec1)
        SelectPowerunit(caseNumber,cpuNumber,motherboardNumber,gpuNumber,ramNumber,memoryNumber,coolerNumber,2).selectComponent(componentImage2, view)
    }
}