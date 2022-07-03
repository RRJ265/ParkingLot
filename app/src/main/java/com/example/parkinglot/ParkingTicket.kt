package com.example.parkinglot

import com.example.parkinglot.factory.FeesFactory
import java.util.*

enum class TicketStatus {
    PAID, UNPAID
}

class ParkingTicket(
    val ticketNumber: String,
    val parkingSlotNumber: String,
    val parkingFloorNumber: String,
    val issuedAt: Date,
    val payedAt: Date?,
    val ticketStatus: TicketStatus,
) {

    private val feesService = FeesFactory().createFeesCalculator()

    fun getParkingFees(): Double {
        return feesService.calculateParkingFees(issuedAt)
    }
}