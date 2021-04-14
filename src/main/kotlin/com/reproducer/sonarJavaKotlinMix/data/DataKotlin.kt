package com.reproducer.sonarJavaKotlinMix.data

data class DataKotlin(private var a: String, private var b: String, private var c: String){

    fun toBeTested(input: String) = "Hello $input"
}