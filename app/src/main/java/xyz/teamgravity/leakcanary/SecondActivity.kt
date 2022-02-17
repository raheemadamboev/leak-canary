package xyz.teamgravity.leakcanary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import xyz.teamgravity.leakcanary.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // intentional memory leak
        MainActivity.context = this
    }
}