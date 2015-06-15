/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Cliente {
  int cpf,planos_id;
  String nome;
  String telefone;
  String idade;
  String sexo;

    public Cliente(int cpf, int planos_id, String nome, String telefone, String idade, String sexo) {
        this.cpf = cpf;
        this.planos_id = planos_id;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.sexo = sexo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getPlanos_id() {
        return planos_id;
    }

    public void setPlanos_id(int planos_id) {
        this.planos_id = planos_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   
  
  
   
}
