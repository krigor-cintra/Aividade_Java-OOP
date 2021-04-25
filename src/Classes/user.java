package Classes;



public class user {
    protected String nome;
    protected String tipo;
   protected String doc;
   protected String status;
    
public user(String nome, String doc) {
    this.nome=nome;
    this.doc=doc;
    validador docs = new validador(doc);
    status=docs.getvalidado();
}

String getNome(){
    return nome;
}
String getTipo(){
    return tipo;
}
public void nome(String nome){
    this.nome=nome;
}
public String getdoc(){
    return doc;
}
public String getstatus(){
    return status;
}

    



























}