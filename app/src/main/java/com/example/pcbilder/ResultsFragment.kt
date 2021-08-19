package com.example.pcbilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_results.*


class ResultsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_results, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args: ResultsFragmentArgs by navArgs()
        val caseNumber = args.caseNumber
        val cpuNumber = args.cpuNumber
        val motherboardNumber = args.motherboardNumber
        val gpuNumber = args.gpuNumber
        val ramNumber = args.ramNumber
        val memoryNumber = args.memoryNumber
        val coolerNumber = args.coolerNumber
        val powerunitNumber = args.powerunitNumber


        when (caseNumber){
            1 -> componentImage1.setImageResource(R.drawable.cs_ginzzu1)
            2 -> componentImage1.setImageResource(R.drawable.cs_ac1)
            3 -> componentImage1.setImageResource(R.drawable.cs_zalman1)
            4 -> componentImage1.setImageResource(R.drawable.cs_zalman2)
            5 -> componentImage1.setImageResource(R.drawable.cs_cm1)
            6 -> componentImage1.setImageResource(R.drawable.cs_cm2)
            7 -> componentImage1.setImageResource(R.drawable.cs_cm3)
            8 -> componentImage1.setImageResource(R.drawable.cs_cm4)
        }

        when (cpuNumber){
            1 -> componentImage2.setImageResource(R.drawable.cpu_r5_1600)
            2 -> componentImage2.setImageResource(R.drawable.cpu_r5_3600)
            3 -> componentImage2.setImageResource(R.drawable.cpu_r5_5600)
            4 -> componentImage2.setImageResource(R.drawable.cpu_i3_10100f)
            5 -> componentImage2.setImageResource(R.drawable.cpu_i5_10400)
            6 -> componentImage2.setImageResource(R.drawable.cpu_i7_10700)
        }

        when (motherboardNumber){
            1 -> componentImage3.setImageResource(R.drawable.mb_asrock_atx_am4_2)
            2 -> componentImage3.setImageResource(R.drawable.mb_asrock_atx_am4_1)
            3 -> componentImage3.setImageResource(R.drawable.mb_asrock_matx_am4_2)
            4 -> componentImage3.setImageResource(R.drawable.mb_asrock_matx_am4_1)
            5 -> componentImage3.setImageResource(R.drawable.mb_asrock_atx_lga1200_2)
            6 -> componentImage3.setImageResource(R.drawable.mb_asus_atx_lga1200_1)
            7 -> componentImage3.setImageResource(R.drawable.mb_asrock_matx_lga1200_2)
            8 -> componentImage3.setImageResource(R.drawable.mb_asrock_matx_lga1200_1)
        }

        when (gpuNumber){
            1 -> componentImage4.setImageResource(R.drawable.gpu_asusgtx1650)
            2 -> componentImage4.setImageResource(R.drawable.gpu_msigtx1660)
            3 -> componentImage4.setImageResource(R.drawable.gpu_msirtx3060)
            4 -> componentImage4.setImageResource(R.drawable.gpu_msirtx3070)
        }

        when (ramNumber){
            1 -> componentImage5.setImageResource(R.drawable.ram_hpx3_1)
            2 -> componentImage5.setImageResource(R.drawable.ram_hpx1_2)
            3 -> componentImage5.setImageResource(R.drawable.ram_hpx2_2)
            4 -> componentImage5.setImageResource(R.drawable.ram_ad1_2)
            5 -> componentImage5.setImageResource(R.drawable.ram_ad2_2)
        }

        when (memoryNumber){
            1 -> componentImage6.setImageResource(R.drawable.m_wdblue)
            2 -> componentImage6.setImageResource(R.drawable.m_kssata)
            3 -> componentImage6.setImageResource(R.drawable.m_kssata)
            4 -> componentImage6.setImageResource(R.drawable.m_kssata)
            5 -> componentImage6.setImageResource(R.drawable.m_ksm2)
        }

        when (coolerNumber){
            1 -> componentImage7.setImageResource(R.drawable.c_dc)
            2 -> componentImage7.setImageResource(R.drawable.c_pcc)
            3 -> componentImage7.setImageResource(R.drawable.c_cm)
        }

        when (powerunitNumber){
            1 -> componentImage8.setImageResource(R.drawable.pu_chieftec2)
            2 -> componentImage8.setImageResource(R.drawable.pu_chieftec1)
        }

    }
}