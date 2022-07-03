package com.example.parkinglot

enum class PaymentStatus {
    IN_PROGRESS, SUCCESS, FAIL, CANCEL, HOLD, INITIATED, NOT_INITIATED
}

enum class PaymentType {
    CASH,
    CREDIT
}

interface Payable {

    fun processPayment(fees: Double, paymentType: PaymentType)

}

