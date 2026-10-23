fun task2() {
    val razmer = 5
    val massiv = Array(razmer) { IntArray(razmer) }
    println("Введи 5 строк по 5 чисел (через пробел):")
    var i = 0
    while (i < razmer) {
        val stroka = readlnOrNull()?.trim()
        if (stroka.isNullOrEmpty()) {
            println("Ты ничего не ввел!")
            return
        }
        val chasti = stroka.split(" ")
        if (chasti.size != razmer) {
            println("В строке должно быть ровно 5 чисел!")
            return
        }
        var j = 0
        var oshibka = false
        while (j < razmer) {
            val chislo = chasti[j].toIntOrNull()
            if (chislo == null) {
                println("'" + chasti[j] + "' - это не число!")
                oshibka = true
                break
            }
            massiv[i][j] = chislo
            j = j + 1
        }
        if (oshibka) return
        i = i + 1
    }
    println("Массив:")
    for (i in 0 until razmer) {
        var strokaVyvoda = ""
        for (j in 0 until razmer) {
            strokaVyvoda = strokaVyvoda + massiv[i][j].toString() + "  "
        }
        println(strokaVyvoda)
    }
    var simmetrichno = true
    for (i in 0 until razmer) {
        for (j in i + 1 until razmer) {
            if (massiv[i][j] != massiv[j][i]) {
                simmetrichno = false
            }
        }
    }
    if (simmetrichno) {
        println("Массив симметричен относительно главной диагонали")
    } else {
        println("Массив НЕ симметричен")
    }
}