package com.dev.example.sandbox.sandbox.product.api

import com.dev.example.sandbox.sandbox.common.BaseIntegrationTest
import com.dev.example.sandbox.sandbox.product.creation.domain.ProductCreationResponse
import org.junit.jupiter.api.Test
import org.springframework.http.MediaType

class ProductCreationEndpointTest : BaseIntegrationTest() {

    @Test
    fun `should create a new product`() {
        // given
        val productCreationRequest = CreateProductApiFixture.productCreationDto

        // when
        val response = api()
            .productCreation()
            .createProduct(productCreationRequest)

        // then
        response.expectStatus().isCreated
            .expectHeader()
            .contentType(MediaType.APPLICATION_JSON)
            .expectBody(ProductCreationResponse::class.java)
            .isEqualTo(ProductCreationResponse("sampleProductId"))
    }
}

