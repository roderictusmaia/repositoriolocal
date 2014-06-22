/*
Crie as classes Relogio e  
Atributos da classe Ponteiro e escreva um método main() para treinar a chamada 
aos métodos e atributos. Relogio: 
 ponteiroHora (posicao) 
 ponteiroMinuto (posicao) 
 ponteiroSegundo (posicao) 
Métodos da classe Relogio: 
acertarRelogio(int, int, int): Acerta o relógio, posicionando adequadamente 
cada posicao do relógio. Os parâmetros passados são hora, minuto e segundo. 
 lerHora(): retorna a hora atual do relógio. 
 lerMinuto(): retorna o minuto atual do relógio. 
 lerSegundo(): retorna o segundo atual do relógio. 
Atributos da classe posicao: 
 posicao(int): indica em qual posição está o posicao (1, 2, 3, 4, etc.). 
*/

public class e2q1 {
public static void main (String [] args){

relogio r1 = new relogio();
// criação do objeto do tipo relogio.

r1.acertarRelogio(15,45,30);

// setando os ponteiros;

System.out.println(r1.ponteiroHora.posicao+","+r1.ponteiroMinuto.posicao+","+r1.ponteiroSegundo.posicao);

int hora = r1.lerHora();
int minuto = r1.lerMinuto();
int segundo = r1.lerSegundo();
// armazenando os valores informados nos metodos get em variáveis.

System.out.println(hora +":" +minuto +":"+ segundo);

}
}