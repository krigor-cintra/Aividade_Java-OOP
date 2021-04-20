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

String setNome(){
    return nome;
}
String setTipo(){
    return tipo;
}
public void nome(String nome){
    this.nome=nome;
}
public String setdoc(){
    return doc;
}
public String setstatus(){
    return status;
}

    



























}