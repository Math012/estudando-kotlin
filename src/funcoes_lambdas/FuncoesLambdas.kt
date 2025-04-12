package funcoes_lambdas

class Botao{

    // criando uma função que não possui retorno e que pode executar qualquer ação do usuário
    fun configurarClickBotao(funcao: () -> Unit){
        // chamando a função configurarClickBotao() para que ela seja executado
        funcao()
    }
}


fun main(){

    val botao = Botao();

    // Criando uma função lambda para executar o método

    botao.configurarClickBotao {
        println("Executou o botão através da função lambda")
    }


    // criando a função lambda e atribuindo a função em uma variavel
    val funcaoLambda = {
        println("executando função lambda")
    }

    // executando a função lambda
    funcaoLambda()

    // Criando uma função lambda com parametro
    val funcaoLambdaComParametros = { nome: String ->
        println("O nome escolhido através da função lambda: $nome")
    }

    funcaoLambdaComParametros("Matheus")

}