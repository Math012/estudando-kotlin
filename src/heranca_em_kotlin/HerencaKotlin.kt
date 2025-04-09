package heranca_em_kotlin

open class Animal{
    var cor: String = ""
    var tamanho:String = ""
    var peso:Double = 0.0

    open fun correr() = print("Correr como um ")
    open fun dormir() = println("Dormir")
}

class Cao : Animal(){
    fun latir() = println("Latir")

    // Utilizando a sobreposição
    override fun correr(){
        // Utilizando a implementação da classe pai
        super.correr()
        print("cachorro que está correndo com as quatro patas\n")
    }



}

class Passaro : Animal(){
    fun voar() = println("Voar")
    override fun correr(){
        // Utilizando a implementação da classe pai
        super.correr()
        print("pássaro que esta correndo com duas perninhas\n")
    }
}


fun main(){
    val cao = Cao()
    cao.correr()
    cao.dormir()
    cao.latir()
    println("========================")
    val passaro = Passaro()
    passaro.correr()
    passaro.dormir()
    passaro.voar()


}