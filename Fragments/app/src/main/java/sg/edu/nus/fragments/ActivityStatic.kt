package sg.edu.nus.fragments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class ActivityStatic : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static)

        val butBack = findViewById<Button>(R.id.btn_back)
        butBack.setOnClickListener{
            finish()
        }
    }
}
