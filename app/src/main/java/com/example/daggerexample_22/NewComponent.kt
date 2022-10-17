package com.example.daggerexample_22

@dagger.Component(modules = [ComputerModule::class])
interface NewComponent {

//    fun getKeyboard():Keyboard
//
//    fun getMouse(): Mouse
//
//    fun getMonitor():Monitor

    // Это способ с помощью функции inject()
    fun inject(activity: Activity)
}