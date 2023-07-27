package com.codepelita.formatif1_vitaerviana_xiipplg3.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [barang::class], version = 1)
abstract class dbmart: RoomDatabase() {

    abstract fun DAO(): UserDAO

    companion object {
        @Volatile
        private var INSTANCE: dbmart? = null
        private var key = Any()
        operator fun invoke(context: Context) = INSTANCE ?: synchronized(key) {
            INSTANCE ?: buildDatabase(context).also {
                INSTANCE = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext, dbmart::class.java, "sa_mart"
        ).fallbackToDestructiveMigration().build()

    }
}