fun task5() {
    println("Введи слова через пробел (например: eat tea tan ate nat bat):")
    val vvod = readlnOrNull()?.trim()
    if (vvod.isNullOrEmpty()) {
        println("Пустой ввод!")
        return
    }
    val slova = vvod.split(" ")
    for (s in slova) {
        if (s.isEmpty()) {
            println("Есть пустое слово — проверь пробелы!")
            return
        }
    }
    val gruppy = mutableMapOf<String, MutableList<String>>()
    for (slovo in slova) {
        val bukvy = slovo.toCharArray()
        bukvy.sort()
        val klyuch = bukvy.concatToString()
        gruppy.getOrPut(klyuch) { mutableListOf() }.add(slovo)
    }
    println("Группы:")
    for (spisok in gruppy.values) {
        println(spisok)
    }
}