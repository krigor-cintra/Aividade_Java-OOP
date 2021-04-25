package Classes;

import java.util.ArrayList;
import java.util.List;

public class cadastro {
    List<user> lista= new ArrayList<>();
    


    public cadastro() {
        lista = new ArrayList<>();
    }

    private void adduser (user usarioUser){
        user user =usarioUser;
        lista.add(user);

    }
    public void addpessoafis (String nome, String cpf){
        adduser(new cpf(nome, cpf));
        
    }
    public void addpessoajur(String nome, String cnpj){
        adduser(new cnpj(nome, cnpj));
    }

    public void imprimir(){
        
        System.out.println("***Usuarios*** ");
        for (user user : lista) {
            System.out.println("Pessoa Do Tipo "+user.getTipo()+" : "+user.getNome());
            System.out.println((user.getTipo()=="Fisico" ? "CPF: ": "CNPJ: ")+user.getdoc()+"\nStatus:"+user.status);

        
        }
    }
}
