package com.hevlar.springexternalconfig

data class Address(
    var building: String,
    var unit: String,
    var street: String,
    var city: String,
    var country: String?,
    var postalCode: String?
)