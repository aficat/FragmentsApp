package sg.edu.nus.fragments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class ActivityInterface : AppCompatActivity(), Fragment3.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interface)

        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()

        val fragment3 = Fragment3()
        transaction.add(R.id.frameLayout3, fragment3)

        transaction.commit()

        val butBack = findViewById<Button>(R.id.btn_back)
        butBack.setOnClickListener{
            finish()
        }
    }

    // implement the InteractionListener
    override fun onFragmentInteraction(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }

}
