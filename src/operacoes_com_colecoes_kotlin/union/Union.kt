package operacoes_com_colecoes_kotlin.union

fun main() {

    // Unindo duas listas em uma só
    val listaLanche = listOf("Hambúrguer", "Batata frita")
    val listaLanche2 = listOf("Hambúrguer", "Batata frita")
    val listaEntradas = listOf("Coxa de frango", "Pipoca")
    val listaEntradas2 = listOf("Coxa de frango", "Pipoca")
    val novaLista = listaLanche.union(listaEntradas)

    println(novaLista)

    // outra alternativa utilizando (+)
    val novaLista2 = listaLanche2 + listaEntradas2
    println(novaLista2)

}