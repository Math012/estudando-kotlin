package escopo_de_funcao

/*
    Funções de Escopo

    Let -> Comumente utilizado para validações de Null, permite alterar um
    objeto e caso necessário retorne o objeto alterado.

    Run -> Útil para inicializar um objeto e realizar algumas operações nele.

    With -> Parecido com o Run, é usado para alterar propriedades de um objeto,
    mas tem uma sintaxe diferente.

    Apply -> Comumente utilizado para aplicar configurações em objetos.

    Also -> Quando você ver "also" no código, você pode ler "e também faça isso
    com o objeto", comumente utilizado para executar ações sem modificar o objeto.
 */

data class Produto(
    var nome: String,
    var preco: Double
    )

fun salvarProduto(produto: Produto){

}

fun main() {

    var produto: Produto? = null
    produto = Produto("Notebook", 1200.00)

    // Comumente utilizado para validações de Null, permite alterar um objeto e caso necessário retorne o objeto alterado.
    // fazendo a mesma verificação que um if, se o produto existir, ele atribui o novo valor ao preço
    produto?.let {produto ->
        produto.preco = 1100.00
        produto.nome = "Notebook com desconto aplicado"
        salvarProduto(produto)
    }



    // utilizando let sem retorno linha 36
    println(produto?.nome)
    println(produto?.preco)

    // utilizando let com retorno

    // A função let pode retornar o valor para uma variavel, exemplo abaixo:
    val novoProduto = produto?.let {produto ->
        produto.preco = 1000.00
        produto.nome = "Notebook com desconto aplicado (Novo produto)"
        salvarProduto(produto)
        produto
    }

    println(novoProduto?.nome)
    println(novoProduto?.preco)
}