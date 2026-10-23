fun task1() {
    println("Сколько строк?")
    val kolStrok = readlnOrNull()?.trim()?.toIntOrNull()
    if (kolStrok == null || kolStrok <= 0) {
        println("Нужно положительное число!")
        return
    }
    println("Сколько столбцов?")
    val kolStolbcov = readlnOrNull()?.trim()?.toIntOrNull()
    if (kolStolbcov == null || kolStolbcov <= 0) {
        println("Нужно положительное число!")
        return
    }
    val tablica = Array(kolStrok) { IntArray(kolStolbcov) }
    for (i in 0 until kolStrok) {
        for (j in 0 until kolStolbcov) {
            println("Введи трёхзначное число:")
            val znachenie = readlnOrNull()?.trim()?.toIntOrNull()
            if (znachenie == null || znachenie !in 100..999) {
                println("Нужно трёхзначное число!")
                return
            }
            tablica[i][j] = znachenie
        }
    }
    println("Массив:")
    for (i in 0 until kolStrok) {
        for (j in 0 until kolStolbcov) {
            print(tablica[i][j].toString() + "  ")
        }
        println()
    }
    val naborCifr = mutableSetOf<Int>()
    for (i in 0 until kolStrok) {
        for (j in 0 until kolStolbcov) {
            var ostatok = tablica[i][j]
            while (ostatok > 0) {
                naborCifr.add(ostatok % 10)
                ostatok /= 10
            }
        }
    }
    println("В массиве использовано " + naborCifr.size + " различных цифр")
}