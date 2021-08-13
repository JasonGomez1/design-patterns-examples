package com.example.designpatternsexamples.structural.decorator

abstract class Decorator(private val truck: Truck): Truck {
    override fun drive() {
        truck.drive()
    }
}
