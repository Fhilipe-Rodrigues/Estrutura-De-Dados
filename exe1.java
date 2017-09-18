/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Fhilipe
 */
public class exe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int[] s;
        int[] q;
        int[] nComuns; // Elementos não iguais em S e Q;
        
        int tamArray;
        String saida = "";
        boolean zero = false;
        String ler;
        
        ler = entrada.nextLine();
        tamArray = Integer.parseInt(ler);
        s = new int[tamArray];
        nComuns = new int[tamArray];
        
        //Metodo split da classe String, divide a nossa linha quando encontra a cadeia que definimos;
        ler = entrada.nextLine();
        String numeros[] = ler.split(" ");
        
        //Transformando em inteiros.
        for(int i = 0; i<numeros.length; i++){
           s[i] = Integer.parseInt(numeros[i]);
           if(s[i] == 0){
               zero = true; //Passamos a definir os zeros.
           }
        }
        
        ler = entrada.nextLine();
        q = new int[Integer.parseInt(ler)];
        ler = entrada.nextLine();
        String numeros2[] = ler.split(" ");
        
        for(int i = 0; i<numeros2.length;i++){
           q[i] = Integer.parseInt(numeros2[i]);
        }
        
        //Armazenando os elementos não nComuns no array nComuns.
        for(int i = 0; i<s.length; i++){
           boolean repetido = false;
                for(int j = 0; j<q.length; j++){ 
                    if(s[i]==q[j]){
                        repetido = true;
                        break;
                    }
                }
                if(repetido == false){
                    nComuns[i] = s[i];
                }
        }
   
        //Ordenando com metodo da bolha. 
        int aux;
        boolean control;
 
        for(int i = 0; i < nComuns.length; i++){
            control = true;
                for(int j = 0; j < (nComuns.length - 1); j++){
                    if(nComuns[j] > nComuns[j + 1]){
                       aux = nComuns[j];
                        nComuns[j] = nComuns[j + 1];
                        nComuns[j + 1] = aux;
                        control = false;
                }
            }
            if(control){
                break;
            }
 
        }
        // formatando o array para o padrão especificado:
         for (int i = 0; i< nComuns.length;i++){
             if((nComuns[i] == 0) && (zero == false)){
                continue;
             }
             
             saida += "".concat(String.valueOf(nComuns[i])) + " ";
             
             if(nComuns[i] == 0){
                zero = false;   
             }
         }
         
         // Imprimindo resposta: 
         System.out.println(saida);
    }
    
}
