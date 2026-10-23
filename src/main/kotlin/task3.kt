fun task3() {
    val alfavit = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯ"
    val sdvigi = intArrayOf(
        21, 13, 4, 20, 22, 1, 25, 12, 24, 14, 2,
        28, 9, 23, 3, 29, 6, 16, 15, 11, 26, 5,
        30, 27, 8, 18, 10, 33, 31, 32, 19, 7, 17
    )
    println("Введи ключевое слово (например ПОЛЕ):")
    val klyuch = readlnOrNull()?.trim()?.uppercase()
    if (klyuch.isNullOrEmpty()) {
        println("Ключ не введён!")
        return
    }
    println("Введи текст для шифровки (например СООБЩЕНИЕ):")
    val tekst = readlnOrNull()?.trim()?.uppercase()
    if (tekst.isNullOrEmpty()) {
        println("Текст не введён!")
        return
    }
    val rezultat = StringBuilder()
    var poziciaKlyucha = 0
    for (bukva in tekst) {
        val indexBukvy = alfavit.indexOf(bukva)
        if (indexBukvy == -1) {
            rezultat.append(bukva)
            continue
        }
        val bukvaKlyucha = klyuch[poziciaKlyucha % klyuch.length]
        poziciaKlyucha = poziciaKlyucha + 1
        val indexKlyucha = alfavit.indexOf(bukvaKlyucha)
        val sdvig = sdvigi[indexKlyucha]
        val novayaPozicia = (indexBukvy + sdvig) % alfavit.length

        rezultat.append(alfavit[novayaPozicia])
    }
    println("Зашифрованный текст: " + rezultat.toString())
}