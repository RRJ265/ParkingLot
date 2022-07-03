package com.example.parkinglot.strategy

import com.example.parkinglot.ParkingTicket



abstract class Scan{
    abstract fun scanParkingTicket(number:String) : ParkingTicket
}

class ScanByTicketNumber() : Scan(){

    override fun scanParkingTicket(number: String): ParkingTicket {
        TODO("Not yet implemented")
    }
}

class ScanByVehicleNumber() : Scan(){


    override fun scanParkingTicket(number: String): ParkingTicket {
        TODO("Not yet implemented")
    }
}