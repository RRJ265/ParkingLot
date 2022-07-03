package com.example.parkinglot


import com.example.parkinglot.strategy.SlotStrategy
import com.example.parkinglot.provider.Displayable


class ParkingDisplay(private val slotStrategy: Array<SlotStrategy>) : Displayable {

    override fun displayAvailableSlots() {
        for (strategy in slotStrategy)
            strategy.availableSlots()
    }

    override fun displayMessage(message: String) {

    }

}
