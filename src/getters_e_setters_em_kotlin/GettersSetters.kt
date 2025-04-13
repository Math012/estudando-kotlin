package getters_e_setters_em_kotlin

class Pessoa{
    // Utilizando getters e setters em kotlin através do field
    var nome: String = ""
        get() {
            println("get: $field")
            return field
        }
        set(value) {
            println("set: $value")
            field = "novo valor: $value"
        }
    var idade: Int = 0
        get() {
            println("get $field")
            return field
        }
        set(value) {
            println("set: $value")
            field = value
        }
}

fun main(){
    val pessoa = Pessoa()

    pessoa.nome = "Matheusss"
    pessoa.idade = 26

    println("Apenas recuperando")
    println(pessoa.nome)
    println(pessoa.idade)


}