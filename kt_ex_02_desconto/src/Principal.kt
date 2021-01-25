fun main() {
    val idade = 50.0

    val desconto = when {
        (idade >= 50.0) -> {
            30.0
        }
        (idade < 50.0 && idade >= 25.0) -> {
            15.0
        }
        else -> {
            5.0
        }
    }

}