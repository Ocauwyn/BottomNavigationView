package com.example.bottomnavigationview
//Pengerjaan Terakhir : 01/06/2025 18:11
//NIM                 : 10122334
//NAMA                : Berry Abdul Ghany
//Kelas               : Pemograman Android - 4
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.bottomnavigationview.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    //lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       // binding = ActivityMainBinding.inflate(layoutInflater)
       // setContentView(binding.root)
        setContentView(R.layout.activity_main)
        loadfragment(HomeFragment())

        val bottomnav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomnav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> loadfragment(HomeFragment())
                R.id.menu_profil -> loadfragment(ProfileFragment())
                R.id.menu_setting -> loadfragment(SettingFragment())
                R.id.menu_notification -> loadfragment(NotificationFragment())
                R.id.menu_help -> loadfragment(HelpFragment())
            }
            true
        }

    }

    private fun loadfragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,fragment)
            .commit()

    }
}