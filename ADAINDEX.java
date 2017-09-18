package exercicio2;

import java.util.Scanner;

public class ADAINDEX {
    
    public static void main(String[] args) {
        
        //Criando duas listas encadeadas de tipo generico:
        exercicio2.LSEGen palavra = new exercicio2.LSEGen();
        exercicio2.LSEGen prefixo = new exercicio2.LSEGen();
        
        //Alocando variaveis e lendo a 1ª entrada:
        int n, q, contador = 0;
        String aux1, aux2, input;
        
        Scanner entrada = new Scanner(System.in);
        input = entrada.nextLine();
        String num[] = input.split(" ");
        
        n = Integer.parseInt(num[0]);
        q = Integer.parseInt(num[1]);
        
        //Colocando o número de palavras na lista encadeada:
        for(int i = 1; i <= n; i++){ 
           input = entrada.nextLine();
           palavra.insere(i, input);
        }

        for(int i = 1; i<=q; i++){
           input = entrada.nextLine();
           prefixo.insere(i, input);
        }
        
        for(int i = 1; i<=q; i++){ //A lista só começa da primeira posição
            aux1 = (String) prefixo.elemento(i);
            for(int j = 1; j<=n; j++){ //A lista só começa da primeira posição
                aux2 = (String) palavra.elemento(j);
                if((aux2.startsWith(aux1)) == true){
                    contador++;
                }
            }
            System.out.println(contador);
            contador = 0;
        }
    }
}