package com.dev.example.sandbox.sandbox.product.creation.api

import com.dev.example.sandbox.sandbox.product.creation.application.CreateProduct
import com.dev.example.sandbox.sandbox.product.creation.api.request.ProductCreationDto
import com.dev.example.sandbox.sandbox.product.creation.domain.ProductCreationResponse
import mu.KotlinLogging
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

private val logger = KotlinLogging.logger {}

@RestController
class ProductCreationEndpoint(
    private val createProduct: CreateProduct
) {
    @PostMapping(
        "/api/brand/products",
        produces = [MediaType.APPLICATION_JSON_VALUE],
        consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    @ResponseStatus(HttpStatus.CREATED)
    fun createProduct(@RequestBody productCreationDto: ProductCreationDto): ProductCreationResponse {
        logger.info("Create a new product for: $productCreationDto")
        return createProduct.create(productCreationDto.toDomain())
    }
}
