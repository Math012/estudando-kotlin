package companion_object


class Carro(
    var modelo: String = "",
    var velocidade: Int = 0
){

    // TUDO QUE ESTA DENTRO DO COMPANION OBJECT PODE SER ACESSADO SEM UMA
    // INSTANCIA
    companion object{
        const val VELOCIDADE_PERMITIDA_POR_LEI = 128

        fun velocidadeMaximaPermitida(){
            println("A velocidade maxima permitida é: $VELOCIDADE_PERMITIDA_POR_LEI KM")
        }
    }

    fun exibirInformacoes(){
        println("Informações: Modelo: $modelo e Velocidade: $velocidade")
    }

}



fun main(){
    Carro.velocidadeMaximaPermitida()
    val carro = Carro("BMW", 100)
    carro.exibirInformacoes()

}