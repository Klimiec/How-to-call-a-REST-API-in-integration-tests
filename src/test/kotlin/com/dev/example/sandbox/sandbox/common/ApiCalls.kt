package com.dev.example.sandbox.sandbox.common

import com.dev.example.sandbox.sandbox.product.api.ProductCreationApiCalls
import org.springframework.test.web.reactive.server.WebTestClient

class ApiCalls(
    private val webTestClient: WebTestClient
) {
    fun productCreation() = ProductCreationApiCalls(webTestClient)
}
