package com.example.parkinglot.strategy

import com.example.parkinglot.PaymentStatus

abstract class Payment {

    open var paymentStatus: PaymentStatus = PaymentStatus.NOT_INITIATED

    abstract fun pay(fees: Double)

}

class Cash : Payment() {

    override fun pay(fees: Double) {
        TODO("Not yet implemented")
    }

}

class Credit : Payment() {

    override fun pay(fees: Double) {
        TODO("Not yet implemented")
    }

}