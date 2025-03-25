package aula01;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! Nao posso rabiscar\n");
        }
        else{
            System.out.println("Rabiscando\n");
        }
    }
    void tampar(){
        tampada = true;
    }
    void destampar(){
        tampada = false;
    }

}
