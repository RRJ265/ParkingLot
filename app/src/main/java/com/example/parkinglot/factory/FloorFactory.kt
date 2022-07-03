package com.example.parkinglot.factory

import com.example.parkinglot.Floor
import com.example.parkinglot.ParkingFloor

enum class FloorType {
    PARKING_FLOOR
}

class FloorFactory {
    fun createFloor(floorType: FloorType): Floor {
        return when (floorType) {
            FloorType.PARKING_FLOOR -> ParkingFloor("F1")
        }
    }

    fun createFloors(floorType: FloorType): MutableList<Floor> {
        return when (floorType) {
            FloorType.PARKING_FLOOR -> mutableListOf<Floor>(createFloor(floorType))
        }
    }
}

