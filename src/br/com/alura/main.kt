package br.com.alura

fun main() {
    val nomes: Collection<String> = listOf(
        "Gabriel",
        "Darlan",
        "Sonya",
        "Jhony Cage",
        "Ryu",
        "Goku"
    )

    for (nome in nomes) {
        println(nome)
    }

    println("Tem o nome Gabriel? ${nomes.contains("Gabriel")}")
    println("Tamanho da coleção: ${nomes.size}")

}