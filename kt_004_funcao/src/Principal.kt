// tabela de paramentros
var configuracao_texto = true // imagina isso vindo de um servidor

fun main() {
    var nome = "Impacta"
    println(fazerSaudacao(""))
    add2(10, 20)
    add2_2(20, 30)

    println("Hugo".DB(configuracao_texto))
    println(nome.DB(configuracao_texto))
}

fun fazerSaudacao(nome: String): String {
// Fortes candidatos a serem movidos para uma biblioteca externa
    if (nome.trim().isEmpty()) {
        return "Erro. Nome nao informado!!!"
    }

    return "Seja bem vindo ${nome.trim()}"
}

fun fazerSaudacao2(nome: String) { // engessou o metodo
    if (nome.trim().isEmpty()) {
        println("Erro. Nome nao informado!!!")
    } else {
        println("Seja bem vindo ${nome.trim()}")
    }
}

// Extension functions
fun String.DB(status: Boolean = true): String {
    return if (status) {
        this.trim().toUpperCase()
    } else {
        this.trim().toLowerCase()
    }
}

// passar a funcao como parametro





