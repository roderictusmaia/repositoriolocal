/*
Crie classes que representam as figuras geométricas: Triangulo, Quadrado, 
Circunferencia e Trapezio. Cada uma destas classes deve ter um método para calcular a 
sua área, com a seguinte assinatura: double calcularArea(). 
Perceba que o método calcularArea() não recebe parâmetros. Portanto todos os dados 
necessários devem ser armazenados no objeto da classe em forma de atributos para 
depois serem utilizados pelo método.
*/

public class calcularArea{

public static void main (String [] args){
// triangulo
triangulo t1 = new triangulo();
t1.setarTriangulo(3,20);
int x = t1.areaTriangulo();

System.out.println(x);

// quadrado
quadrado q1 = new quadrado();
q1.setarQuadrado(5);
int y = q1.areaQuadrado();

System.out.println(y);

// circunferencia

circunferencia c1 = new circunferencia();
c1.setarCircunferencia(2);
double z = c1.areaCircunferencia();

System.out.println(z);

// Trapezio

trapezio trap1 = new trapezio ();
trap1.setarTrapezio(5,20,5);
double a = trap1.calcularTrapezio();

System.out.println(a);

}

}