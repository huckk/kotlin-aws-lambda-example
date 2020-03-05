package com.huckk

import com.amazonaws.services.lambda.runtime.Context
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.runners.MockitoJUnitRunner
import kotlin.test.assertEquals

@RunWith(MockitoJUnitRunner::class)
class HandlerTest{
    @Mock private lateinit var service: Service
    @Mock private lateinit var context: Context
    private lateinit var handler: Handler

    @Before
    fun setup(){
        handler = Handler(service)
    }

    @Test
    fun `handle`(){
        val expected = "something other than hello world"
        whenever(service.getHelloWorld()).thenReturn(expected)

        val result = handler.handleRequest("whatever your request is, could be an object", context)

        assertEquals(expected, result)
    }
}