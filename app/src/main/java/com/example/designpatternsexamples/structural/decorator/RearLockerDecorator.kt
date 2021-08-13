package com.example.designpatternsexamples.structural.decorator

class RearLockerDecorator(truck: Truck): Decorator(truck) {

    override fun drive() {
        engageRearLocker()
        super.drive()
    }

    private fun engageRearLocker() {
        println("Rear locker is engaged")
    }

}
