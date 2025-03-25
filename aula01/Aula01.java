package aula01;
public class Aula01{
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); 
        //variavél c1 é do tipo caneta -> Objeto c1
        //instanciação do objeto = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.carga = 45;
        c2.destampar();
        c2.status();
        c2.rabiscar();

        
    }
}