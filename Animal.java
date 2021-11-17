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
public class Animal {
    Scanner ler = new Scanner(System.in);
    private String nome;
    private int idade;
    private String tipo;
    private String raca;
    private boolean castrado = false;
    private boolean tosado;
    private boolean limpo;
    private String cpfDono;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public boolean isTosado() {
        return tosado;
    }

    public void setTosado(boolean tosado) {
        this.tosado = tosado;
    }

    public boolean isLimpo() {
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCpfDono() {
        return cpfDono;
    }

    public void setCpfDono(String cpfDono) {
        this.cpfDono = cpfDono;
    }

    
    //procedimento para cadastrar animais
    public void cadastrarAnimal(Animal x){
        System.out.println("Informe o nome do animal:");
        x.setNome(ler.nextLine());
        System.out.println("Informe a idade do animal:");
        x.setIdade(Integer.parseInt(ler.nextLine()));
        System.out.println("Informe a raça do animal:");
        x.setNome(ler.nextLine());
    }
    
}
