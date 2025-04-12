package funcoes_lambdas


fun main(){

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