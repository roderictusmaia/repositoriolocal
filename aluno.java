public class aluno {

prova primeiraprova;
prova segundaprova;


double calcularMediaprova(){
double media = primeiraprova.calcularTotal() + segundaprova.calcularTotal();
return media/2;
}



}