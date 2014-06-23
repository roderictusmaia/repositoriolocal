<!DOCTYPE html>
<html>
<body>

<?php 
/*
Exercício 1 
Imprima na tela, todos os números de 1 a 100, um em cada linha. 
 
Exercício 2 
Imprima os múltiplos de 3 entre 1 e 100, um em cada linha. 
 
Exercício 3 
Imprima na tela a soma de todos os números pares de 50 a 100 
(incluindo-o). O resultado deve ser 1950. 
 
Exercício 4 
Escreva uma função que retorne o fatorial do número passado 
como parâmetro. Para o valor 4 o resultado deve ser 24. 
 
Exercício 5 
Escreva uma função que receba 2 parâmetros, e retorne a soma do 
intervalo de valores destes parâmetros. Para os parâmetros (5, 10) 
o resultado deve ser 45.
*/

	for ($x=1;$x<=100;$x++){
	echo $x;
	echo "<br>";
	}

	for ($y=3;$y<=100;$y+=3){
	echo $y;
	echo "<br>";
	}

	$a=0;
	// se não der um valor para "a" dá uma mensagem de erro, apesar de compilar normalmente.
	for ($z=50;$z<=100;$z+=2){
	$a+=$z;
	}
	echo $a;
	echo "<br>";
	
	$c=4;
	$d=1;
	for ($b=1;$b<$c;$b+=1){
	$d*=$b+1;
	}
	echo $d;
	echo "<br>";
	
	$e=5;
	$f=10;
	$soma=0;
	
	for (;$e<=$f;$e++){
	$soma+=$e;
	}
	
	echo $soma;
	echo "<br>";
		
?>  

</body>
</html>