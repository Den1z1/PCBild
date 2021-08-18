package com.example.pcbilder.PcSelectComponent

import android.view.View
import android.widget.ImageView
import androidx.navigation.NavDirections
import androidx.navigation.findNavController

interface SelectComponents {
    open val transferNumber: NavDirections

    fun selectComponent(componentImage: ImageView, view: View){
        componentImage.setOnClickListener(){
            view.findNavController().navigate(transferNumber)
        }
    }
}