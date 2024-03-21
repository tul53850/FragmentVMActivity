package edu.temple.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Display generated number using this TextView
        val numberDisplay = findViewById<TextView>(R.id.numberDisplay)

        // Retrieve ViewModel
        val viewModel = ViewModelProvider(this)[DiceViewModel::class.java]


        val fragment = DiceFragment()
        viewModel.setSide(6)


        // Fragment created using factory method and added dynamically using fragmentTransaction
        // argument is the number of sides the die will have
        supportFragmentManager.beginTransaction()
            .add(R.id.diceFragmentContainer, fragment)
            .commit()

        viewModel.getRoll().observe(this){
            numberDisplay.text = it.toString()
        }
    }
}