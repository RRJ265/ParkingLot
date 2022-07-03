package com.example.parkinglot.strategy

interface SlotStrategy{
    fun availableSlots():Int
}

class BikeEmptySlotsStrategy : SlotStrategy{

    override fun availableSlots(): Int {
        TODO("Not yet implemented")
    }

}

class CompactEmptySlotsStrategy : SlotStrategy{

    override fun availableSlots(): Int {
        TODO("Not yet implemented")
    }

}

class LargeEmptySlotsStrategy : SlotStrategy{

    override fun availableSlots(): Int {
        TODO("Not yet implemented")
    }

}

class ElectricEmptySlotsStrategy : SlotStrategy{

    override fun availableSlots(): Int {
        TODO("Not yet implemented")
    }

}

class HandiCappedEmptySlotsStrategy : SlotStrategy{

    override fun availableSlots(): Int {
        TODO("Not yet implemented")
    }

}