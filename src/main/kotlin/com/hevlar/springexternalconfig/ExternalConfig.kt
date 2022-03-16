package com.hevlar.springexternalconfig

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "application.config")
data class ExternalConfig(
    var language: String,
    var currency: String?,
    var countries: List<String>,
    var data: Map<String, String>,
    var address: Address
)