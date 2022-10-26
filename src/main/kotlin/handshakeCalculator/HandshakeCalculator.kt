package handshakeCalculator

object HandshakeCalculator {

    fun calculateHandshake(number: Int): List<Signal> {
        val signalBuffer = mutableListOf<Signal>()

        if (number and 0b1 != 0) signalBuffer.add(Signal.WINK)
        if (number and 0b10 != 0) signalBuffer.add(Signal.DOUBLE_BLINK)
        if (number and 0b100 != 0) signalBuffer.add(Signal.CLOSE_YOUR_EYES)
        if (number and 0b1000 != 0) signalBuffer.add(Signal.JUMP)

        if (number and 0b10000 != 0) signalBuffer.reverse()

        return signalBuffer
    }
}