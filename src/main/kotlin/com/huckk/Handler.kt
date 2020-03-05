package com.huckk

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class Handler(val service: Service = Service()) : RequestHandler<String, String>{
    override fun handleRequest(requestBody: String, context: Context): String {
        return service.getHelloWorld().onEach {
            println(it)
        }
    }
}
