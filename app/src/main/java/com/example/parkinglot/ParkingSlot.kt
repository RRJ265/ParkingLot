package com.example.parkinglot

import com.example.parkinglot.provider.SlotService

abstract class ParkingSlot(open val slotNumber: String) : SlotService{

    private var vehicle: Vehicle? = null

    override fun assignVehicle(vehicle: Vehicle) {
        TODO("Not yet implemented")
    }

    override fun removeVehicle(vehicle: Vehicle) {
        TODO("Not yet implemented")
    }

    fun isFree(): Boolean {
        return vehicle == null
    }
}

class CompactParkingSlot(override val slotNumber: String) : ParkingSlot(slotNumber)
class LargeParkingSlot(override val slotNumber: String) : ParkingSlot(slotNumber)
class BikeParkingSlot(override val slotNumber: String) : ParkingSlot(slotNumber)
class HandiCappedParkingSlot(override val slotNumber: String) : ParkingSlot(slotNumber)
class ElectricParkingSlot(override val slotNumber: String) : ParkingSlot(slotNumber){
    var electricPanel: ElectricPanel = ElectricPanel()
}

