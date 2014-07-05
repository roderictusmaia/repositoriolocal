public class turma {

aluno primeiroaluno;
aluno segundoaluno;
aluno terceiroaluno;

double calcularMediaturma(){
double media = 
primeiroaluno.calcularMediaprova()+
segundoaluno.calcularMediaprova()+
terceiroaluno.calcularMediaprova();
return media/3;
}



}