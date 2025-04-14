package operacoes_com_colecoes_kotlin.map

fun main() {
    val lista = listOf("Matheus","Ana","Jose","Alexis")

    // utilizando map para modificar uma lista
     val novaLista = lista.map { nome ->
         nome.uppercase()
     }

    novaLista.forEach { nome ->
        println(nome)
    }
}