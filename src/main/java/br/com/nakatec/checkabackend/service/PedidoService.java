package br.com.nakatec.checkabackend.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import br.com.nakatec.checkabackend.modelo.Pedido;
import br.com.nakatec.checkabackend.modelo.Produto;
import br.com.nakatec.checkabackend.modelo.Situacao;
import br.com.nakatec.checkabackend.modelo.UnidadeMedida;

@Service
public class PedidoService {

	public List<Pedido> listarPedido(){
		Produto produto1 = new Produto(1L , "Mel 1", "Produto produzido por abelhas", UnidadeMedida.ML, true);
		Produto produto2 = new Produto(2L , "Mel 2", "Produto produzido por abelhas", UnidadeMedida.ML, true);
		Produto produto3 = new Produto(3L , "Mel 3", "Produto produzido por abelhas", UnidadeMedida.ML, true);
		Produto produto4 = new Produto(4L , "Mel 4", "Produto produzido por abelhas", UnidadeMedida.ML, true);
		Pedido pedido1 = new Pedido(1L, produto1,
				"Mussum Ipsum, cacilds vidis litro abertis. Manduma pindureta quium dia nois paga.Tá deprimidis, eu conheço uma cachacis que pode alegrar sua vidis.Admodum accumsan disputationi eu sit. Vide electram sadipscing et per.Leite de capivaris, leite de mula manquis sem cabeça.",
				(long) 5, Situacao.CADASTRO, LocalDateTime.now());
		Pedido pedido2 = new Pedido(2L, produto2,
				"Mussum Ipsum, cacilds vidis litro abertis. Manduma pindureta quium dia nois paga.Tá deprimidis, eu conheço uma cachacis que pode alegrar sua vidis.Admodum accumsan disputationi eu sit. Vide electram sadipscing et per.Leite de capivaris, leite de mula manquis sem cabeça.",
				(long) 5, Situacao.CADASTRO, LocalDateTime.now());
		Pedido pedido3 = new Pedido(3L, produto3,
				"Mussum Ipsum, cacilds vidis litro abertis. Manduma pindureta quium dia nois paga.Tá deprimidis, eu conheço uma cachacis que pode alegrar sua vidis.Admodum accumsan disputationi eu sit. Vide electram sadipscing et per.Leite de capivaris, leite de mula manquis sem cabeça.",
				(long) 5, Situacao.CADASTRO, LocalDateTime.now());
		Pedido pedido4 = new Pedido(4L, produto4,
				"Mussum Ipsum, cacilds vidis litro abertis. Manduma pindureta quium dia nois paga.Tá deprimidis, eu conheço uma cachacis que pode alegrar sua vidis.Admodum accumsan disputationi eu sit. Vide electram sadipscing et per.Leite de capivaris, leite de mula manquis sem cabeça.",
				(long) 5, Situacao.CADASTRO, LocalDateTime.now());
		List<Pedido> lista = Arrays.asList(pedido1, pedido2, pedido3, pedido4);
		return lista;
	}

	public Pedido buscarPorId(Long numero) {
		List<Pedido> lista = listarPedido();
		Optional<Pedido> pedido = lista.stream().filter(p -> p.getNumero().equals(numero)).findAny();
		return pedido.get(); 
	}
}
