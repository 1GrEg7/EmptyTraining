package com.example.habrproject

import android.os.AsyncTask
import android.util.Log
import java.sql.Connection
import java.sql.DriverManager
import java.util.concurrent.Executors


class DatabaseConnectionTask : AsyncTask<Void, Void, Connection>() {
//   192.168.1.68 localhost  127.0.0.1 192.168.0.16
    private val DB_URL = "jdbc:postgresql://192.168.0.16:5432/mobileDb"
    private val USERNAME = "postgres"
    private val PASSWORD = "postgres"

    override fun doInBackground(vararg voids: Void): Connection? {
        try {
            Class.forName("org.postgresql.Driver")
            return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)
        } catch (e: Exception) {
            Log.i("22222222","FAAAAAAAIIIILLLL")
            e.printStackTrace()
            Log.i("22222222","FAAAAAAAIIIILLLL")

            return null
        }
    }


    override fun onPostExecute(connection: Connection?) {
        if (connection != null) {
            Log.i("111111111", "SUCCESS!!!!")
            val executor = Executors.newSingleThreadExecutor()
            executor.execute {
                try {
                    val statement = connection.createStatement()
                    val query = "SELECT * FROM products"
                    val resultSet = statement.executeQuery(query)
                    while (resultSet.next()) {
                        val id = resultSet.getString("product_id")
                        val name = resultSet.getString("product_name")
                        val type = resultSet.getString("product_type")
                        Log.i("00000000000", id)
                        Log.i("00000000000", name)
                        Log.i("00000000000", type)
                        println("ID: $id Name: $name, type: $type")
                    }
                    connection.close()
                } catch (e: Exception) {
                    Log.i("55555555555", "FAAAAAAAIIIILLLL")
                    e.printStackTrace()
                    Log.i("55555555555", "FAAAAAAAIIIILLLL")
                }
            }
        }
    }

}