package aula01.Exercicios;
import java.util.Date;

public class Aluno{
    String nome;
    Date finalizacaoformulario;
    String cpf;
    String telefone;
    String endereco;

    void status(){
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereco: " + this.endereco); 
        System.out.println("Finalizou o formulario as " + this.finalizacaoformulario);
    }
}
