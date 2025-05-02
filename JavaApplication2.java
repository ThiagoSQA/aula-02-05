package javaapplication1;//Trabalho de Thiago Sousa Quadros de Andrade e Fernanda de Almeida Pita
import java.util.Stack;
import java.util.Scanner;
import java.util.LinkedList;//Tranalho de Thiago Sousa Quadros de Andrade e Fernanda de Almeida Pita
import java.util.Collection;
import java.util.Queue;
public class JavaApplication2 {
    public static void main(String[]args){
    LinkedList<String>pacientes=new LinkedList();
    LinkedList<String>sintomas=new LinkedList();
    Scanner cadastrar=new Scanner(System.in);while(true){
    System.out.println("continuar cadastrando pacientes 1 ir para a fase de atendimento 2");
    int opcoes = cadastrar.nextInt();
    cadastrar.nextLine(); 

    switch(opcoes){
        case 1:{
            while(true){
                System.out.println("Nome do próximo paciente: ");
                String proximoPaciente = cadastrar.nextLine();
                pacientes.add(proximoPaciente);

                System.out.println("Qual é o sintoma?");
                String sintoma = cadastrar.nextLine();
                sintomas.add(sintoma);

                System.out.println("Deseja continuar? 1 Sim 2 Não");
                int fecharLoop = cadastrar.nextInt();
                cadastrar.nextLine();

                if(fecharLoop == 2){
                    break;
                }
            }
            break;
        }
        case 2:{
            while(!pacientes.isEmpty()){
                System.out.println("Olá " + pacientes.poll() + ", aqui diz que seu sintoma é " + sintomas.poll());
            }
            break;
        }
        case 3:{
            System.out.println("fila encerrada!");break;
        }
    }
}

        
}
}
