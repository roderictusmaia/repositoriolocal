public class escola {

public static void main (String [] args){

turma turma1 = new turma();

aluno aluno1 = new aluno();
aluno aluno2 = new aluno();
aluno aluno3 = new aluno();

turma1.aluno1=aluno1;
turma1.aluno2=aluno2;
turma1.aluno3=aluno3;

prova prova1 = new prova();
prova1.nota1=5.0;
prova1.nota2=4.0;
aluno1.prova1 = prova1;


prova prova2 = new prova();
prova2.nota1=4.0;
prova2.nota2=5.0;
aluno1.prova2 = prova2;

prova prova3 = new prova();
prova3.nota1=5.0;
prova3.nota2=4.0;
aluno2.prova1 = prova3;


prova prova4 = new prova();
prova4.nota1=2.0;
prova4.nota2=1.0;
aluno2.prova2 = prova4;


prova prova5 = new prova();
prova5.nota1=3.0;
prova5.nota2=2.0;
aluno3.prova1 = prova5;


prova prova6 = new prova();
prova6.nota1=5.0;
prova6.nota2=1.0;
aluno3.prova2 = prova6;

double mediaprova1 = prova1.calcularTotal();
double mediaprova2 = prova2.calcularTotal();
double mediaprova3 = prova3.calcularTotal();
double mediaprova4 = prova4.calcularTotal();
double mediaprova5 = prova5.calcularTotal();
double mediaprova6 = prova6.calcularTotal();

System.out.println(mediaprova1+","+mediaprova2+","+mediaprova3+","+mediaprova4+","+mediaprova5+","+mediaprova6);
//9,9,9,3,5,6

double mediaaluno1 = aluno1.calcularMediaprova();
double mediaaluno2 = aluno2.calcularMediaprova();
double mediaaluno3 = aluno3.calcularMediaprova();

System.out.println(mediaaluno1+","+mediaaluno2+","+mediaaluno3);
//9,6,5.5
double mediaturma1 = turma1.calcularMediaturma();

System.out.println(mediaturma1);
//6.83
}

}