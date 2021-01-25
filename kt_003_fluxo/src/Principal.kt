fun main() {
//    val id = 10
//    val indice = 10L
//
//    if (id >= 10) {
//        println("É maior")
//    } else {
//        println("É menor")
//        println("É nois")
//    }
//
//    if (id == 10) {
//        println("É igual")
//    } else if (id > 10) {
//        println("É maior")
//    } else {
//        println("É menor")
//    }
//
//
//    val valor = 100
//
//    var resultado = if (valor >= 100) {
//        "POSITIVO"
//    } else {
//        "NEGATIVO"
//    }
//
//    val sexo = "M" // radiobuttom o/f
//
//    when(sexo) {
//        "M" -> {
//            // afadfasdfasdf
//        }
//        "F" -> {
//            // adfasdfasdfasdf
//        }
//        else -> {
//            // firebase -> tracking - Log erro
//        }
//    }
//
//    val idade = 52
//
//    when {
//        (idade > 50) -> {
//
//        }
//        (idade == 50) -> {
//
//        }
//        else -> {
//
//        }
//    }
//
//    while(true) { // operacoes de leitura (arquivo local ou web(inputStream/outStream))
//        break
//    }

    var contador = 5

//    for (indice in 0 until contador step 2) {
//        println(indice)
//    }

//    for (indice in 0 until contador) {
//        println(indice)
//    }
//
//    println("------------------------------")
//
//    for (indice in 0..contador) {
//        println(indice)
//    }

    // Falso Fake -> Mock

//    val lista = arrayOf("Hugo", "Cassia", "Marcelo", "Ettore")
//
//    for (i in 0 until lista.size) {
//        println("${ lista[i]} - $i")
//    }

    val listaNomes = arrayListOf<String>() // lista de nomes vazia

    for (i in 1..5) {
        listaNomes.add("Nome - $i")
    }

    for(nome in listaNomes) { // foreach
        println(nome)
    }

    for (i in listaNomes.size-1 downTo 0) {
        println(listaNomes[i])
    }














}