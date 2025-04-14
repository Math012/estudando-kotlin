package operacoes_com_colecoes_kotlin.ordenacao

fun main() {

    val listaNomes = listOf("Zoe","Cesar","Bruno","Amanda")
    val listaNumeros = listOf(2,1,3)

    // ordem ascendente
    val listaOrdenadaAscNumeros= listaNumeros.sorted()
    val listaOrdenadaAscNomes = listaNomes.sorted()


    println("Resultados Ascendente\n")
    println("lista de numeros em ASC: $listaOrdenadaAscNumeros")
    println("lista de nomes em ASC: $listaOrdenadaAscNomes")
    println("\n")
    // ordem descendente
    println("Resultados Descendente\n")
    val listaOrdenadaDescNumeros= listaNumeros.sortedDescending()
    val listaOrdenadaDescNomes = listaNomes.sortedDescending()

    println("lista de numeros em DESC: $listaOrdenadaDescNumeros")
    println("lista de nomes em DESC: $listaOrdenadaDescNomes")
}