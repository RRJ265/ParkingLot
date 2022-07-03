package com.example.parkinglot

import com.example.parkinglot.provider.AdminService

abstract class Account {
    open lateinit var firsName: String
    open lateinit var lastName: String
    open lateinit var address: Address
}

class Admin : Account() , AdminService{
    override fun addParkingFloor(): Boolean {
        TODO("Not yet implemented")
    }

    override fun addParkingSlot(): Boolean {
        TODO("Not yet implemented")
    }

    override fun addPanel(): Boolean {
        TODO("Not yet implemented")
    }

    override fun addParkingAttendantPortal(): Boolean {
        TODO("Not yet implemented")
    }

    override fun addCustomerPortal(): Boolean {
        TODO("Not yet implemented")
    }

    override fun updateParkingRates(): Boolean {
        TODO("Not yet implemented")
    }
}

class Attendant : Account()