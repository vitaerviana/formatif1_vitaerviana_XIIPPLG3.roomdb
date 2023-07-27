package com.codepelita.formatif1_vitaerviana_xiipplg3.database

import androidx.room.*

@Dao
interface UserDAO {
    @Insert
    fun insertDataUser (vararg user:barang)
    @Delete
    fun deleteDataUser (vararg user:barang)
    @Update
    fun updateDataUser (vararg user:barang)
    @Query("SELECT * FROM tbbarang")
    fun getDataUser(): List<barang>
}
