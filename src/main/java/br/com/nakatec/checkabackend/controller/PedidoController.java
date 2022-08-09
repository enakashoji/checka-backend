package br.com.nakatec.checkabackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.nakatec.checkabackend.modelo.Pedido;
import br.com.nakatec.checkabackend.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoService service;

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<Pedido> pedido() {
		return service.listarPedido();
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/numero")
	public Pedido buscarPorId(@RequestParam(value="numero", defaultValue = "0") String numero) {
		return service.buscarPorId(new Long(numero));		
	}
}
