package utilizando_construtor

import introducao_paradigma_funcional.Usuario


class Usuario2 (
    var nome:String = "",
    var sobrenome:String= ""
){
    init {
        println("nome: $nome sobrenome: $sobrenome")
    }

  /*
        Podemos criar mais um construtor dentro da classe
        para criar o construtor utilizamos a palavra reservada
        construtor(), e caso a classe já tenha um construtor
        devemos refereciar o primeiro construtor dentro do segundo
   */

    constructor(nome:String) : this(nome,""){
        println("Construtor secundario")
    }


}

fun main(){
    val usuario = Usuario2("Matheus","Silva")
    println(usuario.nome)
    println(usuario.sobrenome)
}