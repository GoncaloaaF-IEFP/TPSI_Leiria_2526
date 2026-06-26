
/*

var
val

if else-if else
range
for
when



 */

fun main() {

    // funcs
    olaMundo()

    olaMundo("Gonçalo")
    olaMundo(nome="Gonçalo")

    olaMundo3("Gonçalo",2026)
    olaMundo3(nome = "Gonçalo",2026)

    olaMundo3(nome = "Gonçalo", ano = 2026)
    olaMundo3("Gonçalo", ano = 2026)
    olaMundo3(ano = 2026, nome = "Gonçalo")
    println("-------")
    olaMundo3()
    println("-------")
    println(olaMundo4(ano = 2000))

    val msg = olaMundo4(ano = 2012)
    println(msg)

    println("msg1: $msg")

    val s = soma(12,12)
    println(s)

    // crie 3 funcs em kotlin


}

fun olaMundo3(nome: String = "Sem Nome", ano: Int = 2026){
    println("Ola Mundo, $nome no ano de $ano")
}


fun olaMundo(){
    println("Ola Mundo")
}

fun olaMundo(nome: String){
    println("Ola Mundo, $nome")
}


// String olaMundo4(String nome, int ano){} <-- java
fun olaMundo4(nome: String = "Sem Nome", ano: Int = 2026): String{
   return "Ola Mundo, $nome no ano de $ano"
}


fun soma(a:Int, b:Int) = a + b