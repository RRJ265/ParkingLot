package com.example.parkinglot.strategy

import com.example.parkinglot.ParkingRates
import com.example.parkinglot.provider.ChargingFeesService
import com.example.parkinglot.provider.FeesService
import com.example.parkinglot.provider.ParkingFeesService
import java.util.*


class FeesImpl : FeesService {

    override fun calculateParkingFees(issueDateAndTime: Date): Double {
        return ParkingFeesImpl().calculateParkingFees(issueDateAndTime)
    }

    override fun calculateChargingFees(startTime: Date, endTime: Date): Double {
        return ChargingFeesImpl().calculateChargingFees(startTime, endTime)
    }
}

private class ParkingFeesImpl : ParkingFeesService {

    private val parkingRates = ParkingRates

    override fun calculateParkingFees(issueDateAndTime: Date): Double {
        TODO("Not yet implemented")
    }

}

private class ChargingFeesImpl : ChargingFeesService {
    override fun calculateChargingFees(startTime: Date, endTime: Date): Double {
        TODO("Not yet implemented")
    }
}

