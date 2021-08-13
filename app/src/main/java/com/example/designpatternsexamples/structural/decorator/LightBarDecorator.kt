package com.example.designpatternsexamples.structural.decorator

class LightBarDecorator(truck: Truck) : Decorator(truck) {

    override fun drive() {
        turnLightBarOn()
        super.drive()
    }

    private fun turnLightBarOn() {
        println("Light bar is on")
    }
}
