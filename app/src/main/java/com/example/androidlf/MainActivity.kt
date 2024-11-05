package com.example.androidlf

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.androidlf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private lateinit var textCount:TextView
//    private lateinit var button: Button
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private var count:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel= ViewModelProvider(this)[MainActivityViewModel::class.java]

        binding.button.setOnClickListener {
//            count++
//            binding.textNumber.text=count.toString()
            viewModel.inc()
            binding.textNumber.text=viewModel.counter.value.toString()
        }
  //      setContentView(R.layout.activity_main)
//        Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show()
//        textCount=findViewById(R.id.text_number)
//        button=findViewById(R.id.button)
//        button.setOnClickListener {
//            count++
//            textCount.text=count.toString()
//        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show()
        binding.textNumber.text=viewModel.counter.value.toString()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop",Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show()
    }
}