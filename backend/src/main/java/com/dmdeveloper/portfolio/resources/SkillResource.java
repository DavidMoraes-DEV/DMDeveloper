package com.dmdeveloper.portfolio.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dmdeveloper.portfolio.dto.SkillDTO;
import com.dmdeveloper.portfolio.services.SkillService;

@RestController
@RequestMapping(value = "/skills")
public class SkillResource {

	@Autowired
	private SkillService service;
	
	@GetMapping
	@Transactional(readOnly = true)
	public ResponseEntity<List<SkillDTO>> findAll () {
		
		List<SkillDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") 
	public ResponseEntity<SkillDTO> findById(@PathVariable Long id) {
		SkillDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto); 
	}
	
	@PostMapping
	public ResponseEntity<SkillDTO> insert(@Valid @RequestBody SkillDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<SkillDTO> update(@PathVariable Long id, @Valid @RequestBody SkillDTO dto) {
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
