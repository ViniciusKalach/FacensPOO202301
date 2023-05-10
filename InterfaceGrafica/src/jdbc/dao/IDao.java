package jdbc.dao;

import java.util.ArrayList;
import jdbc.model.Cliente;

/**
 *
 * @author edson
 */
public interface IDao {
    public ArrayList<Cliente> consultar();
    public Cliente consultar(int id);
    public Cliente cadastrar(Cliente cliente);
    public boolean excluir(int id);
    public boolean alterar(Cliente cliente, int id);
    
}
