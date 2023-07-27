package com.codepelita.formatif1_vitaerviana_xiipplg3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codepelita.formatif1_vitaerviana_xiipplg3.R
import com.codepelita.formatif1_vitaerviana_xiipplg3.database.barang

class AdapterBarang(val list: List<barang>) :
        RecyclerView.Adapter<AdapterBarang.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val namaBarang = itemView.findViewById<TextView>(R.id.dataNamaBarang)
        val hargaBarang = itemView.findViewById<TextView>(R.id.dataHargaBarang)
        val stokBarang = itemView.findViewById<TextView>(R.id.dataStokBarang)
        val edit = itemView.findViewById<Button>(R.id.BtnEdit)
        val hapus = itemView.findViewById<Button>(R.id.BtnDelete)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.adapteractivity,parent,false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaBarang.text= list[position].namabarang//nama val entity
        holder.hargaBarang.text= list[position].harga.toString()
        holder.stokBarang.text= list[position].stok.toString()
    }

    override fun getItemCount(): Int {
        return list.size

    }


}


