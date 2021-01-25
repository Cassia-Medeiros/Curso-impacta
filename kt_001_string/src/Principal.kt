


fun main() {

    val contador = 10
    val nome = "Impacta"
    //val resultado_1 = nome + " " + contador.toString()
    val resultado_1 = "$nome $contador"

    //val resultado_2 = nome + " " + contador.inc().toString()
    val resultado_2 = "$nome ${contador + 5}"

    println(resultado_1)
    println(resultado_2)

    // 1000,00 -> armazenado no banco de dados - ( 4 bytes 8 )
    // R$ 1.000,00 -> forma como eu gostaria de exibir a informacao ( 22 bytes )
    // 08715-000 -> 8715000

    // chamadaWeb ListaCartaoes -> object presentation ->

    // conversores *****

    // presentation
    // numero do cartao -> $$$$$adfads -> xxxx.xxxx.xxxx.3456
    // limite -> adfasdfd -> R$ 1.000,00
    // valor fatura -> adsfasdfadsf -> R$ 500,00
    // status -> D/C -> true/false
}