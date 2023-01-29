package fr.isen.contal.androidrestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import fr.isen.contal.androidrestaurant.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.boutonEntrees.setOnClickListener{
            val intent = Intent(this, ActivityCategory::class.java)
            intent.putExtra("cathegory", "entrees")
            startActivity(intent)


        }

        binding.boutonPlats.setOnClickListener{
            val intent = Intent(this, ActivityCategory::class.java)
            intent.putExtra("cathegory", "plats")
            startActivity(intent)
        }

        binding.boutonDesserts.setOnClickListener{
            val intent = Intent(this, ActivityCategory::class.java)
            intent.putExtra("cathegory", "desserts")
            startActivity(intent)
        }

       /* val entrees = findViewById<Button>(R.id.boutonEntrees)
        entrees.setOnClickListener {
           // Snackbar.make(it, "vous avez sélectionné les entrées", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, ActivityCategory::class.java)
            startActivity(intent)
        }

        val plats = findViewById<Button>(R.id.boutonPlats)
        plats.setOnClickListener {
           // Snackbar.make(it, "vous avez sélectionné les plats", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, ActivityCategory::class.java)
            startActivity(intent)
        }

        val desserts = findViewById<Button>(R.id.boutonDesserts)
        desserts.setOnClickListener {
            //Snackbar.make(it, "vous avez sélectionné les desserts", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, ActivityCategory::class.java)
            startActivity(intent)
        }*/

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("HomeActivity", "il est mort")
    }
}
