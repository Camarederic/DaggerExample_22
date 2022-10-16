package com.example.daggerexample_22

class Component {

    // 1-ый способ через функцию get()
    // Но этот способ непредпочтительный
    private fun getComputer(): Computer {
        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()
        val computerTower = ComputerTower(
            Storage(),
            Memory(),
            Processor()
        )
        return Computer(monitor, computerTower, keyboard, mouse)
    }

    // 2-ой способ через функцию inject()
    // Лучше использовать этот способ
    fun inject(mainActivity: MainActivity){
        mainActivity.computer = getComputer()
        mainActivity.keyboard = Keyboard()

    }


}