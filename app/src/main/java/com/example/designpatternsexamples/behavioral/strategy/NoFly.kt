package com.example.designpatternsexamples.behavioral.strategy

class NoFly: IFlyStrategy {
    override fun fly() {
        println("No fly")
    }
}
