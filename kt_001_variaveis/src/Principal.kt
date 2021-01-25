import java.lang.StringBuilder

fun main() {
    var idade:Int
    var preco: Float
    var quantidade: Double
    var nome: String
    val nome2: StringBuilder

    idade = 10
    preco = 9.9F
    quantidade = 5.6
    
    nome = "Hugo1" + "Hugo2" + "Hugo3"
    nome2 = StringBuilder()
    nome2.append("Hugo1").append("Hugo2").toString()

    println(idade.toFloat())

    println(nome)
    println(nome2.toString())
}

//fun sHugo(txt: Int) {
//
//}

//fun sHugo(txt: String) {
//
//}