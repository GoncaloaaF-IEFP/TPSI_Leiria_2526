

fun main() {

    val idades = arrayOf(12,31,14,29)
    println(idades)
    println(idades[2])

    println("-----")
    for (idade in idades) {
        println(idade)
    }
    println("-----")

    idades.sort() // inplace

    println("-----")
    for (idade in idades) {
        println(idade)
    }

    println("-----")

    println(idades[3])
    println(idades.get(3))

    println("-----")
   // println(idades[31])
   // println(idades.get(13))
    println(idades.getOrNull(1))
    println(idades.getOrElse(1){-1})

    println("-----")


    val idades2 = intArrayOf(12,31,14,29)
    floatArrayOf(1.12f,12.5f,4f)
    doubleArrayOf(12.4,31.0, 321.31)

    // como alterar valores no array
    println(idades.getOrNull(1))
    idades[1] = 99
    println(idades.getOrNull(1))


    idades.set(1, 88)
    println(idades.getOrNull(1))

    // Crie um array de nomes

    val nomes = arrayOf("Nome 1", "nome 2", "nome 3")

    // Lista dinamica

    val nomes2 = mutableListOf("Nome 1", "nome 2", "nome 3")

    println(nomes2)

    for (nome in nomes2) {
        println(nome)
    }

    println("--------------------")

    println(nomes2)

    nomes2.add("Ana Maria")

    println(nomes2)

    nomes2.remove("Nome 1")

    println(nomes2)

    nomes2.removeAt(1)

    println(nomes2)

    nomes2.reversed() // inplace
    nomes2.reverse() // return

    nomes2.addFirst("Bianca")

    println(nomes2)

    nomes2.addAll(arrayOf("Ana", "Rita", "Daniel"))

    println(nomes2)

    nomes2.add(3, "Joana")
    println(nomes2)

    nomes2.addAll(1, arrayOf("Ana 2", "Rita 2", "Daniel 2").toList())

    println(nomes2)

    println(nomes2.count())
    println(nomes2.size)

    nomes2.add(3, "Joana")

    println(nomes2.count())
    println(nomes2.size)


    var listNomes = emptyArray<String>()


    var listNomes2: Array<String> = emptyArray<String>()


    // map

    val aeroportos = mapOf(
        "LIS" to "Lisboa",
        "Dub" to "Dublin",
        "FOR" to "Fortaleza")
    // adicionar por exp - "PTM" to "Portimão" de forma dinâmica

    println(aeroportos["LIS"])
    println(aeroportos.get("LIS"))


    for (aeroporto in aeroportos) {
        println(aeroporto.key)
        println(aeroporto.value)
    }


    val aeroportos2 = mutableMapOf(
        "LIS" to "Lisboa",
        "Dub" to "Dublin",
        "FOR" to "Fortaleza")
    println(aeroportos2)

    aeroportos2["LHR"] = "Heathrow"


    println(aeroportos2)

}