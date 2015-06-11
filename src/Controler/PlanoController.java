
package Controler;

import Model.Planos;
import academia.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PlanoController {

public void inserirplanocontroler(Planos P) throws SQLException {
        try {

            Util util = new Util();
            try (Connection conexao = util.conecta()) {
                String sql = "INSERT INTO planos (id,valor,nome,descricao) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement statement = conexao.prepareStatement(sql)) {
                    statement.setInt(1, P.getId());
                    statement.setInt(2, P.getValor());
                    statement.setString(3, P.getNome());
                    statement.setString(4, P.getDescricao());
                    
            

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
