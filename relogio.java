public class relogio{

ponteiros ponteiroHora = new ponteiros ();
ponteiros ponteiroMinuto = new ponteiros ();
ponteiros ponteiroSegundo = new ponteiros ();
// Relogio é formado por ponteiros. Por isso foi criado a classe anterior chamada ponteiros

public void acertarRelogio (int hora, int minuto, int segundo){
hora = hora%12;
ponteiroHora.posicao=hora;
ponteiroMinuto.posicao=minuto/5;
ponteiroSegundo.posicao=segundo/5;
}

// O método acima alimenta os objetos ponteiroHora, etc. Com as adaptações para o relogio analógico.

int lerHora(){
return ponteiroHora.posicao;
}
int lerMinuto(){
return ponteiroMinuto.posicao*5;
}
int lerSegundo(){
return ponteiroSegundo.posicao*5;
}

// os métodos GET acima acessam o atributo posicao do objeto do tipo ponteiros e adapta para relogio digital.
// metodos get como os de cima não exige parametros pois não visa SETAR nada, apenas retornar valor.
// Basta indicar o tipo, nome, e a função de retorno.

}