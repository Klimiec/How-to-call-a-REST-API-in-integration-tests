package com.dev.example.sandbox.sandbox.product.creation.application

import com.dev.example.sandbox.sandbox.product.creation.domain.ProductCreationRequest
import com.dev.example.sandbox.sandbox.product.creation.domain.ProductCreationResponse
import org.springframework.stereotype.Service

@Service
class CreateProduct {
    fun create(productCreationRequest: ProductCreationRequest): ProductCreationResponse {
        /*
         Complex logic for product creation
         */
        return ProductCreationResponse(productCreationRequest.productId.productId)
    }
}