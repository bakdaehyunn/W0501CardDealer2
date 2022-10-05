package kr.ac.kumoh.s20181370

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.ac.kumoh.s20181370.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.card1.setImageResource(R.drawable.c_2_of_hearts)
        getCardName(32)

    }
    private fun getCardName(c: Int): String{
        Log.i("getCardName",c.toString())
        val shape =when(c/13){
            0->"spades"
            1->"diamonds"
            else->"error"
        }
        return "c_4_of_spades"
    }
}