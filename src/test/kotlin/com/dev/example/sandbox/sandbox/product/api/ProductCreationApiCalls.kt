package com.dev.example.sandbox.sandbox.product.api

import com.dev.example.sandbox.sandbox.product.creation.api.request.ProductCreationDto
import org.springframework.http.MediaType
import org.springframework.test.web.reactive.server.WebTestClient

class ProductCreationApiCalls(
    private val webTestClient: WebTestClient
) {
    fun createProduct(productCreationDto: ProductCreationDto): WebTestClient.ResponseSpec {
        return webTestClient.post()
            .uri("/api/brand/products")
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .bodyValue(productCreationDto)
            .exchange()
    }
}