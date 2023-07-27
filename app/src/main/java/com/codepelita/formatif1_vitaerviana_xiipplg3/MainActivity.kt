package com.codepelita.formatif1_vitaerviana_xiipplg3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import com.codepelita.formatif1_vitaerviana_xiipplg3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //1. buat var lateinit binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //2. meng inflate binding
        binding= ActivityMainBinding.inflate(layoutInflater)
        //3. setContentView
        setContentView(binding.root)
        binding.btnActivityTambah.setOnClickListener{
            startActivity(
                Intent(this, input_barang::class.java) //input_barang = nama class .kt input barang
            )
        }
    }
}