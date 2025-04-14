package usando_map_em_kotlin

data class Produto(
    val nome: String
)



fun main(){
    val lista = mapOf(109030 to "Monitor LCD", 903010 to "Motorola")
    // utilizando objetos
    val mutableLista = mutableMapOf(
        "109030" to Produto("Capinha de celular").nome,
        "903010" to Produto("Carregador portátil").nome)

    lista.forEach { produto ->
        println("Código: ${produto.key} - Produto: ${produto.value}")

    }

    println("Lista mutavel")

    mutableLista.forEach { produto ->
        println("Código: ${produto.key} - Produto: ${produto.value}")

    }
    println("\n################# Operações utilizando map ######################")
    println("Operações mutable map")
    println("Buscando produto pela chave: ${mutableLista["109030"]}")
    println("Tamanho da mutable map: ${mutableLista.size}")
    println("Adicionando items na lista com .put")
    // uma versao do put: mutableLista.put("787878", "Tenis")
    mutableLista["787878"] = "Tenis"
    println("Utilizando o .remove")
    mutableLista.remove("787878")

    println("\n################# Exibindo a lista após as operações ######################")

    mutableLista.forEach { produto ->
        println("Código: ${produto.key} - Produto: ${produto.value}")

    }
}