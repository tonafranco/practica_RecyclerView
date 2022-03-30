package com.movilesi.practica_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.movilesi.practica_recyclerview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"Primer video\", \"channel\": \"GamingNinja\", \"views\": \"6k views\", \"datePosted\": \"1 year ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"Ahora si se viene lo chido\", \"channel\": \"LuisitoComunica\", \"views\": \"8k views\", \"datePosted\": \"5 days ago\", \"duration\": \"02:40\"}"),
            JSONObject("{\"title\": \"¡¿Que ha pasado?!\", \"channel\": \"AuronPlay\", \"views\": \"10k views\", \"datePosted\": \"22 days ago\", \"duration\": \"03:25\"}"),
            JSONObject("{\"title\": \"La seleccion a Qatar\", \"channel\": \"AztecaDeportes\", \"views\": \"150k views\", \"datePosted\": \"1 month ago\", \"duration\": \"05:02\"}"),
            JSONObject("{\"title\": \"¿Conoces las banderas del mundo?\", \"channel\": \"Quizzplay\", \"views\": \"254k views\", \"datePosted\": \"3 years ago\", \"duration\": \"03:30\"}")
        )

        binding.rdVideoEntries.adapter = MainAdapter(fakeVideoData)
    }
}