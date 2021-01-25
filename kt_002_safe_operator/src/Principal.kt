fun main() {
    val a = "Kotlin"
    var b:String? = null

    println(a.length)
    //println(b!!.length) // nois ta se sentindo confiante. Deixa com nois.
    println(b?.length ?: -1) // nois ta se sentindo confiante. Deixa com nois.

    // converter -1 "asdfasfasdfasdf
}