package com.example.parkinglot

enum class VehicleType {
    CAR, BIKE, VAN, TRUCK
}

class Vehicle(val vehicleNumber: Double, val vehicleType: VehicleType){

    fun assignTicket(parkingTicket: ParkingTicket){}
}