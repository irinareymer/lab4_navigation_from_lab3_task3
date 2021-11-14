package lab4.ui_tests.lab4_ui_test_navigation_task3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import lab4.ui_tests.lab4_ui_test_navigation_task3.databinding.AboutBinding

class ActivityAbout  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = AboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonBack.setOnClickListener {
            finish()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}