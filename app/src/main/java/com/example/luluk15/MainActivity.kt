package com.example.luluk15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnnama = findViewById<Button>(R.id.nama)
        val btnkelas = findViewById<Button>(R.id.kelas)
        val btnnis = findViewById<Button>(R.id.nis)

        btnnama.setOnClickListener {
            Toast.makeText(this, "LUK LUUL LATIFAH", Toast.LENGTH_SHORT).show()
        }
        btnkelas.setOnClickListener {
            Toast.makeText(this, "XI PPLG 1", Toast.LENGTH_SHORT).show()
        }
        btnnis.setOnClickListener {
            Toast.makeText(this, "3006", Toast.LENGTH_SHORT).show()
        }
    }
}