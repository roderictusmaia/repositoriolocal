public class aluno {

prova prova1;
prova prova2;


double calcularMediaprova(){
double media = prova1.calcularTotal() + prova2.calcularTotal();
return media/2;
}



}