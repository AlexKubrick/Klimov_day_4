package ru.alexkubrick.klimov_day_4_traffic_lights

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout: ConstraintLayout = findViewById(R.id.root_layout)
        val textView: TextView = findViewById(R.id.textView)
        val redButton = findViewById<Button>(R.id.button_red)
        val yellowButton: Button = findViewById(R.id.button_yellow)
        val greenButton: Button = findViewById(R.id.button_green)

        val clickListener = View.OnClickListener {
        redButton.setOnClickListener {
            textView.text = "Красный"
            rootLayout.setBackgroundColor(resources.getColor(R.color.redColor, null))
        }

        yellowButton.setOnClickListener {
            textView.setText(R.string.Yellow)
            rootLayout.setBackgroundColor(resources.getColor(R.color.yellowColor))
        }

        greenButton.setOnClickListener {
            textView.text = resources.getText(R.string.Green)
            rootLayout.setBackgroundColor(Color.GREEN)
        }
    }
}