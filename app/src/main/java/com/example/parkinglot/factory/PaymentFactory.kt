package com.example.parkinglot.factory

import com.example.parkinglot.PaymentType
import com.example.parkinglot.strategy.Cash
import com.example.parkinglot.strategy.Credit
import com.example.parkinglot.strategy.Payment

class PaymentFactory {

    fun createPayment(paymentType: PaymentType): Payment {
        return when (paymentType) {
            PaymentType.CASH -> Cash()
            PaymentType.CREDIT -> Credit()
        }
    }
}