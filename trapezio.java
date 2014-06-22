public class trapezio{

int basemaior;
int basemenor;
int altura;
// por conta da formula que divide por 2 corre risco de número nao inteiro. Por isso a área é do tipo double.
double area;

public void setarTrapezio(int basemaior, int basemenor, int altura){
this.basemaior=basemaior;
this.basemenor=basemenor;
this.altura=altura;
area=((basemaior*basemenor)/2)*altura;
}

double calcularTrapezio(){
return area;
}

}