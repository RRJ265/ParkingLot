package com.example.parkinglot.factory

import com.example.parkinglot.provider.ScanByType
import com.example.parkinglot.strategy.Scan
import com.example.parkinglot.strategy.ScanByTicketNumber
import com.example.parkinglot.strategy.ScanByVehicleNumber

class ScanFactory {
    fun createScanner(scanByType: ScanByType):Scan{
        return when(scanByType){
            ScanByType.TICKET_NUMBER -> ScanByTicketNumber()
            ScanByType.VEHICLE_NUMBER -> ScanByVehicleNumber()
        }
    }
}