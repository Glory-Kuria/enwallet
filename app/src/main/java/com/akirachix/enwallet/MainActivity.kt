package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvExpense.layoutManager = LinearLayoutManager( this)

       displayItems()

    }
    fun displayItems(){
        var item1 = Expense("salary", "KES 40000", "1 July 2024","Rent","KES 16000","2 july 2024",
            "Dividends","KES 2400","4 july 2024","Electricity","KES 800","5 july 2024",
            "Internet","KES 2500","5 july 2024","Shopping","KES 3500","5 july 2024",
            "Bus fare","KES 3500","11 july 2024")
        var item2= Expense("salary", "KES 40000", "1 July 2024","Rent","KES 16000","2 july 2024",
            "Dividends","KES 2400","4 july 2024","Electricity","KES 800","5 july 2024",
            "Internet","KES 2500","5 july 2024","Shopping","KES 3500","5 july 2024",
            "Bus fare","KES 3500","11 july 2024")

        val expenseList = listOf(item1, item2)
        val expenseAdapter = ExpenseAdapter(expenseList)
        binding.rvExpense.adapter = expenseAdapter
    }
}