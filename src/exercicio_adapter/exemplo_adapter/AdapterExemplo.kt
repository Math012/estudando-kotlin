package exercicio_adapter.exemplo_adapter

interface Conector{
    fun quantidadePinos() : Int
    fun ligarAparelho()
}

class ConectorNovoPadrao : Conector{
    override fun quantidadePinos() : Int{
        return 3
    }

    override fun ligarAparelho(){
        println("Aparelho ligado")
        println("Mais de vinte linhas de código")
    }
}

class ConectorAdaptador(val conectorNovoPadrao: ConectorNovoPadrao) : Conector{

    override fun quantidadePinos(): Int {
        return 2
    }

    override fun ligarAparelho() {
        conectorNovoPadrao.ligarAparelho()
    }

}

class TomadaAntiga(val conector: Conector){
    fun passarEnergia(){
        val qtdPinos = conector.quantidadePinos()
        if (qtdPinos == 2){
            conector.ligarAparelho()
            println("Quantidade de pinos: $qtdPinos")
            println("passando energia")
        }else{
            println("Essa tomada so funciona com 2 pinos e voce passou $qtdPinos")
        }
    }
}


fun main() {
    val conectorNovoPadrao = ConectorNovoPadrao()
    val conectorAdaptador = ConectorAdaptador(conectorNovoPadrao)
    val tomadaAntiga = TomadaAntiga(conectorAdaptador)
    tomadaAntiga.passarEnergia()
}