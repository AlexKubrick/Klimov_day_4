package ru.alexkubrick.klimov_day_4_traffic_lights

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redButton: Button = findViewById(R.id.button_red)
        val yellowButton: Button = findViewById(R.id.button_yellow)
        val greenButton: Button = findViewById(R.id.button_green)

        redButton.setOnClickListener(viewListener)
        yellowButton.setOnClickListener(viewListener)
        greenButton.setOnClickListener(viewListener)
    }

    private val viewListener = View.OnClickListener {
        val rootLayout: ConstraintLayout = findViewById(R.id.root_layout)
        val textView: TextView = findViewById(R.id.textView)

        when (it.id){
            R.id.button_red -> {
                textView.text = resources.getText(R.string.Red)
                rootLayout.setBackgroundColor(resources.getColor(R.color.redColor))
            }
            R.id.button_yellow -> {
                textView.text = resources.getText(R.string.Yellow)
                rootLayout.setBackgroundColor(resources.getColor(R.color.yellowColor))
            }
            R.id.button_green -> {
                textView.text = resources.getText(R.string.Green)
                rootLayout.setBackgroundColor(resources.getColor(R.color.greenColor))
            }
        }
    }
}