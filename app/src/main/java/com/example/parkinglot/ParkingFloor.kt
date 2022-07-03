package com.example.parkinglot

import com.example.parkinglot.factory.DisplayFactory
import com.example.parkinglot.factory.PortalFactory
import com.example.parkinglot.factory.PortalType
import com.example.parkinglot.factory.SlotFactory
import com.example.parkinglot.provider.Displayable
import com.example.parkinglot.provider.ParkingFloorService

abstract class Floor(open val name: String) : ParkingFloorService


class ParkingFloor(override val name: String) : Floor(name) {

    private var parkingDisplay: Displayable
    private var customerPortal: Portal
    private var parkingSlots: MutableList<ParkingSlot>

    private val slotFactory = SlotFactory()
    private val portalFactory = PortalFactory()
    private val displayFactory = DisplayFactory()

    init {
        parkingSlots = slotFactory.createSlots()
        customerPortal = portalFactory.createPortal(PortalType.CUSTOMER)
        parkingDisplay = displayFactory.createDisplay()
    }


    override fun addSlot(): Boolean {
        TODO("Not yet implemented")
    }

    override fun removeSlot(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isFull(): Boolean {
        return parkingSlots.none {
            it.isFree()
        }
    }

    override fun assignVehicle(vehicle: Vehicle) {
        TODO("Not yet implemented")
    }

    override fun removeVehicle(vehicle: Vehicle) {
        TODO("Not yet implemented")
    }

    override fun addPortal(): Boolean {
        TODO("Not yet implemented")
    }

    override fun removePortal(): Boolean {
        TODO("Not yet implemented")
    }

    override fun addDisplay(): Boolean {
        TODO("Not yet implemented")
    }

    override fun removeDisplay(): Boolean {
        TODO("Not yet implemented")
    }

    private fun updateDisplayMessage() {
        if (isFull())
            parkingDisplay.displayMessage("Parking is Full")
        else
            parkingDisplay.displayAvailableSlots()
    }


}