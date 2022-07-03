package com.example.parkinglot

import com.example.parkinglot.factory.*
import com.example.parkinglot.provider.LotService


abstract class Lot(open val name: String, open val address: Address) : LotService

class ParkingLot(override val name: String, override val address: Address) : Lot(name, address) {

    private var floors: MutableList<Floor>
    private lateinit var panels: MutableList<Panel>
    private var attendantPortal: Portal

    private val floorFactory = FloorFactory()
    private val panelFactory = PanelFactory()
    private val portalFactory = PortalFactory()

    init {
        floors = floorFactory.createFloors(FloorType.PARKING_FLOOR)
        panels.add(panelFactory.createPanel(PanelType.ENTRY))
        panels.add(panelFactory.createPanel(PanelType.EXIT))
        attendantPortal = portalFactory.createPortal(PortalType.ATTENDANT)
    }

    override fun addFloor(): Boolean {
        TODO("Not yet implemented")
    }

    override fun removeFloor(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isFull(): Boolean {
        return floors.none {
            it.isFull()
        }
    }

    override fun addPanel(): Boolean {
        TODO("Not yet implemented")
    }

    override fun removePanel(): Boolean {
        TODO("Not yet implemented")
    }

    override fun addPortal(): Boolean {
        TODO("Not yet implemented")
    }

    override fun removePortal(): Boolean {
        TODO("Not yet implemented")
    }

}

class ParkingRates {
    companion object ParkingRates {
        var FIRST_HOUR = 4
        var SECOND_HOUR = 3.5
        var THIRD_HOUR = 3.5
        var OTHER_HOUR = 2.5
    }
}

class Address {
    lateinit var street: String
    lateinit var area: String
    lateinit var city: String
    lateinit var state: String
    lateinit var zipcode: String
}