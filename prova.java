import java.util.Scanner;

public class prova {

Scanner s = new Scanner (System.in);
double nota1;
double nota2;

void setNotas (){
	System.out.println("Digite a nota:");
	this.nota1 = s.nextDouble();
	System.out.println("Digite a nota:");
	this.nota2 = s.nextDouble();
}

double calcularTotal(){
return nota1+nota2;
}


}