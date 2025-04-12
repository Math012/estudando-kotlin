package funcos_parametros

class Matematica(){
    fun subtrair(nn1: Int, nn2: Int) : Int{
        return nn1 - nn2
    }
}

// criando uma função sem uma classe
fun somar(n1: Int, n2: Int) : Int{
    return n1 + n2
}

// criando uma função que recebe outra função como parametro
fun calcular( funcao: (Int, Int) -> Int,n3:Int, n4: Int) : Int{
    return funcao(n3 , n4)
}

fun calcularSubstracao( funcao: (Int, Int) -> Int, n3:Int, n4: Int) : Int{
    return funcao(n3 , n4)
}

fun main(){
    // Enviando uma função como parametro.
    // A função calcular precisa definir os parametros para que seja igual
    // a principal função >somar(n1, n2)<
    println("utilizando soma: ${calcular(::somar,100,100)}")

    // Caso a função esteja em uma classe, precisamos informar a instância.
    // da classe.
    val matematica = Matematica()

    println("utilizando subtração: ${calcularSubstracao(matematica::subtrair,100,100)}")

}