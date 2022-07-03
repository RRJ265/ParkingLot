package com.example.parkinglot.factory

import com.example.parkinglot.ParkingSlot

enum class SlotType{
    COMPACT,
    LARGE,
    BIKE,
    HANDICAPPED,
    ELECTRIC
}

class SlotFactory {
    fun createSlot(slotType: SlotType) : ParkingSlot{
        when(slotType){
            SlotType.COMPACT -> TODO()
            SlotType.LARGE -> TODO()
            SlotType.BIKE -> TODO()
            SlotType.HANDICAPPED -> TODO()
            SlotType.ELECTRIC -> TODO()
        }
    }

    fun createSlots() : MutableList<ParkingSlot>{
        return mutableListOf<ParkingSlot>()
    }
}