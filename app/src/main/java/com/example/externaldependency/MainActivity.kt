package com.example.externaldependency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.externaldependency.databinding.ActivityMainBinding
import com.example.mylibrary.MyLibraryJavaFile

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var myLibraryJavaFile : MyLibraryJavaFile?= null
    //private var myLibraryKotlinFile : MyLibraryKotlinFile?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myLibraryJavaFile = MyLibraryJavaFile()

        binding.textview.text = "My LibraryTest Result : "+myLibraryJavaFile?.add(1,2).toString()

    }
}
