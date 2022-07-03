package com.example.parkinglot

import com.example.parkinglot.factory.FeesFactory
import com.example.parkinglot.factory.PaymentFactory
import com.example.parkinglot.factory.ScanFactory
import com.example.parkinglot.provider.PayAndScanService
import com.example.parkinglot.provider.ScanByType
import java.util.*


abstract class Panel


class EntrancePanel : Panel() {

    fun printTicket() {
        TODO()
    }

}

class ExitPanel : Panel(), PayAndScanService {

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

class ElectricPanel : Payable {

    private val paymentFactory = PaymentFactory()
    private val feesService = FeesFactory().createFeesCalculator()
    private lateinit var startChargingTime: Date
    private lateinit var endChargingTime: Date

    fun startCharging() {
        startChargingTime = Date()
    }

    fun stopCharging() {
        endChargingTime = Date()
    }

    fun getChargingFees(): Double {
        return feesService.calculateChargingFees(startChargingTime, endChargingTime)
    }

    override fun processPayment(fees: Double, paymentType: PaymentType) {
        val payment = paymentFactory.createPayment(paymentType)
        payment.pay(fees)
    }

}





