fun main() {

    val colecao = arrayOf(1, "Hugo", true)

    for (item in colecao) {
        when (item) {
            is Int -> {
                println("Valor Inteiro $item")
            }
            is String -> {
                println("Valor Texto $item")
            }
            else -> {
                println("Valor Booleano $item")
            }
        }
    }

    // mudar os item, mas NAO POSSO INCLUIR MAIS UM ITEM
    val colecaoNomes1 = arrayOf("Hugo", "Cassia", "Pedro") // buffer -> 10MB -> stream
    colecaoNomes1[0] = "Thomas"

    // incluir e alterar os elementos da minha colecao
    val colecaoNomes2 = arrayListOf("Hugo", "Cassia", "Pedro") // lista
    colecaoNomes2[0] = "Thomas"
    colecaoNomes2.add("Japa")

    val colecaoNomes3 = arrayListOf<String>() // vazia

    val colecaoFuncionarios = arrayListOf<Funcionario>()

    val f1 = Funcionario(10L, "Hugo", 53, "casado")
    val f2 = Funcionario(10L)
    val f3 = Funcionario(estadoCivil = "solteiro", id = 40)
    f3.exibirCC()
    f1.nome = "Hugo"






}