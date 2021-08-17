package com.example.designpatternsexamples.behavioral.strategy

class Duck(private val quack: IQuackStrategy, private val fly: IFlyStrategy) {
    fun quack() {
        quack.quack()
    }

    fun fly() {
        fly.fly()
    }
}
