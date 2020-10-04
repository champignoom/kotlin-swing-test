// http://zetcode.com/kotlin/swing/

package com.champignoom

import java.awt.EventQueue
import javax.swing.JFrame

class KotlinSwingExample(title: String): JFrame() {
    init {
        setTitle(title)
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(300, 200)
        setLocationRelativeTo(null)
    }
}

private fun createAndShowGUI() {
    val frame = KotlinSwingExample("Simple")
    frame.isVisible = true
}

fun main() {
    EventQueue.invokeLater(::createAndShowGUI)
}