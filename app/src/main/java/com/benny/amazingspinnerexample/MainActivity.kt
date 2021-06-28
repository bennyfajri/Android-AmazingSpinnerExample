package com.benny.amazingspinnerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array = arrayOf("Laki-laki", "Perempuan")
        val adapter = SpinnerAdapter(this, array)

        spinExample1.setAdapter(adapter)
        spinExample2.setAdapter(adapter)
        spinExample3.setAdapter(adapter)
        spinExample4.setAdapter(adapter)
    }
}