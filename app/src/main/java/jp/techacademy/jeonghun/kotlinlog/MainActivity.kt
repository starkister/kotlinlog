package jp.techacademy.jeonghun.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val say = Human("KIM", 30, "ゲーム").say()
            val think = Human("KIM",30,"映画").think()
    }

}