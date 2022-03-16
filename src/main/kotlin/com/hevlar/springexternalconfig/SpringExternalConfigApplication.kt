package com.hevlar.springexternalconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(ExternalConfig::class)
class SpringExternalConfigApplication

fun main(args: Array<String>) {
    runApplication<SpringExternalConfigApplication>(*args)
}
