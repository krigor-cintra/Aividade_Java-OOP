package Classes;

import java.util.Scanner;

public class controle {
    boolean verdadeiro =true;


    public controle() {
        super();
    }

    public void cadusuarios(){
        cadastro cadastro = new cadastro();
        while(verdadeiro){
            System.out.println("Quer adicionar uma pessoa física ou juridica ao cadastro?");
            System.out.println("respostas: 'fisica', 'juridica' e 'nenhuma'");
            Scanner entrada = new Scanner(System.in);
           String pessoa=entrada.next();
           String nome, documento;
           switch(pessoa){
               case "nenhuma":
               verdadeiro=false;
               cadastro.imprimir();
               break;

               case "fisica":
               System.out.println("Digite o nome da pessoa:");
               nome=entrada.next();
               System.out.println("Digite o CPF da pessoa:");
                documento=entrada.next();
                cadastro.addpessoafis(nome,documento);
                break;

                case "juridica":
                System.out.println("Digite o nome da pessoa:");
                nome=entrada.next();
                System.out.println("Digite o CNPJ da pessoa:");
                 documento=entrada.next();
                 cadastro.addpessoajur(nome, documento);
                 break;

                 default:
                System.out.println("Resposta inválida!");
                break;
           }
           
    }
    }
}