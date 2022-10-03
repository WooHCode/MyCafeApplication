package kr.tutorials.mycafeapplication.login.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.tutorials.mycafeapplication.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private var binding :ActivityMainBinding?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val username = binding?.username
        val password = binding?.password
        val login =binding?.login
        val loading = binding?.loading


    }
}