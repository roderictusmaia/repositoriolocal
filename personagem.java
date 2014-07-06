import java.util.Scanner;
public class personagem {

private String nome;
private int hp;
private int mp;
private int forca;
private int opcao;

Scanner s1 = new Scanner(System.in);

void setPersonagem (){
System.out.println("Digite o nome do lutador:");
nome = s1.nextLine();
System.out.println("Digite o valor da HP:");
hp = s1.nextInt();
System.out.println("Digite o valor do MP:");
mp = s1.nextInt();
System.out.println("Digite o valor da forca:");
forca = s1.nextInt();
}

String getNome(){
return nome;
}

int getHp(){
return hp;
}

int getMp(){
return mp;
}

int getForca(){
return forca;
}

void Dano (int forca){
hp -= forca;
}

void pocaoHp(){
hp += 30;
}

void pocaoMp(){
mp += 30;
}

void Atacar(personagem x){

x.Dano(forca+mp);
if(forca>1){forca -= 1;}else{forca=1;}
if(mp>0){mp -= 10;}

if (x.getHp()<=0){
System.out.println("\n"+ x.getNome() +" " + "morreu. GAME OVER!!!");
System.exit(0);}

}

void setForca(int forca){
this.forca = forca;
}

void Mostrar(personagem x, personagem y){
System.out.println("\n" +x.getNome() + " " + x.getHp() + " " + x.getMp() + " " + x.getForca());
System.out.println(y.getNome() + " " + y.getHp() + " " + y.getMp() + " " + y.getForca());
}

void Escolher(int opcao, personagem x, personagem y){
this.opcao = opcao;

switch (opcao){
case 1:
x.Atacar(y);

break;
case 2:
x.pocaoHp();

break;
case 3:
x.pocaoMp();

break;
default:
System.out.println("Erro!!!");
}
}
}