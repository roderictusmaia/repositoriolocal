public class circunferencia {

int raio;
// valores abaixo não são inteiro... por isso o tipo double
// a forma americana usa PONTO não VIRGULA para os algarismos decimais,por exemplo.

double pi = 3.14;
double area;

public void setarCircunferencia(int raio){
this.raio=raio;
area=pi*(raio*raio);
}

double areaCircunferencia (){
return area;
}

}