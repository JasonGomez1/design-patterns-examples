package com.example.designpatternsexamples.behavioral.strategy

class NoQuack: IQuackStrategy {
    override fun quack() {
        println("No quack")
    }
}