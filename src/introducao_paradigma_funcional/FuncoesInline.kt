package introducao_paradigma_funcional

// FUNÇÃO INLINE SEM RETORNO
//fun subtrair() = println(10 - 8)

// FUNÇÃO INLINE COM RETORNO
fun subtrair(): Int = 10 - 8


fun main(){
    val numero = subtrair()
    println(numero)
}