package com.example.daggerexample_22

import javax.inject.Inject

class Activity {


//     var keyboard:Keyboard = DaggerNewComponent.create().getKeyboard()
//     var mouse:Mouse = DaggerNewComponent.create().getMouse()
//     var monitor:Monitor = DaggerNewComponent.create().getMonitor()

    // Это относится к способу с inject
    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }

}