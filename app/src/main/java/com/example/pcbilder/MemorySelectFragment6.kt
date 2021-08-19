package com.example.pcbilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.pcbilder.PcSelectComponent.SelectMemory
import com.example.pcbilder.R
import kotlinx.android.synthetic.main.fragment6_memory_select.*

class MemorySelectFragment6 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment6_memory_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args: MemorySelectFragment6Args by navArgs()
        val caseNumber = args.caseNumber
        val cpuNumber = args.cpuNumber
        val motherboardNumber = args.motherboardNumber
        val gpuNumber = args.gpuNumber
        val ramNumber = args.ramNumber

        componentImage1.setImageResource(R.drawable.m_wdblue)
        SelectMemory(caseNumber,cpuNumber,motherboardNumber,gpuNumber,ramNumber,1).selectComponent(componentImage1, view)

        componentImage2.setImageResource(R.drawable.m_kssata)
        SelectMemory(caseNumber,cpuNumber,motherboardNumber,gpuNumber,ramNumber,2).selectComponent(componentImage2, view)

        componentImage3.setImageResource(R.drawable.m_kssata)
        SelectMemory(caseNumber,cpuNumber,motherboardNumber,gpuNumber,ramNumber,3).selectComponent(componentImage3, view)

        componentImage4.setImageResource(R.drawable.m_kssata)
        SelectMemory(caseNumber,cpuNumber,motherboardNumber,gpuNumber,ramNumber,4).selectComponent(componentImage4, view)

        componentImage5.setImageResource(R.drawable.m_ksm2)
        SelectMemory(caseNumber,cpuNumber,motherboardNumber,gpuNumber,ramNumber,5).selectComponent(componentImage5, view)
    }
}