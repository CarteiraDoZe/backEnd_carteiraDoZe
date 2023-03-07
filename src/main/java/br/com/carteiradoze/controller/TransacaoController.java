package br.com.carteiradoze.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carteiradoze.model.Transacao;
import br.com.carteiradoze.repository.TransacaoRepository;

@RestController
@RequestMapping("/transacao")
@CrossOrigin("*")
public class TransacaoController {

	@Autowired
	private TransacaoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Transacao>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Transacao> GetById(@PathVariable Long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	public ResponseEntity<Transacao> post(@Valid @RequestBody Transacao transacao){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(transacao));
	}
	@PutMapping
	public ResponseEntity<Transacao> put(@Valid @RequestBody Transacao transacao){
		return repository.findById(transacao.getId())
				.map(respost -> ResponseEntity.status(HttpStatus.OK)
						.body(repository.save(transacao)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
}
