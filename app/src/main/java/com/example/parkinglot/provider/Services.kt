package com.example.parkinglot.provider

import com.example.parkinglot.*
import java.util.*


interface SlotService{
    fun assignVehicle(vehicle: Vehicle)
    fun removeVehicle(vehicle: Vehicle)
}

interface DisplayService{
    fun addDisplay():Boolean
    fun removeDisplay():Boolean
}

interface ParkingFloorService :  SlotService, PortalService, DisplayService{
    fun addSlot() : Boolean
    fun removeSlot() : Boolean
    fun isFull(): Boolean
}

interface PanelService {
    fun addPanel(): Boolean
    fun removePanel(): Boolean
}

interface PortalService {
    fun addPortal(): Boolean
    fun removePortal(): Boolean
}

interface LotService : PanelService, PortalService{
    fun addFloor(): Boolean
    fun removeFloor(): Boolean
    fun isFull(): Boolean
}

interface PayAndScanService : Payable, Scannable

interface AdminService{
    fun addParkingFloor(): Boolean
    fun addParkingSlot(): Boolean
    fun addPanel(): Boolean
    fun addParkingAttendantPortal(): Boolean
    fun addCustomerPortal(): Boolean
    fun updateParkingRates(): Boolean
}

interface ParkingFeesService {
    fun calculateParkingFees(issueDateAndTime: Date): Double
}

interface ChargingFeesService {
    fun calculateChargingFees(startTime: Date, endTime: Date): Double
}

interface FeesService : ParkingFeesService, ChargingFeesService