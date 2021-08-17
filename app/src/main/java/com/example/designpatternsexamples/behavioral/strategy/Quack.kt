package com.example.designpatternsexamples.behavioral.strategy

class Quack: IQuackStrategy {
    override fun quack() {
        println("Regular quack")
    }
}