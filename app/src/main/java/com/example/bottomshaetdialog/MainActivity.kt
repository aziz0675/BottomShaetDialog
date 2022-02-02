package com.example.bottomshaetdialog

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetBehavior


class MainActivity : AppCompatActivity() {

    private lateinit var bottomSheet: BottomSheetBehavior<View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
    }

    @SuppressLint("ResourceType")
    private fun setupUI(){
        val bottomSheet = findViewById<View>(R.id.bottom_sheet)
        val payment_btn = findViewById<Button>(R.id.payment_btn)
        val sheetBehavior =  BottomSheetBehavior.from(bottomSheet)

        payment_btn.setOnClickListener{
            if (sheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED) {
                sheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            }else{
                sheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
            }

        }
    }
}