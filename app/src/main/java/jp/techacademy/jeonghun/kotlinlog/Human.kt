package jp.techacademy.jeonghun.kotlinlog

import android.util.Log

open class Human : Animal,Thinkable{
    constructor(name:String, age:Int): super(name,age){
        this.name = name
        this.age = age
        say()
    }
    constructor() : super() {
        think()
    }
    override var name:String = ""
    override var age:Int = 0

    //thinkable
    override var hobby:String = "プログラミング"

    override fun think(){
        Log.d("kotlinTest", "私は"+hobby+"について考える。")
    }


    override fun say(){
        Log.d("kotlinTest","私の名前は"+name+"です。年は"+age.toString()+"歳です。")
    }
}