package com.reproducer.sonarJavaKotlinMix.controller

import com.reproducer.sonarJavaKotlinMix.data.DataKotlin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KotlinTestController {

    @GetMapping("kotlin")
    fun test() = DataKotlin("a", "b", "c")
}