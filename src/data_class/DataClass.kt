package data_class

// classes de dados precisam ter um construtor
data class Pergunta(val pergunta: String, val respostaCerta: Int)

fun main(){
    val pergunta1 = Pergunta("Qual a resposta da pergunta 2 ?", 2)
    val pergunta2 = Pergunta("Qual a resposta da pergunta 2 ?", 2)

    /*
        a data class é focada nos dados, fazendo uma comparação entre os dados das classes
        desconsiderando uma instância dos objetos
     */

    println(pergunta1 == pergunta2)

}