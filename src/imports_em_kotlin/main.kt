package imports_em_kotlin



/**
 * @author math012
 *
 *  Quando estamos utilizando pacotes em Kotlin, fazemos a importação especificando
 *  o caminho completo para o arquivo que queremos utilizar ou utilizamos
 *  o import automático que a IDE possui.
 *
 *  O que fazemos quando existem duas classes com o mesmo nome em pacotes distintos?
 *
 *  Podemos utilizar a primeira classe com o import normal e a segunda classe precisa que seu
 *  caminho até o arquivo seja especificado no momento da sua declaração, exemplo:
 * val produtoVitrine = Produto(1,"Monitor",900.00); (produtoVitrine utilizando o import normal)
 * val produtoCarrinho = imports_em_kotlin.carrinho.Produto(2,300.00,2); ( produtoCarrinho
 * especificando o caminho completo até o arquivo)
 *
 * Temos outra forma de separar as classes que estamos importando: utilizando
 * a palavra reserva “as” que aplica um apelido ao nome do import que estamos utilizando.
 * Exemplo:
 *
 * import imports_em_kotlin.vitrine.Produto as vit
 * import imports_em_kotlin.carrinho.Produto as carri
 *
 * colocamos apelidos nos imports, para os imports de vitrine colocamos vit e para carrinho
 * colocamos carri, e utilizamos desta forma:
 *
 * val produtoVitrine = vit(1,"Monitor",900.00);
 * val produtoCarrinho = carri(2,300.00,2);
 *
 */

import imports_em_kotlin.vitrine.Produto as vit
import imports_em_kotlin.carrinho.Produto as carri

fun main(){
    val produtoVitrine = vit(1,"Monitor",900.00);
    val produtoCarrinho = carri(2,300.00,2);
}