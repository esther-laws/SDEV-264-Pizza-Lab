package com.example.lab02_laws

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab02_laws.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        @SuppressLint("SetTextI18n")
        fun onPlaceOrderButtonClicked() {
            var pizzaSizePrice = 0.0
            var toppingsTotal = 0.0

            when {
                binding.smallPizza.isChecked -> pizzaSizePrice = 5.0
                binding.mediumPizza.isChecked -> pizzaSizePrice = 7.0
                binding.largePizza.isChecked -> pizzaSizePrice = 9.0
            }

            if (binding.onionsCheckBox.isChecked) {
                toppingsTotal += 1
            }
            if (binding.olivesCheckBox.isChecked) {
                toppingsTotal += 2
            }
            if (binding.tomatoesCheckBox.isChecked) {
                toppingsTotal += 3
            }

            binding.totalPrice.text = "Total Order Price = $" + (pizzaSizePrice + toppingsTotal)
        }
    }
}
