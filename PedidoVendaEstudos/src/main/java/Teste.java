import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.igabriel89.pedidovenda.model.Cliente;
import br.com.igabriel89.pedidovenda.model.Endereco;
import br.com.igabriel89.pedidovenda.model.TipoPessoa;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Teste antes de executar");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
		EntityManager manager = factory.createEntityManager();
		
		System.out.println("Teste depois de executar o Enntyti");
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Jose da Silva1");
//		cliente.setEmail("jose@silva.com");
//		cliente.setDocumentoReceitaFederal("123.123.123-12");
//		cliente.setTipo(TipoPessoa.FISICA);
//		
//		Endereco endereco = new Endereco();
//		endereco.setLogradouro("Jardim");
//		endereco.setNumero("123");
//		endereco.setComplemento("Casa");
//		endereco.setCidade("Boa Vista");
//		endereco.setUf("RR");
//		endereco.setCep("000.000-00");
//		endereco.setCliente(cliente);
//		
//		cliente.getEnderecos().add(endereco);
//		
//		
//		manager.persist(cliente);
//		
//		trx.commit();
		
		System.out.println("Teste no Fim");
		
	}
	
}
