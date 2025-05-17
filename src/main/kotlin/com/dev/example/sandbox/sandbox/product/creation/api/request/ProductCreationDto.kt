package com.dev.example.sandbox.sandbox.product.creation.api.request

import com.dev.example.sandbox.sandbox.product.creation.domain.ProductCreationRequest
import com.dev.example.sandbox.sandbox.product.creation.domain.ProductId

data class ProductCreationDto(
    val productId: String
    // other fields
) {
    fun toDomain(): ProductCreationRequest {
        return ProductCreationRequest(ProductId(productId))
    }
}