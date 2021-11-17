/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapetshop;
import java.util.Scanner;
/**
 *
 * @author Artur
 */
public class SistemaPetShop {

    /**
     * @param args the command line arguments
     */
    //criando constante para o numero maximo que será utlizado para a criação de vetores
    public static final int numMax = 1000;
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean run = true;
        int numCachorro = 0;
        int numGato = 0;
        int numCliente = 0;
        int qtdServPrestado = 0;
        //instanciando as classes a serem usadas
        //a posição 0 de algumas classes que estão sendo instanciadas, servirão como um ponto de acesso para o respectivo vetor
        Servico_de_banho_e_tosa sbt = new Servico_de_banho_e_tosa();
        Servico_de_castracao sc = new Servico_de_castracao();
        Cliente[] c = new Cliente[numMax];
        c[0]= new Cliente();
        Servico[] s = new Servico[numMax];
        s[0]= new Servico();
        Cachorro[] dog = new Cachorro[numMax];
        dog[0]= new Cachorro();
        Gato[] cat = new Gato[numMax];
        cat[0]= new Gato();
        //laço de repetição do sistema
        while (run == true){
            //variavel para receber a resposta do usuario e saber o que o programa deve fazer
           int desejo;
           System.out.println("Qual o serviço a ser prestado: ");
           System.out.println("1 - Cadastrar cliente");
           System.out.println("2 - Cadastrar cachorro");
           System.out.println("3 - Cadastrar gato");
           System.out.println("4 - Tosar");
           System.out.println("5 - Dar banho");
           System.out.println("6 - Castrar");
           System.out.println("7 - Listar serviços");
           System.out.println("8 - Sair");
           desejo = ler.nextInt();
           if (desejo==1){
               //cadastrando cliente
               numCliente= numCliente+1;
               c[numCliente]= new Cliente();
               c[numCliente].cadastrarCliente(c[numCliente]);
               qtdServPrestado = qtdServPrestado +1;
               s[qtdServPrestado] = new Servico();
               s[qtdServPrestado].setTipoServico("Cadastro de Cliente");
               s[qtdServPrestado].setNomeCliente(c[numCliente].getNome());
               s[qtdServPrestado].setCpfCliente(c[numCliente].getCpf());
           }
           if (desejo==2){
               //cadastrando cachorro
               numCachorro = numCachorro +1;
               dog[numCachorro] = new Cachorro();
               dog[numCachorro].cadastrarAnimal(dog[numCachorro]);
               dog[numCachorro].setNumDoCachorro(numCachorro);
               System.out.println("Num do Cachorro: "+ numCachorro);
               dog[numCachorro].VincularCachorroDono(dog[numCachorro], c, numCliente);
               qtdServPrestado = qtdServPrestado +1;
               s[qtdServPrestado] = new Servico();
               s[qtdServPrestado].setTipoServico("Cadastro de cachorro");
               s[qtdServPrestado].setNomeAnimal(dog[numCachorro].getNome());
               s[qtdServPrestado].setNumDoCachorro(dog[numCachorro].getNumDoCachorro());
               s[qtdServPrestado].setCpfCliente(dog[numCachorro].getCpfDono());
           }
           if(desejo==3){
               //cadastrando gato
               numGato = numGato+1;
               cat[numGato] = new Gato();
               cat[numGato].cadastrarAnimal(cat[numGato]);
               cat[numGato].setNumDoGato(numGato);
               System.out.println("Num do Gato: "+ numGato);
               cat[numGato].VincularGatoDono(cat[numGato], c, numCliente);
               qtdServPrestado = qtdServPrestado +1;
               s[qtdServPrestado] = new Servico();
               s[qtdServPrestado].setTipoServico("Cadastro de Gato");
               s[qtdServPrestado].setNomeAnimal(dog[numCachorro].getNome());
               s[qtdServPrestado].setNumDoCachorro(dog[numCachorro].getNumDoCachorro());
               s[qtdServPrestado].setCpfCliente(dog[numCachorro].getCpfDono());
           }
           if(desejo==4){
               //opção de tosar animais
               sbt.tosar(numCachorro, dog, numGato, cat, s, qtdServPrestado);
              
               
           }
           if(desejo==5){
               //opção de dar banho aos animais
              sbt.darBanho(numCachorro, dog, numGato, cat, s, qtdServPrestado);
           }
           if(desejo==6){
               //opção de castrar animais
              sc.castrar(numCachorro, dog, numGato, cat, s, qtdServPrestado);
           }
           if(desejo==7){
               //opção de listar os serviços
               s[0].listarServicos(s, qtdServPrestado);
           }
           if(desejo==8){
               run=false;
           }
        }
        
    }
    
}
