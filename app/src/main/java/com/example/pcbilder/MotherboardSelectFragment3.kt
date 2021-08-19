package com.example.pcbilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.pcbilder.MotherboardSelectFragment3Args
import com.example.pcbilder.R

class MotherboardSelectFragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment3_motherboard_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args:MotherboardSelectFragment3Args by navArgs()
        val caseNumber = args.caseNumber
        val cpuNumber = args.cpuNumber

        println(caseNumber)
        println(cpuNumber)
    }
}