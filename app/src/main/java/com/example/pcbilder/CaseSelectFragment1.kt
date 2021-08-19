package com.example.pcbilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pcbilder.PcSelectComponent.SelectCase
import com.example.pcbilder.R
import kotlinx.android.synthetic.main.fragment1_case_select.*

class CaseSelectFragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_case_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        componentImage1.setImageResource(R.drawable.cs_ginzzu1)
        SelectCase(1).selectComponent(componentImage1,view)

        componentImage2.setImageResource(R.drawable.cs_ac1)
        SelectCase(2).selectComponent(componentImage2,view)

        componentImage3.setImageResource(R.drawable.cs_zalman1)
        SelectCase(3).selectComponent(componentImage3,view)

        componentImage4.setImageResource(R.drawable.cs_zalman2)
        SelectCase(4).selectComponent(componentImage4,view)

        componentImage5.setImageResource(R.drawable.cs_cm1)
        SelectCase(5).selectComponent(componentImage5,view)

        componentImage6.setImageResource(R.drawable.cs_cm2)
        SelectCase(6).selectComponent(componentImage6,view)

        componentImage7.setImageResource(R.drawable.cs_cm3)
        SelectCase(7).selectComponent(componentImage7,view)

        componentImage8.setImageResource(R.drawable.cs_cm4)
        SelectCase(8).selectComponent(componentImage8,view)

    }
}