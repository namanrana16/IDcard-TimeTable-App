package com.example.appi

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager.widget.ViewPager
import com.example.appi.R.layout.activity_main
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_id.*
import kotlinx.android.synthetic.main.fragment_timetable.*

class MainActivity : AppCompatActivity() {
    private val picker = registerForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        xy.setImageURI(uri)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.idFragment)

        bottomNavigationView.setupWithNavController(navController)

        val btn = findViewById<Button>(R.id.addidbutton)
        btn.setOnClickListener {
            picker.launch("Image/*")

        }

    }


}
