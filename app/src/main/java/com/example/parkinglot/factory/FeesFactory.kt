package com.example.parkinglot.factory

import com.example.parkinglot.provider.FeesService
import com.example.parkinglot.strategy.FeesImpl

class FeesFactory {

    fun createFeesCalculator(): FeesService {
        return FeesImpl()
    }
}