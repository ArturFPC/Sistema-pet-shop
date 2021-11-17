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
public class Servico{
    private String tipoServico;
    private String nomeAnimal;
    private String nomeCliente;
    private int numDoGato;
    private int numDoCachorro;
    private String cpfCliente;
    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumDoGato() {
        return numDoGato;
    }

    public void setNumDoGato(int numDoGato) {
        this.numDoGato = numDoGato;
    }

    public int getNumDoCachorro() {
        return numDoCachorro;
    }

    public void setNumDoCachorro(int numDoCachorro) {
        this.numDoCachorro = numDoCachorro;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    //procedimento para listar serviços
    void listarServicos(Servico s[], int qtdS){
        System.out.println("Quantidade de serviços prestados:"+qtdS);
        if (qtdS!=0){
            for(int i=1;i<=qtdS;i++){
                System.out.println(s[i].getTipoServico());
            }
            
        }else{
            System.out.println("Não foi realizado nenhum serviço");
        }
        
    }
    
    
}
