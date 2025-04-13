package encadeamento_de_metodos_e_toast


// como o Toast funciona

class Mensagem(
    val mensagem: String,
    val duracao: Int
) {
    companion object{
        const val DURACAO_CURTA = 0
        const val DURACAO_LONGA = 1
        /*
            Para acessar este metodo não precisa instanciar a classe. Com isso
            podemos solicitar os parametros que desejamos receber.
         */
        fun construitTexto(mensagem: String, duracão: Int): Mensagem{
            return Mensagem(mensagem,duracão)
        }
    }
    /*
        Para fazer o encadeamento de metodos, temos que deixa o metodo
        que ira fazer o encadeamento fora do companion object, porque
        o metodo do companion object ira retornar uma instancia da classe
        e após retornar a instancia, podemos acessar os metodos que estão no
        corpo da classe.
     */
    fun exibir(){
        println("Mensagem: ${this.mensagem} duração: ${this.duracao}")
    }
}


fun main(){
    Mensagem.construitTexto(
        "ola",
        Mensagem.DURACAO_LONGA
    ).exibir()
}