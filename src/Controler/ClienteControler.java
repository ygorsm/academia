
package Controler;

import Model.Cliente;
import academia.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author info206
 */
public class ClienteControler {
    public void inserircliente(Cliente C) throws SQLException {
        try {

            Util util = new Util();
            try (Connection conexao = util.conecta()) {
                String sql = "INSERT INTO clientes (cpf,nome,telefone,idade,sexo) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement statement = conexao.prepareStatement(sql)) {
                    statement.setInt(1, C.getCpf());
                    statement.setString(2, C.getNome());
                    statement.setString(3, C.getTelefone());
                    statement.setString(4, C.getIdade());
                    statement.setString(5, C.getSexo());
            

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
