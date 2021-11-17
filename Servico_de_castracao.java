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
public class Servico_de_castracao {
    Scanner ler = new Scanner(System.in);
    Tipo_pagamento tp = new Tipo_pagamento();
    String auxtp;
    //procedimento que realiza a castração de animais
    public void castrar(int nDeCachorros,Cachorro c[], int nDeGatos, Gato g[], Servico s[], int qtdServPrestado){
        int nC;
        int nG;
        String tosa;
        System.out.println("A castração será em que animal? ");
        tosa = ler.nextLine();
        if (tosa.equals("cachorro")){
            System.out.println("Informe o numero do cachorro: ");
            nC= Integer.parseInt(ler.nextLine());
            if (c[0].PesquisarCachorro(c, nDeCachorros, nC)!= 0){
                c[nC].setTosado(true);
                qtdServPrestado = qtdServPrestado +1;
                s[qtdServPrestado] = new Servico();
                s[qtdServPrestado].setTipoServico("castração em cachorro");
                s[qtdServPrestado].setNomeAnimal(c[nC].getNome());
                s[qtdServPrestado].setNumDoCachorro(c[nC].getNumDoCachorro());
                        
                System.out.println("O valor é de 300 reais, como deseja pagar(cartão ou dinheiro):");
                auxtp=ler.nextLine();
                if (auxtp=="cartao"){
                    tp.cartao();
                }else{
                    if(auxtp == "dinheiro"){
                        tp.dinheiro();
                    }
                }
            }else{
                System.out.println("Não encontramos o numero deste cachorro");
            }
        }else{
            if (tosa.equals("gato")){
                System.out.println("Informe o numero do gato: ");
                nG= Integer.parseInt(ler.nextLine());
                if (g[0].PesquisarGato(g, nDeGatos, nG)!= 0){
                    g[nG].setTosado(true);
                    qtdServPrestado = qtdServPrestado +1;
                    s[qtdServPrestado] = new Servico();
                    s[qtdServPrestado].setTipoServico("castração em gato");
                    s[qtdServPrestado].setNomeAnimal(g[nG].getNome());
                    s[qtdServPrestado].setNumDoCachorro(g[nG].getNumDoGato());
                    System.out.println("O valor é de 200 reais, como deseja pagar(cartão ou dinheiro):");
                    auxtp=ler.nextLine();
                    if (auxtp=="cartão"){
                        tp.cartao();
                    }else{
                        if(auxtp == "dinheiro"){
                            tp.dinheiro();
                        }
                    }
                }else{
                    System.out.println("Não encontramos o numero deste gato");
                }
            }else{
                System.out.println("Não trabalhamos com esse tipo de animal");
            }
        }
        
    }
}
