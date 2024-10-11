package com.example.navigation_plos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class act_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_main).

        val host: Fragment =supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment? ?: return
        val navController = host.
    // включаем боковое мене
        val sidebar = findViewById<NavigationView>(R.id.navview)
        sidebar?.setupWithNavController(navController)
    }
}