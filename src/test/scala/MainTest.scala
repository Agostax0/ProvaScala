package it.unibo.ProvaScala

import org.junit.Assert.assertEquals
import org.junit.Test

class MainTest:
    var myVar: Int = 1

    @Test def isMyVarEqualsOne(): Unit =
        assertEquals(1, myVar)