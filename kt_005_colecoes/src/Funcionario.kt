open class Funcionario(
    var id: Long = -1L,
    var nome: String = "",
    var idade: Int = -1,
    private val estadoCivil: String = "",
    private val cc: String = "",
    private val cc_last_4_digit: String = "xxxx xxxx xxxx 7889"

) {

    open fun exibirCC() : String {
        return cc
    }


}
