package com.example.appi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






            xy.setOnClickListener {
                Toast.makeText(this,"Home button",Toast.LENGTH_SHORT)

                zz.setOnClickListener {
                    Toast.makeText(this, "Home button", Toast.LENGTH_SHORT)
                }
            }

        }
    }
