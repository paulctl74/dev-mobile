package fr.isen.contal.androidrestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val entrees = findViewById<Button>(R.id.boutonEntrees)
        entrees.setOnClickListener {
            Snackbar.make(it, "vous avez sélectionné les entrées", Snackbar.LENGTH_SHORT).show()
        }

        val plats = findViewById<Button>(R.id.boutonPlats)
        plats.setOnClickListener {
            Snackbar.make(it, "vous avez sélectionné les plats", Snackbar.LENGTH_SHORT).show()
        }

        val desserts = findViewById<Button>(R.id.boutonDesserts)
        desserts.setOnClickListener {
            Snackbar.make(it, "vous avez sélectionné les desserts", Snackbar.LENGTH_SHORT).show()
        }

    }
}