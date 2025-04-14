package operacoes_com_colecoes_kotlin.filter

fun main() {

    val listaFrutas = listOf("Maça", "Laranja", "Banana")
    val listaVendas = listOf(100, 500, 1500, 800, 650, 150)

    val novaListaFrutas = listaFrutas.filter { fruta ->
        fruta == "Banana"
    }

    val novaListaVendas = listaVendas.filter { venda ->
        venda > 600
    }


    println("-----")
    println(novaListaFrutas)
    println("-----")
    println(novaListaVendas)
}