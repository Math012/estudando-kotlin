package desestruturacao

// classes de dados precisam ter um construtor
data class Pergunta1(val pergunta: String, val respostaCerta: Int)

fun main(){
    val pergunta1 = Pergunta1("Qual a resposta da pergunta 2 ?", 2)
    val pergunta2 = Pergunta1("Qual a resposta da pergunta 2 ?", 2)

    /*
        A desestruturação (Destructuring) utiliza uma data class, onde podemos capturar os valores
        de uma data class e setar dentro uma ou mais variaveis
     */

    // exemplo
    val (pergunta, resposta) = pergunta1
    println(pergunta)
    println(resposta)

}