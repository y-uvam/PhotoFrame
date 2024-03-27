package com.example.photoframe

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.photoframe.databinding.ActivityMainBinding // Import your binding class

//import kotlinx.android.synthetic.main.activity_main.imageView

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var index=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
// string=[ s2 , s3 , s4 ,s5 ]
//          1     2    3   4
    fun previous(view: View) {
        if(index==1){
            index=4
            binding.imageView.setImageResource(R.drawable.s5)
            binding.textt.setText("Spiderman 4")
        }
        else if(index==2){
            index=1
            binding.imageView.setImageResource(R.drawable.s2)
            binding.textt.setText("Spiderman 1")
        }
        else if(index==3){
            index=2
            binding.imageView.setImageResource(R.drawable.s3)
            binding.textt.setText("Spiderman 2")
        }
        else {
            index=3
            binding.imageView.setImageResource(R.drawable.s4)
            binding.textt.setText("Spiderman 3")
        }

    }
    fun next(view: View) {

        if(index==1){
            index=2
            binding.imageView.setImageResource(R.drawable.s3)
            binding.textt.setText("Spiderman 2")
        }
        else if(index==2){
            index=3
            binding.imageView.setImageResource(R.drawable.s4)
            binding.textt.setText("Spiderman 3")
        }
        else if(index==3){
            index=4
            binding.imageView.setImageResource(R.drawable.s5)
            binding.textt.setText("Spiderman 4")
        }
        else {
            index=1
            binding.imageView.setImageResource(R.drawable.s2)
            binding.textt.setText("Spiderman 1")
        }
    }
}