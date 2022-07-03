package com.example.parkinglot.factory

import com.example.parkinglot.AttendantPortal
import com.example.parkinglot.CustomerPortal
import com.example.parkinglot.Portal

enum class PortalType {
    CUSTOMER,
    ATTENDANT
}

class PortalFactory {
    fun createPortal(portalType: PortalType): Portal {
        return when (portalType) {
            PortalType.CUSTOMER -> CustomerPortal()
            PortalType.ATTENDANT -> AttendantPortal()
        }
    }
}