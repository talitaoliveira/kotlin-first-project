class Calculator {
    fun double(value: Int): Int {
        return value * 2
    }

    fun half(value: Int): Int {
        return value / 2
    }

    fun sum(numbers: Array<Int>): Int {
        return numbers.reduce{acc, number -> acc + number}
    }

}
