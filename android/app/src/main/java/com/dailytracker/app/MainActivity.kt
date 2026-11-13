package com.dailytracker.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(17, 19, 17))
        }

        val title = TextView(this).apply {
            text = "DAILY TRACKER"
            textSize = 26f
            setTextColor(Color.rgb(65, 210, 110))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Seu progresso, um dia de cada vez."
            textSize = 15f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}