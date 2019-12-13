package main;

import java.io.Serializable;

public class Contato extends Endereco 
{
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;

    public Contato(String nome, String sobrenome, String telefone, String email,String rua, String numero, String cep) {
        super(rua,numero,cep);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
    }


    public String getNome() {
        return nome;
    }
    
    public String getNomeCompleto(){
        StringBuilder sb = new StringBuilder(nome+" "+sobrenome);
        return sb.toString();
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        nome = nome.substring(0,1).toUpperCase().concat(nome.substring(1));
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        if(sobrenome.equals("")){
            this.sobrenome = sobrenome;
            return;
        }
        sobrenome = sobrenome.substring(0,1).toUpperCase().concat(sobrenome.substring(1));
        this.sobrenome = sobrenome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
