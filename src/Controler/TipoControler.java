
package Controler;

import Model.Tipo;
import academia.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TipoControler {
    public void inserirtipo(Tipo T) throws SQLException {
        try {

            Util util = new Util();
            try (Connection conexao = util.conecta()) {
                String sql = "INSERT INTO Tipo (idtipo,musculação,zumba,bike_indoor) VALUES (?, ?, ?, ?)";
                try (PreparedStatement statement = conexao.prepareStatement(sql)) {
                    statement.setInt(1, T.getIdtipo());
                    statement.setString(2, T.getMusculação());
                    statement.setString(3, T.getZumba());
                    statement.setString(4, T.getBike_indoor());
                    
            

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

