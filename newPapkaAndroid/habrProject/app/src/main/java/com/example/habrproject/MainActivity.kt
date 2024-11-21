package com.example.habrproject

//import kotlinx.coroutines.flow.internal.NoOpContinuation.context


import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.ui.platform.ComposeView
import com.example.habrproject.databinding.ActivityMainBinding
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException


class MainActivity : ComponentActivity() {
    lateinit var composeView: ComposeView
    private lateinit var binding: ActivityMainBinding



//    val db = Room.databaseBuilder(
//
//    )

    lateinit var textViewtext: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        composeView = binding.myComposable

//        composeView.setContent {
//            Greeting(name = "Olia")
//        }

        textViewtext= binding.textView
        var str = ""
        DatabaseConnectionTask().execute()


//        val url = "jdbc:postgresql://192.168.1.68:5432/mobileDb" //?serverTimezone=Europe/Moscow&useSSL=false
//        ///val url = "jdbc:postgresql://localhost/mobileDb"
//        val username = "postgres"
//        val password = "postgres"
//        Log.i("111111111","YYYYYYYYYYYYYYYYYYY")
//
//       // Log.i("000", connection.toString())
//        try {
//            var connection: Connection = DriverManager.getConnection(url, username, password)
//            Log.i("111111111","YYYYYYYYPPPPPPPPPY!!!!!!")
//            //Class.forName("org.postgresql.Driver")
//
//// Далее можно выполнять запросы к базе данных
//
//
//            val statement = connection.createStatement()
//            val query = "SELECT * FROM products"
//            val resultSet = statement.executeQuery(query)
//            while (resultSet.next()) {
//
//                val id = resultSet.getString("product_id")
//                val name = resultSet.getString("product_name")
//                val type = resultSet.getString("product_type")
//                Log.i("122",id)
//                Log.i("PPPPPP",id)
//                str+=" $id  $name $type ;"
//                println("ID: $id Name: $name, type: $type")
//
//            }
//            connection.close()
//
//
//        } catch (e: ClassNotFoundException) {
//            Log.i("ooooo","Y111111Y")
//            e.printStackTrace()
//        } catch (e: SQLException) {
//            Log.i("eeeeee22","!!!!!!!!!!!!!!!!!!!!!!!!")
//            e.printStackTrace()
//            Log.i("eeeeee22","!!!!!!!!!!!!!!!!!!!!!!!!!1")
//        }
//
//        textViewtext.setText(str)
//
//



    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Column {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )
//        Text(text = "And Greg!")
//    }
//
//
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    HabrProjectTheme {
//        Greeting("Android")
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun button(){
//    Column {
//        Button(onClick = { /*TODO*/ }) {
//            Text(text = "hellow")
//        }
//    }
//}

