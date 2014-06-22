public class exercicio1 {
	
	public static void main(String[] args) {
		
		// Imprima todos os números de 10 a 25.
		
		for (int x = 10; x<=25; x++){
			System.out.println(x);
		} 
		
		/* Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 
5, 7, etc.).*/
		
		for (int y = 1; y<=100; y+=2){
			System.out.println(y);
		}
		
		/* Começando em 0, imprima os números seguintes, enquanto a soma dos 
números já impressos for menor que 100. */
		int z = 0;
		int a = 0;
		while (z<100){
				++a;
				z+=a;
				System.out.println(a);
				}
		// O código acima imprime o proximo número após a soma < 100. ERRO!!!
		
		int b = 0;
		int c = 0;
		do{
			c++;
			System.out.println(c);
			b+=c;
			} while (b+c<100);
		// Agora deu certo porque usei o DO WHILE.
		
		// Imprima a tabuada do 9 (até o décimo valor).
		
		int d = 9;
		int e;
			
			for (e=1; e<=10; e++){
				System.out.println (d + "*" + e + "=" + d*e);
			}
			
			/*Escreva um programa que calcule o fatorial de 10. A regra do fatorial (!) é a 
seguinte: 
0! = 1*/
			int fatorial = 10;
			int resposta = 1;
			
			for (int i = 2; i<= fatorial; i++){
			resposta*=i;
			System.out.println(resposta);
			
			} 
			
			/*Se x for par, x deve receber o 
valor dele mesmo somado com 5. Já se x for ímpar, x deve receber o valor 
dele multiplicado por 2. O programa termina assim que x for maior que 1000. 
Por exemplo, para x = 10, a saída deve ser: 15, 30, 35, 70, 75, 150, 155, 310, 
315, 630, 635, 1270. Faça este exercício usando blocos if e depois usando 
blocos switch. 
*/

			int j = 10;
			do{
			if (j%2==0){
			j+=5;
			} else {
			j*=2;
			}
			System.out.println(j);} while (j<=1000);
		
		
		// na condição do if se houver operação o igual deve ser == pois o "=" é atribuição de valor não comparação.
		 
	
		int k = 10;
		do{
			switch (k%2){
				case 0:
				k+=5;
				System.out.println(k);
				break;
				default:
				k*=2;
				System.out.println(k);							
				}} while (k<1000);
	/*
	Verifique a validade de uma data e mostre uma mensagem na tela dizendo 
se a data é válida ou inválida. Deve haver três variáveis para armazenarem o 
dia, o mês e o ano. Considerar que fevereiro pode ter somente 28 dias. 
	*/
	
		int dia = 30;
		int mes = 9;
		int ano = 1985;
		
		if (dia > 31 || mes > 12 || ano < 1900 || ano > 2014){
			System.out.println("Data inválida");
		} else if (dia > 28 && mes == 2 || ((dia == 31) && (mes == 4 || mes == 6 || mes == 9 || mes == 11))){
			System.out.println("Data inválida");
		} else {
			System.out.println("Data válida");
		}
			
			
		
		
		
	}
}