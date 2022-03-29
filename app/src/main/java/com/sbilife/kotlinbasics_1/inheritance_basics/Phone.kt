package com.sbilife.kotlinbasics_1.inheritance_basics

//open keyword to allow your class to be inherited by other classes
open class Phone(val type:String) {
    open val name:String = ""
    val volome: Int = 10
    open val size: Int = 5

    open fun makeCall() = println("calling from mobile")
    open fun display()= println("simple mobile display")
    fun powerOff() = println("Shutting Down..")
    fun getDeviceInfo(){}
}