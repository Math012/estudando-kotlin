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

data class ProdutoWith(
    var nome: String,
    var preco: Double
){
    fun desativar(){
        println("Produto: $nome com preço $preco foi desativado")
    }
}
fun main() {
    var produto: ProdutoWith? = null

    produto = ProdutoWith("Televisão", 1400.00)

    // Parecido com o run, retorna o objeto.
    with(produto){
        desativar()
    }
}