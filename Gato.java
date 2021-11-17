/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapetshop;

/**
 *
 * @author Artur
 */
public class Gato extends Animal{
    private int numDoGato;

    public int getNumDoGato() {
        return numDoGato;
    }

    public void setNumDoGato(int numDoGato) {
        this.numDoGato = numDoGato;
    }
    //procedimento para vincular o gato ao dono dele
    public void VincularGatoDono(Gato x, Cliente y[], int qtdCliente){
        int aux[]= new int[100];
        String auxCpf;
        System.out.println("Informe o cpf do dono do gato:");
        auxCpf = ler.nextLine();
        int i = y[0].ProcurarCliente(y, qtdCliente, auxCpf);
        aux = y[i].getGato();
        if (i!= 0){
            x.setCpfDono(auxCpf);
            y[i].setQtdGato(y[i].getQtdGato()+1);
            aux[y[i].getQtdGato()]= x.getNumDoGato();
            y[i].setGato(aux);
        }else{
            System.out.println("cpf do cliente não encontrado no sistema!!");
            System.out.println("Cadastre o cliente ou insira um cpf de um cliente cadastrado");
        }
        
        
    }
    //função para pesquisar gatos
    public int PesquisarGato(Gato x[],int nG, int nDoGato){
       int resposta = 0;
       for(int i =1; i<=nG; i++){
           if (nDoGato == x[i].getNumDoGato()){
               resposta = i;
           }
       }
       return resposta;
    }
    
}
