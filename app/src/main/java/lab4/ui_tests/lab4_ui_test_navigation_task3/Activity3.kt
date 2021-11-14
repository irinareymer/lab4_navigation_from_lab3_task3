package lab4.ui_tests.lab4_ui_test_navigation_task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import lab4.ui_tests.lab4_ui_test_navigation_task3.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToFirst.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java, )
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
        binding.bnToSecond.setOnClickListener{
            finish()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
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