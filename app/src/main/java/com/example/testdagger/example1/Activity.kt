package com.example.testdagger.example1

import javax.inject.Inject


class Activity {

/*     private val component = DaggerNewComponent.create()

   @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var mouse: Mouse

    @Inject
    lateinit var monitor: Monitor*/

    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }

    /*val monitor = Monitor()
    val keyboard = Keyboard()
    val mouse = Mouse()
    val computerTower = ComputerTower(
        Storage(),
        Memory(),
        Processor()
    )
    val computer = Computer(monitor, computerTower, keyboard, mouse)*/
}