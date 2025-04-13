package classes_aninhadas_e_classes_internas


// classe aninhada ( NESTED CLASS )

class Motorista(val nome: String){
    fun exibirNome() = println("Motorista nested class: $nome")

    /*
        Para criar uma classe aninhada, ela precisa estabelecer uma relação
        com a classe que vai ser aninhada
     */
    class Caminhao(val nomeCaminhao: String){
        fun exibirNomeDoCaminhao() = println("Caminhão nested class: $nomeCaminhao")
    }
}

fun main2(){
    val motorista = Motorista("Matheus")
    // Estrutura da classe aninhada, mas a classe é totalmente independente
    val caminhao = Motorista.Caminhao("FGC")
    motorista.exibirNome()
    caminhao.exibirNomeDoCaminhao()
}

// Classe interna ( INNER CLASS )

class Motorista2(val nome: String){
    fun exibirNome() = println("Motorista inner class: $nome")

    /*
        As classes internas possui uma relação direta com a classe,
        podendo acessar seus atributos
     */
    inner class Caminhao2(val nomeCaminhao: String){
        fun exibirNomeDoCaminhao() = println("Caminhão inner class: $nomeCaminhao junto com o nome do motorista: $nome")
    }
}

fun main(){
    println("#################################")
    /*
        Estrutura da classe interna, diferente da classe aninhada, ela precisa
        de uma instancia da classe que ela esta dentro.
        exemplo abaixo
     */
     // Primeiro instanciamos a classe principal
    val motorista2 = Motorista2("Matheus")
    // A classe camainhao2 necessita da instancia do motorista2
    val caminhao2 = motorista2.Caminhao2("FGC42")
    motorista2.exibirNome()
    caminhao2.exibirNomeDoCaminhao()
}