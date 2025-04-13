package com.example.tugas5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi view
        val editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        val buttonShowToast = findViewById<Button>(R.id.buttonShowToast)

        buttonShowToast.setOnClickListener {
            val phoneNumber = editTextPhone.text.toString()

            if (phoneNumber.isNotEmpty()) {
                Toast.makeText(this, "Nomor: $phoneNumber", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Silakan masukkan nomor telepon", Toast.LENGTH_SHORT).show()
            }
        }
    }
}