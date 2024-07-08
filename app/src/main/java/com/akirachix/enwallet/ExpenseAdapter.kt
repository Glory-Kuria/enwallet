package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class ExpenseAdapter (val expenseList: List<Expense>): RecyclerView.Adapter<ExpenseViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout
            .expense_item, parent, false)
        return ExpenseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
       val expenses = expenseList[position]
        holder.sal.text = expenses.salary
        holder.salAmount.text = expenses.amountSalary
        holder.salDate.text = expenses.dateSalary
        holder.rent.text = expenses.amountRent
        holder.rentAmount.text = expenses.amountRent
        holder.rentDate.text = expenses.dateRent
        holder.div.text = expenses.dividends
        holder.divAmount.text = expenses.anountDividends
        holder.divDate.text = expenses.dateDividends
        holder.electric.text = expenses.electricity
        holder.electricAmount.text = expenses.amountElectricity
        holder.electricDate.text = expenses.dateElectricity
        holder.internet.text = expenses.internet
        holder.intAmount.text = expenses.amountInternet
        holder.intDate.text = expenses.dateInternet
        holder.shop.text = expenses.shopping
        holder.shopDate.text = expenses.dateShopping
        holder.shopAmount.text = expenses.amountShopping
        holder.bus.text = expenses.busFare
        holder.busDate.text = expenses.dateBusFare
        holder.busAmount.text = expenses.amountBusFare

    }

    override fun getItemCount(): Int {
        return expenseList.size
    }
}

class ExpenseViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView){
    val sal = itemView.findViewById<TextView>(R.id.sal)
    val salAmount = itemView.findViewById<TextView>(R.id.salAmount)
    val salDate = itemView.findViewById<TextView>(R.id.salDate)
    val rent = itemView.findViewById<TextView>(R.id.rent)
    val rentDate = itemView.findViewById<TextView>(R.id.rentDate)
    val rentAmount = itemView.findViewById<TextView>(R.id.rentAmount)
    val div = itemView.findViewById<TextView>(R.id.div)
    val divAmount = itemView.findViewById<TextView>(R.id.divAmount)
    val divDate = itemView.findViewById<TextView>(R.id.divAmount)
    val electric = itemView.findViewById<TextView>(R.id.electric)
    val electricAmount = itemView.findViewById<TextView>(R.id.electricAmount)
    val electricDate = itemView.findViewById<TextView>(R.id.electricDate)
    val internet = itemView.findViewById<TextView>(R.id.internet)
    val intAmount = itemView.findViewById<TextView>(R.id.intAmount)
    val intDate =itemView.findViewById<TextView>(R.id.intDate)
    val shop = itemView.findViewById<TextView>(R.id.shop)
    val shopAmount = itemView.findViewById<TextView>(R.id.shopAmount)
    val shopDate = itemView.findViewById<TextView>(R.id.shopDate)
    val bus = itemView.findViewById<TextView>(R.id.bus)
    val busAmount = itemView.findViewById<TextView>(R.id.busAmount)
    val busDate = itemView.findViewById<TextView>(R.id.busDate)


}