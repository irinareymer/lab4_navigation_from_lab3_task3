package lab4.ui_tests.lab4_ui_test_navigation_task3

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import lab4.ui_tests.lab4_ui_test_navigation_task3.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bnToThird.setOnClickListener{
            goToThirdActivity()
        }
        binding.bnToFirst.setOnClickListener{
            finish()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
    }
    private fun goToThirdActivity(){
        val intent = Intent(this, Activity3::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.app_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.about) {
            val intent = Intent(this, ActivityAbout::class.java)
            startActivity(intent)
            true
        }
        else super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}