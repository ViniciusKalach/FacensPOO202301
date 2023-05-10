package jdbc.dao;

import java.util.ArrayList;
import jdbc.model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.ConnectionFactory;

public class ClienteDao implements IDao {

    Connection conexao;

    public ClienteDao() {
        conexao = new ConnectionFactory()
                .getConnectionUSBWebService();
    }

    @Override
    public ArrayList<Cliente> consultar() {
        ArrayList<Cliente> lstClientes = new ArrayList<>();
        String query = "select * from cliente";
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        try {
            consulta = conexao.prepareStatement(query);
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                Cliente c = new Cliente();
                c.setId(resultado.getInt("id"));
                c.setNome(resultado.getString("nome"));
                c.setRg(resultado.getString("rg"));
                c.setCpf(resultado.getString("cpf"));
                c.setEmail(resultado.getString("email"));
                c.setTelefone(resultado.getString("telefone"));
                c.setCelular(resultado.getString("celular"));
                c.setCep(resultado.getString("cep"));
                c.setEndereco(resultado.getString("endereco"));
                c.setNumero(resultado.getString("numero"));
                c.setComplemento(resultado.getString("complemento"));
                c.setBairro(resultado.getString("bairro"));
                c.setCidade(resultado.getString("cidade"));
                c.setEstado(resultado.getString("estado"));
                lstClientes.add(c);
            }
            return lstClientes;
        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }

    }

    @Override
    public Cliente consultar(int id) {
        String query = "SELECT * FROM cliente WHERE id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultado = null;
        try {
            preparedStatement = conexao.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultado = preparedStatement.executeQuery();
            Cliente c = new Cliente();
            if (resultado.next()) {
                c.setId(resultado.getInt("id"));
                c.setNome(resultado.getString("nome"));
                c.setRg(resultado.getString("rg"));
                c.setCpf(resultado.getString("cpf"));
                c.setEmail(resultado.getString("email"));
                c.setTelefone(resultado.getString("telefone"));
                c.setCelular(resultado.getString("celular"));
                c.setCep(resultado.getString("cep"));
                c.setEndereco(resultado.getString("endereco"));
                c.setNumero(resultado.getString("numero"));
                c.setComplemento(resultado.getString("complemento"));
                c.setBairro(resultado.getString("bairro"));
                c.setCidade(resultado.getString("cidade"));
                c.setEstado(resultado.getString("estado"));
            }
            return c;

        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }

    }

    @Override
    public Cliente cadastrar(Cliente cliente) {
        String query = "insert into cliente (nome, rg, cpf, email, telefone, celular, cep, endereco, numero,\n"
                + "complemento, bairro, cidade, estado) \n"
                + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        ResultSet resultado = null;
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(query,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getRg());
            preparedStatement.setString(3, cliente.getCpf());
            preparedStatement.setString(4, cliente.getEmail());
            preparedStatement.setString(5, cliente.getTelefone());
            preparedStatement.setString(6, cliente.getCelular());
            preparedStatement.setString(7, cliente.getCep());
            preparedStatement.setString(8, cliente.getEndereco());
            preparedStatement.setString(9, cliente.getNumero());
            preparedStatement.setString(10, cliente.getComplemento());
            preparedStatement.setString(11, cliente.getBairro());
            preparedStatement.setString(12, cliente.getCidade());
            preparedStatement.setString(13, cliente.getEstado());
            preparedStatement.executeUpdate();
            resultado = preparedStatement.getGeneratedKeys();
            if (resultado.next()) {
                cliente.setId(resultado.getInt(1));
            }
            return cliente;

        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }

    }

    @Override
    public boolean excluir(int id) {
        String query = "Delete from cliente where id = ?";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = conexao.prepareStatement(query);
            preparedStatement.setInt(1, id);
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }

    }

    @Override
    public boolean alterar(Cliente cliente, int id) {
        String query = "update cliente  set nome = ?, rg = ?, cpf = ?, email = ?, "
                + "telefone = ?, celular = ?, cep = ?, endereco = ?, numero = ?, "
                + "complemento = ?, bairro = ?, cidade = ?, estado = ? "
                + " where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = conexao.prepareStatement(query);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getRg());
            preparedStatement.setString(3, cliente.getCpf());
            preparedStatement.setString(4, cliente.getEmail());
            preparedStatement.setString(5, cliente.getTelefone());
            preparedStatement.setString(6, cliente.getCelular());
            preparedStatement.setString(7, cliente.getCep());
            preparedStatement.setString(8, cliente.getEndereco());
            preparedStatement.setString(9, cliente.getNumero());
            preparedStatement.setString(10, cliente.getComplemento());
            preparedStatement.setString(11, cliente.getBairro());
            preparedStatement.setString(12, cliente.getCidade());
            preparedStatement.setString(13, cliente.getEstado());
            preparedStatement.setInt(14, id);

            if (preparedStatement.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }

    }

}
