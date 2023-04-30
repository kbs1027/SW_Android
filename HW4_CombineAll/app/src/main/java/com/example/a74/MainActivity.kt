package com.example.a74

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.a74.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var toggle : ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.viewpager.adapter = MyPagerAdapter(this)
        binding.viewpager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        val drawer = findViewById<DrawerLayout>(R.id.drawer)
        toggle = ActionBarDrawerToggle(this,drawer,R.string.drawer_opened
            ,R.string.drawer_closed)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toggle.syncState()
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){return true}
        return super.onOptionsItemSelected(item)
    }
}