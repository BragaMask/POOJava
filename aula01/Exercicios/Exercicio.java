package aula01.Exercicios;

import java.util.Date;

public class Exercicio {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Jorginho Machado";
        a1.finalizacaoformulario = new Date();
        a1.cpf = "023.435.541-54";
        a1.telefone = "(11) 0800-8000";
        a1.endereco = "Rua Pele";
        a1.status();
    }
}
