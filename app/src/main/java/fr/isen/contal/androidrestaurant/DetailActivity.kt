package fr.isen.contal.androidrestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.isen.contal.androidrestaurant.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extras = intent.extras
        if (extras != null) {
            val name = extras.getString("nomDuPlat")
            //val price = extras.getString("price")
            //val description = extras.getString("description")
            //val image = extras.getString("image")
            binding.nomDuPlat.text = name
            //binding.detailPrice.text = price
           // binding.descriptionplat.text = description
            //binding.detailImage.setImageResource(resources.getIdentifier(image, "drawable", packageName))
        }


    }



}