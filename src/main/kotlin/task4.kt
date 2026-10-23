fun task4() {
    println("Введи первый массив (числа через пробел):")
    val vvod1 = readlnOrNull()?.trim()
    if (vvod1.isNullOrEmpty()) {
        println("Пустой ввод!")
        return
    }
    val massiv1 = mutableListOf<Int>()
    for (c in vvod1.split(" ")) {
        val chislo = c.toIntOrNull()
        if (chislo == null) {
            println("'" + c + "' - это не число!")
            return
        }
        massiv1.add(chislo)
    }
    println("Введи второй массив (числа через пробел):")
    val vvod2 = readlnOrNull()?.trim()
    if (vvod2.isNullOrEmpty()) {
        println("Пустой ввод!")
        return
    }
    val massiv2 = mutableListOf<Int>()
    for (c in vvod2.split(" ")) {
        val chislo = c.toIntOrNull()
        if (chislo == null) {
            println("'" + c + "' - это не число!")
            return
        }
        massiv2.add(chislo)
    }
    val schetchik = mutableMapOf<Int, Int>()
    for (x in massiv2) {
        if (schetchik.containsKey(x)) {
            schetchik[x] = schetchik[x]!! + 1
        } else {
            schetchik[x] = 1
        }
    }
    val peresechenie = mutableListOf<Int>()
    for (x in massiv1) {
        val ostalos = schetchik[x]
        if (ostalos != null && ostalos > 0) {
            peresechenie.add(x)
            schetchik[x] = ostalos - 1
        }
    }
    println("Пересечение: " + peresechenie)
}