# kotlin-aws-lambda-example

## What is this?
This is a small sample project for how to get a Kotlin AWS Lambda 
running, without using DI frameworks like Dagger, Micronaut, 
or Spring. 

## Why?
Using a framework for something as simple as an AWS Lambda can
often be like smashing an ant with a hammer. Due to AWS's sdks,
building lambdas is very simple. 

## Why Kotlin? 
Default arguments make it easy to be able to inject mocks
from Mockito, Mockk or whatever your favorite mocking framework
is.

You can do the same thing using Java and setter, but personally,
I like the brevity of Kotlin a bit more for something like this.
 
## open
If you are not familiar, in Kotlin everything is Kotlin is final
so to allow mocks, it must be non-final, or open. 

There are plugins that do this always, the all-open on is the 
main one. It is not implemented here. 