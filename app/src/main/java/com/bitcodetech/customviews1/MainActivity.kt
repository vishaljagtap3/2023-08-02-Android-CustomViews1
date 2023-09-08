package com.bitcodetech.customviews1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CompoundButton
import android.widget.CompoundButton.OnCheckedChangeListener
import com.bitcodetech.customviews1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var btnExit : Button
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chkExit.setOnCheckedChangeListener(
            object : OnCheckedChangeListener {
                override fun onCheckedChanged(checkBox: CompoundButton?, isChecked: Boolean) {
                    binding.btnExit.exitable = isChecked
                }
            }
        )

        /*btnExit = ExitButton(this)
        setContentView(btnExit)*/
    }
}