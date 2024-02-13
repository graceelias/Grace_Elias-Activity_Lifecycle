package com.example.grace_elias_activity_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.grace_elias_activity_lifecycle.databinding.ActivityMainBinding

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "onCreate(Bundle?) called")

        binding.button.setOnClickListener{
            binding.textview.setText(R.string.hello)
            binding.editview.setText(R.string.hello)
        }
    }

    override fun onStart()
    {
        super.onStart()

        Log.d(TAG, "onStart() called")
    }

    override fun onRestart()
    {
        super.onRestart()

        Log.d(TAG, "onRestart() called")
    }

    override fun onResume()
    {
        super.onResume()

        Log.d(TAG, "onResume() called")
    }

    override fun onPause()
    {
        super.onPause()

        Log.d(TAG, "onPause() called")
    }

    override fun onStop()
    {
        super.onStop()

        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy()
    {
        super.onDestroy()

        Log.d(TAG, "onDestroy() called")
    }
}