package com.example.pcbilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs

import com.example.pcbilder.PcSelectComponent.SelectGpu
import com.example.pcbilder.R
import kotlinx.android.synthetic.main.fragment4_gpu_select.*


class GpuSelectFragment4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment4_gpu_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args: GpuSelectFragment4Args by navArgs()
        val caseNumber = args.caseNumber
        val cpuNumber = args.cpuNumber
        val motherboardNumber = args.motherboardNumber

        componentImage1.setImageResource(R.drawable.gpu_asusgtx1650)
        SelectGpu(caseNumber, cpuNumber, motherboardNumber, 1).selectComponent(componentImage1,view)

        componentImage2.setImageResource(R.drawable.gpu_msigtx1660)
        SelectGpu(caseNumber, cpuNumber, motherboardNumber, 2).selectComponent(componentImage2,view)

        componentImage3.setImageResource(R.drawable.gpu_msirtx3060)
        SelectGpu(caseNumber, cpuNumber, motherboardNumber, 3).selectComponent(componentImage3,view)

        componentImage4.setImageResource(R.drawable.gpu_msirtx3070)
        SelectGpu(caseNumber, cpuNumber, motherboardNumber, 4).selectComponent(componentImage4,view)
    }
}