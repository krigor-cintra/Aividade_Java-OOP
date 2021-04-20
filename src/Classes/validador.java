package Classes;

import java.util.ArrayList;

public class validador {
    public String documento;
     ArrayList<Integer> peso = new ArrayList<>();
     ArrayList<Integer> algarismo = new ArrayList<>();
    /*public ArrayList<Integer> valores = new ArrayList<>();*/
    private String validado="";
     int validador1=0;
     int validador2=0;
    /*Construtor - Pega o documento em string */
    public validador(String documento) {
        this.documento = documento;
        validardocumentos();
    }
    
    /*CPF Validador */
    private void validadorCPF(){
        String[] alg;
        alg=documento.split("");
        /* Adicionando o peso na lista peso */
            for(int a = 1 ; a<=11 ;a++){
                peso.add(a);
            }
            /*Adicionando o Documento a uma lista, antes transformando em a Strin em Int  */
            for(String a : alg ){   
                this.algarismo.add(Integer.parseInt(a));
            }
            /*A lista valores recebe os valores da multplicação  */
           for(int ab =0, abc=9;  ab<=8;){
                        /*Pegando o algarismo e o peso de cadas posição multiplicando e armazenando o valor no validador 1 ( 1 a 9) */
               validador1=validador1+((algarismo.get(ab)*peso.get(abc)));
               ab++;
               abc--;
               if(abc==0){
                   
                   validador1=(validador1*10)%11;
                   if(validador1 == algarismo.get(9)){
                        for(int ac =0, acd=10;  ac<=9;){
                            validador2=validador2+((algarismo.get(ac)*peso.get(acd)));
                            ac++;
                            acd--;
                                if(acd==0){
                                    validador2=(validador2*10)%11;
                                    if(validador2 == algarismo.get(10)){
                                        this.validado=("Valido");
                                        
                                    }
                                    if(validador2 != algarismo.get(10)){
                                        this.validado=("Invalido");
                                        
                                    }
                            }
                        }
                   }
                   if (validador1 != algarismo.get(9)){
                        this.validado=("Invalido");
                       
                   }
               }
           }
         
       
    }
    /*CNPJ Validador */
    private void validadorCNPJ(){

        String[] alg;
        alg=documento.split("");
        /* Adicionando o peso na lista peso */
             int p[]= {6,5,4,3,2,9,8,7,6,5,4,3,2};
             for( int i :p){
                 peso.add(i);
             }
            /*Adicionando o Documento a uma lista, antes transformando em a Strin em Int  */
            for(String a : alg ){   
                this.algarismo.add(Integer.parseInt(a));
            }
            /*A lista valores recebe os valores da multplicação  */
           for(int ab =0, abc=1; ab<=11;){
                        /*Pegando o algarismo e o peso de cadas posição multiplicando e armazenando o valor no validador 1 ( 1 a 12) */
               validador1=validador1+((algarismo.get(ab)*peso.get(abc)));
               ab++;
               abc++;
               if(ab>11){
                   validador1 = validador1%11;
                   
                   if(validador1<2){
                       validador1=0;
                   }
                   else if(validador1>2){
                       validador1=11-validador1;
                   }
                   if(validador1==algarismo.get(12)){
                    for(int ac =0, acd=0; ac<=12;){
                        /*Pegando o algarismo e o peso de cadas posição multiplicando e armazenando o valor no validador 2 ( 1 a 13) */
                    validador2=validador2+((algarismo.get(ac)*peso.get(acd)));
                    ac++;
                    acd++;
                        if(acd>12){
                            validador2 = validador2%11;
                            if(validador2<2){
                                validador2=0;
                            }
                            else if(validador2>2){
                                validador2=11-validador2;
                            }
                           if(validador2==algarismo.get(13)){
                                this.validado=("Valido");
                               
                           }
                           else if(validador2!=algarismo.get(13)){
                                this.validado=("Invalido");
                               
                           }

                        }
                    }
                }
                    else if(validador2!=algarismo.get(13)){
                        this.validado=("Invalido");
                       
                    }
               }
               

           }
           /*System.out.println(documento.length());*/
    }
        /*Validação de documentos */
    public void validardocumentos(){
        
        if(validado==""){
            if(documento.length()==11){
                validadorCPF();
            }
            else if(documento.length()==14){
                validadorCNPJ();
            }
            else{
                validado=("Documento Invalido");
            }
        }
        else{
            System.out.println(validado);
        }
     }

     public String getvalidado(){
         return validado;
     }
    
}
