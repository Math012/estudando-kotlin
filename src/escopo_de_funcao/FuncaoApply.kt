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

class AlertaMensagem{

    fun configurarTitulo(titulo: String) = println(titulo)
    fun configurarDescricao(descricao: String) = println(descricao)
    fun configurarCancelar(cancelar: String) = println(cancelar)
    fun configurarConfirmar(confirmar: String) = println(confirmar)
}

fun main() {

    val alertaMensagem = AlertaMensagem()
    /*
    alertaMensagem.configurarTitulo("Confirmar salvar?")
    alertaMensagem.configurarDescricao("Voce quer salvar?")
    alertaMensagem.configurarCancelar("Cancelar")
    alertaMensagem.configurarConfirmar("Confirmar")

     */

    // Utilizando diversos métodos em uma função de escopo
    // Diferente do run, o apply é indicado para aplicar configurações
    alertaMensagem.apply {
        configurarTitulo("Confirmar salvar?")
        configurarDescricao("Voce quer salvar?")
        configurarCancelar("Cancelar")
        configurarConfirmar("Confirmar")
    }
}