package com.example.parkinglot.factory

import com.example.parkinglot.EntrancePanel
import com.example.parkinglot.ExitPanel
import com.example.parkinglot.Panel

enum class PanelType{
    ENTRY,
    EXIT
}

class PanelFactory {
    fun createPanel(panelType: PanelType) : Panel{
       return when(panelType){
            PanelType.ENTRY -> EntrancePanel()
            PanelType.EXIT -> ExitPanel()
        }
    }
}