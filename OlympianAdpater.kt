package com.example.themedallist

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class OlympianAdapter(): RecyclerView.Adapter<OlympianAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.list_layout, parent, false) as View
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = OlympianList.count

    var svd: String? = null

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = OlympianList.olympian[position]
        holder.bind(item)
        holder.itemView.setOnClickListener{
            svd = item.toString()
            Snackbar.make(holder.itemView, "$svd", Snackbar.LENGTH_SHORT).show()
        }
    }

    inner class ViewHolder(val v: View): RecyclerView.ViewHolder(v){
        val name = v.findViewById<TextView>(R.id.oName)
        val gold = v.findViewById<TextView>(R.id.gold)

        fun bind(item: Olympian){
            name.text = item.name
            gold.text = item.medals

            /*v.setOnClickListener{
                val o = Intent(it.context, Option::class.java)
                o.putExtra("opt", item)
                startActivity(o)
            }*/
        }
    }
}