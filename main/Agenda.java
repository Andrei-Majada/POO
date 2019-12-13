package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Agenda {
    private int numeroDeContatos;
    private ArrayList<Contato> listaDeContatos = new ArrayList<>();
    private Scanner teclado;

    public Agenda() {
        this.numeroDeContatos = 0;
        teclado = new Scanner(System.in);
    }
   
    public void insere(Contato novoContato){
        listaDeContatos.add(novoContato);
        numeroDeContatos++;
    }
    
    public void ordenaLista(){
        listaDeContatos.sort(Comparator.comparing(Contato::getNomeCompleto));
    }
    
    public ArrayList<Contato> getListaDeContatos(){
        return listaDeContatos;
    }
    
    public void apaga (){
        int op;
        if(numeroDeContatos<0){
            System.out.println("Agenda Vazia!\n");
            return;
        }
        System.out.print("Escolha quem deseja apagar: \n");
        for(int i = 0; i<numeroDeContatos; i++){
            System.out.println((i+1)+"- Nome: "+listaDeContatos.get(i).getNome()+" "+listaDeContatos.get(i).getSobrenome()+"    Número: "+listaDeContatos.get(i).getTelefone());
        }
        System.out.println("0- Cancelar\n");
        op = teclado.nextInt();
        if(op>numeroDeContatos || op<0){
            System.out.println("Opção inválida!\n");
            op = -2;
        }
        else{
            op--;
        }
        if(op>=0){
            listaDeContatos.remove(op);
        }
        if(op==-1){
            System.out.println("Operação cancelada!\n");
        }
    }
    
    public void menosContato(){
        numeroDeContatos--;
    }
    
    public int getNumeroDeContatos(){
        return numeroDeContatos;
    }
    
    public void buscarContato(String nome, String sobrenome){
        int flag = 0;
        if(numeroDeContatos==0){
            System.out.println("Agenda Vazia!\n");
            return;
        }
        if(nome.equals("") && sobrenome.equals("")){
            System.out.println("Preencha os dois campos!\n");
            return;
        }
        for(int i=0; i< numeroDeContatos; i++){
            if(sobrenome.equals("")){
                if(nome.equals(listaDeContatos.get(i).getNome())){
                    System.out.println("Nome: "+listaDeContatos.get(i).getNome()+" "+listaDeContatos.get(i).getSobrenome()+"    Número: "+listaDeContatos.get(i).getTelefone()+"    Email: "+listaDeContatos.get(i).getEmail());
                    flag = 1;
                }
            }
            else if(nome.equals("")){
                if(sobrenome.equals(listaDeContatos.get(i).getSobrenome())){
                    System.out.println("Nome: "+listaDeContatos.get(i).getNome()+" "+listaDeContatos.get(i).getSobrenome()+"    Número: "+listaDeContatos.get(i).getTelefone()+"    Email: "+listaDeContatos.get(i).getEmail());
                    flag = 1;
                }
            }
            else {
                if(sobrenome.equals(listaDeContatos.get(i).getSobrenome()) && nome.equals(listaDeContatos.get(i).getNome())){
                    System.out.println("Nome: "+listaDeContatos.get(i).getNome()+" "+listaDeContatos.get(i).getSobrenome()+"    Número: "+listaDeContatos.get(i).getTelefone()+"    Email: "+listaDeContatos.get(i).getEmail());
                    flag = 1;
                }
            }
        }
        if (flag==0){
            System.out.println("Contato não encontrado!");
        }
        System.out.println(""); 
    }
    
    public Contato getContatoLista(int i){
        return listaDeContatos.get(i);
    }

    
    
}
