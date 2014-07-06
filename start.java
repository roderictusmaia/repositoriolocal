import java.util.Scanner;
public class start {

public static void main (String[] args){

Scanner s = new Scanner(System.in);

personagem p1 = new personagem();
p1.setPersonagem();
personagem p2 = new personagem();
p2.setPersonagem();

p1.Mostrar(p1,p2);

int opcao;
boolean continuar = true;
do
{
System.out.println("\n 1 - Atacar \n 2 - Comprar HP \n 3 - Comprar MP");
opcao = s.nextInt();
p1.Escolher(opcao, p1, p2);
p1.Mostrar(p1,p2);

System.out.println("\n 1 - Atacar \n 2 - Comprar HP \n 3 - Comprar MP");
opcao = s.nextInt();
p2.Escolher(opcao, p2, p1);
p2.Mostrar(p1,p2);
}
while (continuar);

}
}