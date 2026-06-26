/*

 if - else if - else
 when
 while
 do-while
 range
 for



  */
fun main() {

    val nome: String // val - const
    var idade = 12 //  var - variavel

    println(idade)

    idade =  41
    println(idade)

    idade =  15
    println(idade)

    val soma = 10.2f + 12.41f
    println(soma)

    val div = 10 / 2f
    println(div)

    print("Nome: ")
  //  nome = readln()

    print("Idade: ")
  //   idade = readln().toInt()

//    println("O ${nome.lowercase().capitalize()} tem $idade anos")


    // faça uma app que peça 2 num e veja qual o maior (if)


    // faça uma app que peça 3 num e veja qual o maior (else if)


    // peça números ao utilizar até ser indicado um num negativo (While)

    println("Digite o numero: ")
//    var num = readln().toInt()
     var num = -1
    while(num > 0){
        println("Digite o numero: ")
        num = readln().toInt()
    }
    println("Número negativo indicado. Programa terminou.")

    /*
    if - else if - else
    while
    do-while
     */

    var i = 10

    when(i){
        10 -> println("um ")
        22 -> println("dois")
        else -> println("erro inesperado")
    }


    var resp =  when(i){
        10 -> "um "
        22 -> "dois"
        else -> "erro inesperado"
    }

    println(resp)


    val n1 = 20
    val n2 = 20

    var maior = when {
        n1 > n2 -> n1
        n2 > n1 -> n2
        else -> "Sao Iguais"
    }::class.simpleName


    println(maior)


    /*
    var j = "10"

    j = "12"

    j = 12
*/


    println("------------------------------------------")


    var r1 = 1..10 // 1 ao 10
    var r2 = 1..<10 // 1 ao 9

    println(r1)
    var r3 = 'a'..'c'
    for (n in r3) {
        print("$n ")
    }

    println("\n------------------------------------------")

    var arr = arrayOf(1,2,3,4,5) // array de C

    println(arr[2])
    arr[2] = 122
    println(arr[2])
    println(arr.get(2))

    println( arr.getOrNull(41))

    println("\n------------------------------------------")

    var arr2 = mutableListOf(1,2,3,4,5)

    println(arr2[2])
    arr2[2] = 122
    println(arr2[2])
    println(arr2.get(2))
    println(arr2.getOrNull(41))

    println("\n----")

    println(arr2)

    arr2.add(123)

    println(arr2)

    arr2.remove(4)

    println(arr2)

    arr2.removeAt(1)

    println(arr2)






}