package jdbc;

import jdbc.dao.ClienteDao;
import jdbc.model.Cliente;
import jdbc.service.ClienteService;

/**
 *
 * @author edson
 */
public class Teste {
    public static void main(String[] args) {
        /*
        //teste de conexão com bd
        ConnectionFactory conn = new ConnectionFactory();
        conn.getConnectionUSBWebService();
        System.out.println("Conectado");
        */
        /*
        //teste consulta Dao
        ClienteDao cli = new ClienteDao();
        var clientes = cli.consultar();
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
        */
        ClienteService cli = 
                new ClienteService(new ClienteDao());
        var clientes = cli.consultar();
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
        
        Cliente cliente = new Cliente("Mateus", "12315", "12124456", 
                "edson.feitosa@facens.br", "(15)9914445", "(15)15848", 
                "18015000", "rua teste", "123", "", "bairro teste", 
                "Sorocaba", "SP");
        cliente = cli.cadastrar(cliente);
        System.out.println("Id: "+ cliente.getId() + " | Nome: "+cliente.getNome());
    }
}
