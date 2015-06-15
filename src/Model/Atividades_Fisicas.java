
package Model;


public class Atividades_Fisicas {

    int id,clientes_cpf,tipo_idtipo;

    public Atividades_Fisicas(int id, int clientes_cpf, int tipo_idtipo) {
        this.id = id;
        this.clientes_cpf = clientes_cpf;
        this.tipo_idtipo = tipo_idtipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientes_cpf() {
        return clientes_cpf;
    }

    public void setClientes_cpf(int clientes_cpf) {
        this.clientes_cpf = clientes_cpf;
    }

    public int getTipo_idtipo() {
        return tipo_idtipo;
    }

    public void setTipo_idtipo(int tipo_idtipo) {
        this.tipo_idtipo = tipo_idtipo;
    }

  
        
}
