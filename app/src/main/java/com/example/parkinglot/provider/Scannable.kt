package com.example.parkinglot.provider

import com.example.parkinglot.ParkingTicket

enum class ScanByType {
    TICKET_NUMBER,
    VEHICLE_NUMBER
}

interface Scannable {
    fun scanTicket(number: String, scanByType: ScanByType): ParkingTicket
}


