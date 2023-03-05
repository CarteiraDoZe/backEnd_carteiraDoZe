package br.com.carteiradoze.controller;

import java.math.BigDecimal;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.carteiradoze.model.Carteira;
import br.com.carteiradoze.repository.CarteiraRepository;

@RestController
@RequestMapping("/carteiraze")
@CrossOrigin("*")
public class CarteiraController {
	
	@Autowired
	private CarteiraRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Carteira>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Carteira> GetById(@PathVariable Long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/metas/{meta}")
	public ResponseEntity<List<Carteira>> getByMeta(@PathVariable @RequestParam("meta") BigDecimal meta ){
		return ResponseEntity.ok(repository.findAllByMeta(meta));
	}
	@PostMapping
	public ResponseEntity<Carteira> post(@Valid @RequestBody Carteira carteira){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(carteira));
	}
	@PutMapping
	public ResponseEntity<Carteira> put(@Valid @RequestBody Carteira carteira){
		return repository.findById(carteira.getId())
				.map(respost -> ResponseEntity.status(HttpStatus.OK)
						.body(repository.save(carteira)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
}