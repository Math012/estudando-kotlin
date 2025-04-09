package introducao_paradigma_funcional.funcoes_parametros_nomeados_e_valores_padrao

// PARA ESPECIFICAR QUE UM PARAMETRO NÃO É OBRIGATORIO, PRECISAMOS INICIALIZAR ELE COM 0
fun somarParametros(n1: Int, n2: Int = 0){
    println(n1 + n2)
}


fun main(){
    somarParametros(10,50)

    // EXEMPLO DE PARAMETRO NOMEADO
    // somarParametros(n2 = 10, n1 = 50)
}