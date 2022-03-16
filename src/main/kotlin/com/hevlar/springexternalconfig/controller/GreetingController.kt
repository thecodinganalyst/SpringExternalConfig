package com.hevlar.springexternalconfig.controller

import com.hevlar.springexternalconfig.ExternalConfig
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController(val externalConfig: ExternalConfig) {

    @GetMapping
    fun hello(@RequestParam name: String?): String{
        val br = "<br/>"
        val greeting = "Hello, " + ( name ?: "World" ) + br

        var footer = externalConfig.language + br

        for (country in externalConfig.countries){
            footer += country + br
        }

        for (key in externalConfig.data.keys){
            footer += key + " : " + externalConfig.data[key] + System.lineSeparator() + br
        }

        footer += """
            ${externalConfig.address.building}, ${externalConfig.address.unit} $br
            ${externalConfig.address.street} $br
            ${externalConfig.address.city} $br
            ${externalConfig.address.country ?: ""}  ${externalConfig.address.postalCode ?: ""}
        """.trimIndent()

        return greeting + footer
    }
}