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
public class Cachorro extends Animal{
    private int numDoCachorro;

    public int getNumDoCachorro() {
        return numDoCachorro;
    }

    public void setNumDoCachorro(int numDoCachorro) {
        this.numDoCachorro = numDoCachorro;
    }
    //função para vincular o cachorro ao seu dono
    public void VincularCachorroDono(Cachorro x, Cliente y[], int qtdCliente){
        int aux[]= new int[100];
        String auxCpf;
        System.out.println("Informe o cpf do dono do cachorro:");
        auxCpf = ler.nextLine();
        int i = y[0].ProcurarCliente(y, qtdCliente, auxCpf);
        aux = y[i].getCachorro();
        if (i!= 0){
            x.setCpfDono(auxCpf);
            y[i].setQtdGato(y[i].getQtdCachorro()+1);
            aux[y[i].getQtdCachorro()]= x.getNumDoCachorro();
            y[i].setCachorro(aux);
        }else{
            System.out.println("cpf do cliente não encontrado no sistema!!");
            System.out.println("Cadastre o cliente ou insira um cpf de um cliente cadastrado");
        }
        
        
    }
    //função para pesquisar cachorro
    public int PesquisarCachorro(Cachorro x[],int nC, int nDoCachorro){
       int resposta = 0;
       for(int i =1; i<=nC; i++){
           if (nDoCachorro == x[i].getNumDoCachorro()){
               resposta = i;
           }
       }
       return resposta;
    }
}
