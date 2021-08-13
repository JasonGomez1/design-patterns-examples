package com.example.designpatternsexamples.structural.decorator

fun main() {
    println("-------------Driving OffRoadTruck------------------")
    OffRoadTruck().drive()

    println("-------------Driving OffRoadTruck with light bar------------------")
    LightBarDecorator(OffRoadTruck()).drive()

    println("-------------Driving OffRoadTruck with rear locker------------------")
    RearLockerDecorator(OffRoadTruck()).drive()

    println("-------------Driving OffRoadTruck with rear locker and light bar------------------")
    LightBarDecorator(RearLockerDecorator(OffRoadTruck())).drive()
}
