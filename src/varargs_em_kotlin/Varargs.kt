package varargs_em_kotlin


class Usuario{
    // utilizando varargs (em java String...)
    fun salvarTelefones(vararg telefones: String){
        for(telefone in telefones){
            println("Telefone: $telefone" )
        }
    }
}

fun main(){

    // utilizando var args

    val usuario = Usuario()
    usuario.salvarTelefones(
        "12312312312",
        "12312312312",
        "12312312312",
        "12312312312",
        "12312312312",
        "12312312312",
        "12312312312",
        "12312312312",
        "12312312312"
    )
}