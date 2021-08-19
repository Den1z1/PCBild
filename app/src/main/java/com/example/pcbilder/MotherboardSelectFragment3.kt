package com.example.pcbilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.pcbilder.MotherboardSelectFragment3Args
import com.example.pcbilder.PcSelectComponent.SelectCase
import com.example.pcbilder.PcSelectComponent.SelectMotherboard
import com.example.pcbilder.R
import kotlinx.android.synthetic.main.fragment1_case_select.*

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

        if (caseNumber < 6 && cpuNumber < 4){
            componentImage1.setImageResource(R.drawable.mb_asrock_atx_am4_1)
            SelectMotherboard(caseNumber,cpuNumber,1).selectComponent(componentImage1,view)

            componentImage2.setImageResource(R.drawable.mb_asrock_atx_am4_2)
            SelectMotherboard(caseNumber,cpuNumber,2).selectComponent(componentImage2,view)

        }else if (caseNumber > 5 && cpuNumber < 4){
            componentImage1.setImageResource(R.drawable.mb_asrock_matx_am4_1)
            SelectMotherboard(caseNumber,cpuNumber,3).selectComponent(componentImage1,view)

            componentImage2.setImageResource(R.drawable.mb_asrock_matx_am4_2)
            SelectMotherboard(caseNumber,cpuNumber,4).selectComponent(componentImage2,view)

        }else if (caseNumber < 6 && cpuNumber > 3){
            componentImage1.setImageResource(R.drawable.mb_asus_atx_lga1200_1)
            SelectMotherboard(caseNumber,cpuNumber,5).selectComponent(componentImage1,view)

            componentImage2.setImageResource(R.drawable.mb_asrock_atx_lga1200_2)
            SelectMotherboard(caseNumber,cpuNumber,6).selectComponent(componentImage2,view)

        }else if (caseNumber > 5 && caseNumber > 3){
            componentImage1.setImageResource(R.drawable.mb_asrock_matx_lga1200_1)
            SelectMotherboard(caseNumber,cpuNumber,7).selectComponent(componentImage1,view)

            componentImage2.setImageResource(R.drawable.mb_asrock_matx_lga1200_2)
            SelectMotherboard(caseNumber,cpuNumber,8).selectComponent(componentImage2,view)
        }
    }
}