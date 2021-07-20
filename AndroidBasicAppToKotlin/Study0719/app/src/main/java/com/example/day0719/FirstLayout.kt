package com.example.day0719

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment

/*
* Created by ruhr on 2021-07-20 TUE
* */

class FirstLayout : Fragment()
{
    lateinit var v : View

    @Nullable
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.first_layout, container, false)

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
