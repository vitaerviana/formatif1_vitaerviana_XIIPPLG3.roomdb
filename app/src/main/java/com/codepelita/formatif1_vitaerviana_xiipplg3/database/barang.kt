package com.codepelita.formatif1_vitaerviana_xiipplg3.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbbarang")
data class barang(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    val id : Int,
    @ColumnInfo(name = "Nama Barang")
    val namabarang : String,
    @ColumnInfo(name = "Harga")
    val harga : Double,
    @ColumnInfo(name = "Stok")
    val stok : Int

)
