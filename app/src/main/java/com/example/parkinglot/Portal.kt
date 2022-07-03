package com.example.parkinglot

import com.example.parkinglot.factory.PaymentFactory
import com.example.parkinglot.factory.ScanFactory
import com.example.parkinglot.provider.PayAndScanService
import com.example.parkinglot.provider.ScanByType


abstract class Portal : PayAndScanService {

    private val paymentFactory = PaymentFactory()
    private val scanFactory = ScanFactory()

    override fun processPayment(fees: Double, paymentType: PaymentType) {
        val payment = paymentFactory.createPayment(paymentType)
        payment.pay(fees)
    }

    override fun scanTicket(number: String, scanByType: ScanByType): ParkingTicket {
        val scanner = scanFactory.createScanner(scanByType)
        return scanner.scanParkingTicket(number)
    }
}

class AttendantPortal : Portal()
class CustomerPortal : Portal()