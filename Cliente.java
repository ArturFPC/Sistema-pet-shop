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
public class Cliente {
    Scanner ler = new Scanner(System.in);
    private String Nome;
    private int idade;
    private String cpf;
    private int qtdCachorro = 0;
    private int qtdGato = 0;
    private int cachorro[] = new int[100];
    private int gato[] = new int[100];

    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int[] getCachorro() {
        return cachorro;
    }

    public void setCachorro(int[] cachorro) {
        this.cachorro = cachorro;
    }

    public int[] getGato() {
        return gato;
    }

    public void setGato(int[] gato) {
        this.gato = gato;
    }

    public int getQtdCachorro() {
        return qtdCachorro;
    }

    public void setQtdCachorro(int qtdCachorro) {
        this.qtdCachorro = qtdCachorro;
    }

    public int getQtdGato() {
        return qtdGato;
    }

    public void setQtdGato(int qtdGato) {
        this.qtdGato = qtdGato;
    }
    //procedimento para cadastrar o cliente
    public void cadastrarCliente(Cliente x){
        System.out.println("Informe o nome do cliente:");
        x.setNome(ler.nextLine());
        System.out.println("Informe a idade do cliente:");
        x.setIdade(Integer.parseInt(ler.nextLine()));
        System.out.println("Informe o cpf do cliente:");
        x.setCpf(ler.nextLine());
    }
    //função para pesquisar clientes
    public int ProcurarCliente(Cliente x[], int qtdCliente, String cpf){
       int resposta = 0;
       if (qtdCliente != 0) {
           for(int i =1; i<=qtdCliente; i++){
                if (cpf.equals(x[i].getCpf())){
                    resposta = i;
                }
           }
       }
       
       return resposta;
   }
}
