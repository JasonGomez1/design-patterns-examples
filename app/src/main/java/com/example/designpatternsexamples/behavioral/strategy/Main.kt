package com.example.designpatternsexamples.behavioral.strategy

fun main() {
    val quackStrategy = Quack()
    val noQuackStrategy = NoQuack()
    val flyStrategy = Fly()
    val noFlyStrategy = NoFly()
    val quackingFlyingDuck = Duck(quackStrategy, flyStrategy)
    val quietNoFlyingDuck = Duck(noQuackStrategy, noFlyStrategy)
    println("-------------Quacking flying duck behavior------------------")
    quackingFlyingDuck.quack()
    quackingFlyingDuck.fly()
    println("-------------Quiet no flying duck behavior------------------")
    quietNoFlyingDuck.quack()
    quietNoFlyingDuck.fly()
}
