package sg.edu.nus.fragments

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import sg.edu.nus.fragments.ActivityDynamic
import sg.edu.nus.fragments.ActivityInterface
import sg.edu.nus.fragments.ActivityStatic

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //to ActivityStatic
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val myIntent = Intent(this, ActivityStatic::class.java)
            startActivity(myIntent)
        }

        //to ActivityDynamic
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val myIntent = Intent(this, ActivityDynamic::class.java)
            startActivity(myIntent)
        }

        //to ActivityInterface
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val myIntent = Intent(this, ActivityInterface::class.java)
            startActivity(myIntent)
        }
    }
}
