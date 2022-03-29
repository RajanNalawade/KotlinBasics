package com.sbilife.kotlinbasics_1.inheritance_basics

class SmartPhone(typeParam:String) : Phone(typeParam){

    override val name: String = "IQOO 7"
    override val size: Int = 6

    override fun display()= println("Smart Phone display")

    override fun makeCall() {
        super.makeCall()
        println("calling from $name")
    }

    fun playMovie() {}
    fun takePicture() {}
    fun getLocation() {}
}