package com.example.pcbilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.pcbilder.R
import kotlinx.android.synthetic.main.fragment1_case_select.*

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

        componentImage2.setImageResource(R.drawable.m_kssata)

        componentImage3.setImageResource(R.drawable.m_kssata)

        componentImage4.setImageResource(R.drawable.m_kssata)

        componentImage5.setImageResource(R.drawable.m_ksm2)
    }
}