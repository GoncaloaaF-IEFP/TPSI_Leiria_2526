class Pessoa(var nome: String, var idade: Int) {

    constructor(nome: String) : this(nome, 0) {
        println("inicio do constructor")

        println(this.nome)
        println(this.idade)

        println("fim do constructor")
    }

    constructor() : this("Anonimo", 0) {
        println("inicio do constructor")

        println(this.nome)
        println(this.idade)

        println("fim do constructor")
    }


    init {
        println("inicio do init")

        println("Pessoa Criada")

        println("fim do init")
    }
}

