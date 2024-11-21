package com.example.habrproject

import android.content.Context
import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.Update
//import kotlinx.coroutines.flow.internal.NoOpContinuation
import java.util.concurrent.Flow

@Database(
    version = 1,
    entities = [
        productsDb::class
    ],
)
abstract class dealWithProducts: RoomDatabase(){

    companion object{
        fun getDb(context:Context):dealWithProducts{
            return Room.databaseBuilder(
                context.applicationContext,
                dealWithProducts::class.java,
                "mobileDb.db"

            ).build()
        }
    }

    abstract fun products(): tableDao

}


@Entity(tableName = "products")
data class productsDb(
    @PrimaryKey
    @ColumnInfo(name = "product_id")
    val id: String,
    @ColumnInfo(name = "product_name")
    val productName: String,
    @ColumnInfo(name = "product_type")
    val productType: String,
    @ColumnInfo(name = "supplayer")
    val supplayer: String,


)


@Dao
interface tableDao{

    @Insert suspend fun addProduct(product: productsDb)
    @Update suspend fun editProduct(product: productsDb)
    @Delete suspend fun removeProduct(product: productsDb)


    @Query("select * from products")
    suspend fun showAll(): List<productsDb>

}