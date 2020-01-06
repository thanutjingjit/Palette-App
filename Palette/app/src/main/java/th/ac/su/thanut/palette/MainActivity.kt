package th.ac.su.thanut.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvRGB = findViewById<TextView>(R.id.tvRGB)
        var tvShowing = findViewById<TextView>(R.id.tvShowing)
        var btnOne = findViewById<Button>(R.id.btnOne)
        var btnTwo = findViewById<Button>(R.id.btnTwo)
        var btnThree = findViewById<Button>(R.id.btnThree)
        var btnFour = findViewById<Button>(R.id.btnFour)
        var btnFive = findViewById<Button>(R.id.btnFive)
        var btnSix = findViewById<Button>(R.id.btnSix)

        btnOne.setOnClickListener {
            tvShowing.text = "235-255-221"
            tvShowing.setBackgroundColor(Color.parseColor("#FFE9E1DE"))
        }

        btnTwo.setOnClickListener {
            tvShowing.text = "236-203-202"
            tvShowing.setBackgroundColor(Color.parseColor("#ecbec4"))
        }

        btnThree.setOnClickListener {
            tvShowing.text = "106-121-148"
            tvShowing.setBackgroundColor(Color.parseColor("#6a7994"))
        }

        btnFour.setOnClickListener {
            tvShowing.text = "153-169-191"
            tvShowing.setBackgroundColor(Color.parseColor("#8fa1b8"))
        }

        btnFive.setOnClickListener {
            tvShowing.text = "195-204-216"
            tvShowing.setBackgroundColor(Color.parseColor("#bcc7d1"))
        }

        btnSix.setOnClickListener {
            tvShowing.text = "221-226-269"
            tvShowing.setBackgroundColor(Color.parseColor("#dadfe3"))
        }

    }
}