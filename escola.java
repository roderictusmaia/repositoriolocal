import java.util.Scanner;

public class escola {

public static void main (String [] args){

Scanner s = new Scanner (System.in);

turma turma1 = new turma();

aluno aluno1 = new aluno();
aluno aluno2 = new aluno();
aluno aluno3 = new aluno();

turma1.primeiroaluno=aluno1;
turma1.segundoaluno=aluno2;
turma1.terceiroaluno=aluno3;
	
prova prova1 = new prova();
prova1.setNotas();
aluno1.primeiraprova = prova1;

prova prova2 = new prova();
prova2.setNotas();
aluno1.segundaprova = prova2;

prova prova3 = new prova();
prova3.setNotas();
aluno2.primeiraprova = prova3;

prova prova4 = new prova();
prova4.setNotas();
aluno2.segundaprova = prova4;

prova prova5 = new prova();
prova5.setNotas();
aluno3.primeiraprova = prova5;

prova prova6 = new prova();
prova6.setNotas();
aluno3.segundaprova = prova6;

double mediaprova1 = prova1.calcularTotal();
double mediaprova2 = prova2.calcularTotal();
double mediaprova3 = prova3.calcularTotal();
double mediaprova4 = prova4.calcularTotal();
double mediaprova5 = prova5.calcularTotal();
double mediaprova6 = prova6.calcularTotal();

System.out.println(mediaprova1+","+mediaprova2+","+mediaprova3+","+mediaprova4+","+mediaprova5+","+mediaprova6);

double mediaaluno1 = aluno1.calcularMediaprova();
double mediaaluno2 = aluno2.calcularMediaprova();
double mediaaluno3 = aluno3.calcularMediaprova();

System.out.println(mediaaluno1+","+mediaaluno2+","+mediaaluno3);
double mediaturma1 = turma1.calcularMediaturma();

System.out.println(mediaturma1);
}
}