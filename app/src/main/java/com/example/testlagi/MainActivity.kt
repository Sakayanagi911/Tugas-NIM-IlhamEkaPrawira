package com.example.testlagi

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menghubungkan layout XML dengan Activity ini
        setContentView(R.layout.activity_main)

        // Menambahkan event listener untuk tombol Yay
        val buttonYay: Button = findViewById(R.id.buttonYay)
        buttonYay.setOnClickListener {
            // Kode yang dieksekusi saat tombol "Yay" diklik
            Toast.makeText(this, "Ehehe Makasih!", Toast.LENGTH_SHORT).show()
        }

        // Menambahkan event listener untuk tombol Nay
        val buttonNay: Button = findViewById(R.id.buttonNay)
        buttonNay.setOnClickListener {
            // Kode yang dieksekusi saat tombol "Nay" diklik
            Toast.makeText(this, "Yah.. yaudah deh:')", Toast.LENGTH_SHORT).show()
        }
    }
}
