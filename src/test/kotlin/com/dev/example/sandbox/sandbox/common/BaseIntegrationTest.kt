package com.dev.example.sandbox.sandbox.common

import com.dev.example.sandbox.sandbox.RestcallsApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest(
    classes = [RestcallsApplication::class],
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class BaseIntegrationTest {

    @Autowired
    lateinit var webTestClient: WebTestClient

    fun api()  = ApiCalls(webTestClient)
}