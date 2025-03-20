package diferenca_var_val

const val PI = 3.14159

fun main(){
    /*
        Quando utilizamos o "val" estamos dizendo que a variável é
        imutável.
     */
    val s1 : String = "Maria"
    println(s1)
    s1 = "José" // erro de compilação
    println(s1)

    /*
        Quando utilizamos o "var" estamos dizendo que a variável é
        mutável.
     */

    var s2 : String = "Matheus"
    println(s2)
    s2 = "Ana" // sem erro de compilação
    println(s2)

    /*
        Para declarar uma constante, ela precisa estar top level
        ou dentro de outra classe utilizando o companion object

        Exemplo de top level -> LINHA 3
        Exemplo de companion object -> LINHA 36
     */
}

class Exemplo{
    companion object{
        const val PI = 3.14159
    }
}