package com.example.pcbilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.pcbilder.PcSelectComponent.SelectCpu
import kotlinx.android.synthetic.main.fragment2_cpu_select.*

class CpuSelectFragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2_cpu_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args: CpuSelectFragment2Args by navArgs()
        val caseNumber = args.caseNumber

        componentImage1.setImageResource(R.drawable.cpu_r5_1600)
        SelectCpu(caseNumber,1).selectComponent(componentImage1,view)

        componentImage2.setImageResource(R.drawable.cpu_r5_3600)
        SelectCpu(caseNumber,2).selectComponent(componentImage2,view)

        componentImage3.setImageResource(R.drawable.cpu_r5_5600)
        SelectCpu(caseNumber,3).selectComponent(componentImage3,view)

        componentImage4.setImageResource(R.drawable.cpu_i3_10100f)
        SelectCpu(caseNumber,4).selectComponent(componentImage4,view)

        componentImage5.setImageResource(R.drawable.cpu_i5_10400)
        SelectCpu(caseNumber,5).selectComponent(componentImage5,view)

        componentImage6.setImageResource(R.drawable.cpu_i7_10700)
        SelectCpu(caseNumber,6).selectComponent(componentImage6,view)
    }

}