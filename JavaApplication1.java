package javaapplication1;//Trabalho de Thiago Sousa Quadros de Andrade e Fernanda de Almeida Pita
import java.util.Stack;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Queue;
public class JavaApplication1 {
    public static void main(String[] args) {
    Queue<String>Documentos=new LinkedList<>();
    Scanner leitor=new Scanner(System.in);
    System.out.println("diga seu usuario");
    String username=leitor.nextLine();
    System.out.println("seja bem vindo "+username+"!");
    while(true){
        System.out.println("digite a sua proxima acao 1 ADICIONAR 2 REMOVER 3 EXIBIR ARQUIVOS 4 SAIR");
        int opcoes=leitor.nextInt();
        String pulalinha=leitor.nextLine();
        switch(opcoes){
            case 1:{
                System.out.println("digite seu arquivo");
                String leitorArquivos=leitor.nextLine();
                Documentos.add(leitorArquivos);
                break;
            }
            case 2:{
                System.out.println("documento removido:"+Documentos.poll());
                break;
            }
            case 3:{
                System.out.println("os documentos são:"+Documentos.poll());
                break;
            }
            
        }
        if(opcoes==4){
            break;
        }
    }
            
        
    }
    
}
