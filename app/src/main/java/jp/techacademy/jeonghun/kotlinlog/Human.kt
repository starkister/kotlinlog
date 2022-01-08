package jp.techacademy.jeonghun.kotlinlog

import android.util.Log

class Human : Animal {
    constructor(name:String, age:Int): super(name,age){
        say()
    }

    override fun say(){
        Log.d("kotlinTest","私の名前は"+name+"です。年は"+age.toString()+"歳です。")
    }
}