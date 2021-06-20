package com.example.learningapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.learningapp.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception


class MainActivity : AppCompatActivity() {
    private fun concat(s1:String, s2:String):String{
        return s1+s2;
    }
    lateinit var binding: ActivityMainBinding
    var a: Double = 0.0
    var b: Double = 0.0
    var temp: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    override fun onStart() {
        super.onStart()
        with(binding){
            eightText.setOnClickListener{result.text = concat(result.text as String, eightText.text as String)}
            sevenText.setOnClickListener{result.text = concat(result.text as String, sevenText.text as String)}
            nineText.setOnClickListener{result.text = concat(result.text as String, nineText.text as String)}
            sixText.setOnClickListener{result.text = concat(result.text as String, sixText.text as String)}
            fiveText.setOnClickListener{result.text = concat(result.text as String, fiveText.text as String)}
            fourText.setOnClickListener{result.text = concat(result.text as String, fourText.text as String)}
            threeText.setOnClickListener{result.text = concat(result.text as String, threeText.text as String)}
            twoText.setOnClickListener{result.text = concat(result.text as String, twoText.text as String)}
            oneText.setOnClickListener{result.text = concat(result.text as String, oneText.text as String)}
            zeroText.setOnClickListener{result.text = concat(result.text as String, zeroText.text as String)}
            dotText.setOnClickListener{
                if(!result.text.contains('.'))
                    result.text = concat(result.text as String, dotText.text as String)}

            plusButton.setOnClickListener{
                try {
                    a = result.text.toString().toDouble()
                    temp = "+"
                    result.text = ""
                } catch (e: Exception){
                }

            }
            minusButton.setOnClickListener{
                try {
                    a = result.text.toString().toDouble()
                    temp = "-"
                    result.text = ""
                } catch (e: Exception){
                }
            }
            multiplyButton.setOnClickListener{
                try {
                    a = result.text.toString().toDouble()
                    temp = "*"
                    result.text = ""
                } catch (e: Exception){
                }
            }
            divButton.setOnClickListener{
                try {
                    a = result.text.toString().toDouble()
                    temp = "/"
                    result.text = ""
                } catch (e: Exception){
                }
            }
            equals.setOnClickListener{
                try {
                    b=result.text.toString().toDouble()
                    if(temp == "+"){
                        result.text = (a + b).toString() }
                    else if (temp == "-"){
                        result.text = (a - b).toString() }
                    else if (temp == "*"){
                        result.text = (a * b).toString() }
                    else if (temp == "/"){
                        result.text = (a / b).toString() }
                    else {
                        a = result.text.toString().toDouble()
                        result.text = a.toString()
                    }
                }catch (e:Exception){}
                temp = ""

            }

            clearText.setOnClickListener{
                result.text= ""
                a=0.0
                b=0.0}
        }
       
    }


}