package fr.isen.contal.androidrestaurant

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import fr.isen.contal.androidrestaurant.databinding.ActivityCathegorieBinding

class ActivityCategory : AppCompatActivity() {
    private lateinit var binding: ActivityCathegorieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCathegorieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val title = intent.extras?.getString("cathegory") ?: "pas de plats disponibles"
        binding.juj.text = title

        binding.choix.layoutManager = LinearLayoutManager(this)


        val dishes = when (title) {
            "entrees" -> resources.getStringArray(R.array.tab_entrees).toList() as ArrayList<String>
            "plats" -> resources.getStringArray(R.array.tab_plats).toList() as ArrayList<String>
            "desserts" -> resources.getStringArray(R.array.tab_desserts).toList() as ArrayList<String>
            else -> arrayListOf()
        }
        binding.choix.adapter = CategoryAdapter(dishes) {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
        binding.choix.setOnClickListener {
            //val intent = Intent(this, DetailActivity::class.java)
            //startActivity(intent)
            val myIntent = Intent(this, DetailActivity::class.java)
            myIntent.putExtra("nomDuPlat", "marche putain")
            it.context.startActivity(myIntent)
        }




       // loadDishesFromAPI()


    }
    /*private fun myOnClickItem(myMealDetail: DetailActivity){
        //Log.d("##########HUMAN############", message)
        val myIntent = Intent(this@ActivityCategory, DetailActivity::class.java)
        myIntent.putExtra("meal_infos", myMealDetail as Serializable)
        startActivity(myIntent)
    }*/




    /*private fun loadDishesFromAPI() {

        val url = "http://test.api.cartering.bluecodegame.com/menu"
        val jsonObject = JSONObject()
        jsonObject.put("id_shop", "1")
        val jsonRequest = JsonObjectRequest(Request.Method.POST, url, jsonObject, {
            Log.w("ActivityCategory", "reponse : &it")
        }, {
            Log.w("ActivityCategory", "erreur : &it")
        })
        Volley.newRequestQueue(this).add(jsonRequest)
    }*/
}