package jp.techacademy.jeonghun.kotlinlog

abstract class Animal {
    abstract var name: String
    abstract var age: Int

    constructor(name:String, age:Int){
        this.name = name
        this.age = age
    }

    constructor()

    abstract fun say()
}