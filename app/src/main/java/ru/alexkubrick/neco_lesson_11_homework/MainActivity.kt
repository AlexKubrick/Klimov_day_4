package ru.alexkubrick.neco_lesson_11_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.alexkubrick.neco_lesson_11_homework.constance.Constance
import ru.alexkubrick.neco_lesson_11_homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    val cleaner = "Сергей"
    val engineer = "Андрей"
    val doctor = "Егор"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.buttonEarn.setOnClickListener {
            val resultValue: String = bindingClass.Name.text.toString()

            when (resultValue) {
                cleaner -> {
                    bindingClass.Earned.visibility = View.VISIBLE
                    val tempText = "Take your ${Constance.Cleaner_salary}"
                    bindingClass.Earned.text = if (bindingClass.Password.text.toString().toInt() == Constance.Cleaner_password) {
                     tempText
                    } else {
                        "Invalid password"
                    }
                }
                engineer -> {
                    bindingClass.Earned.visibility = View.VISIBLE
                    val tempText = "Take your ${Constance.Engineer_salary}"
                    bindingClass.Earned.text = if (bindingClass.Password.text.toString().toInt() == Constance.Engineer_password) {
                        tempText
                    } else {
                        "Invalid password"
                    }
                }
                doctor -> {
                    val tempText = "Take your ${Constance.Doctor_salary}"
                    bindingClass.Earned.text = if (bindingClass.Password.text.toString().toInt() == Constance.Doctor_password) {
                        tempText
                    } else {
                        "Invalid password"
                    }
                }

                else -> {
                    bindingClass.Earned.visibility = View.VISIBLE
                    bindingClass.Earned.text = "Такого работника нет"
                }
            }

        }



    }
}