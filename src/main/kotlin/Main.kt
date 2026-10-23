fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    var menu = true
    while (menu) {
        println()
        println(" МЕНЮ ")
        println("1) создание двумерного массива")
        println("2) симметричность матрицы")
        println("3) шифрование")
        println("4) общие числа в массивах")
        println("5) группировка слов")
        println("0) выйти")
        print("Номер пункта: ")
        val num = readlnOrNull()?.trim()?.toIntOrNull()
        when (num) {
            1 -> {task1()}
            2 -> {task2()}
            3 -> {task3()}
            4 -> {task4()}
            5 -> {task5()}
            0 -> {
                println("Выход из программы")
                menu = false
            }
            else -> println("Такого пункта нет")
        }
    }
}

