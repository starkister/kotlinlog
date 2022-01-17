package jp.techacademy.jeonghun.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val instance1 = Human("KIM", 30, "ゲーム")
            instance1.say()
            instance1.think()

            val instance2 = Human("KIM2",31,"映画")
            instance2.say()
            instance2.think()
    }
}