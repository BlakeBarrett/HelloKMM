package com.blakebarrett.hellokmm

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}