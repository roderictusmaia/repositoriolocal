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
	
System.out.println("Digite a nota:");
double a = s.nextDouble();
System.out.println("Digite a nota:");
double b = s.nextDouble();
prova prova1 = new prova(a,b);
aluno1.primeiraprova = prova1;

System.out.println("Digite a nota:");
double c = s.nextDouble();
System.out.println("Digite a nota:");
double d = s.nextDouble();
prova prova2 = new prova(c,d);
aluno1.segundaprova = prova2;

System.out.println("Digite a nota:");
double e = s.nextDouble();
System.out.println("Digite a nota:");
double f = s.nextDouble();
prova prova3 = new prova(e,f);
aluno2.primeiraprova = prova3;

System.out.println("Digite a nota:");
double g = s.nextDouble();
System.out.println("Digite a nota:");
double h = s.nextDouble();
prova prova4 = new prova(g,h);
aluno2.segundaprova = prova4;

System.out.println("Digite a nota:");
double i = s.nextDouble();
System.out.println("Digite a nota:");
double j = s.nextDouble();
prova prova5 = new prova(i,j);
aluno3.primeiraprova = prova5;

System.out.println("Digite a nota:");
double k = s.nextDouble();
System.out.println("Digite a nota:");
double l = s.nextDouble();
prova prova6 = new prova(k,l);
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