class FuncionarioBk2 {
    // this representa a classe onde eu estou
    // Tipo Customizado
    var id: Long
    var nome: String
    var idade: Int
    var estadoCivil: String

    constructor() { // construtor vazio
        id = -1L
        nome = ""
        idade = -1
        estadoCivil = "" // inicializacao default
    }

    constructor(id: Long, nome: String, idade: Int, estadoCivil: String) {
        this.id = id
        this.nome = nome
        this.idade = idade
        this.estadoCivil = estadoCivil
    }
}