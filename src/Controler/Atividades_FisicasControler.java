
package Controler;

import Model.Atividades_Fisicas;
import academia.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Atividades_FisicasControler {
    public void inserirAtividades_Fisicas(Atividades_Fisicas a) throws SQLException {
        try {

            Util util = new Util();
            try (Connection conexao = util.conecta()) {
                String sql = "INSERT INTO Atividades_Fisicas (id,clientes_cpf,tipo_idtipo) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement statement = conexao.prepareStatement(sql)) {
                    statement.setInt(1, a.getId());
                    statement.setInt(2, a.getClientes_cpf());
                    statement.setInt(3, a.getTipo_idtipo());
                    
            

                    int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
                    if (rowsInserted > 0) {
                        System.out.println("Novo usuário inserido com sucesso");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

