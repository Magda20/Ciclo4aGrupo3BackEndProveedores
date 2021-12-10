package com.Grupo3LaGenerica.Proveedores.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Grupo3LaGenerica.Proveedores.Model.Proveedores;
import com.Grupo3LaGenerica.Proveedores.Repository.ProveedoresRepository;

@RestController
@RequestMapping ("/proveedores")
@CrossOrigin(origins = "http://localhost:3000")
public class ProveedoresAPI {
	
	@Autowired
	private ProveedoresRepository proveedoresRepository;
	
	@PostMapping ("/crear")
	public void agregarProveedor (@RequestBody Proveedores proveedor) {
		proveedoresRepository.save (proveedor);
	}
	
	@GetMapping("/buscar/{Nit}")
	public Optional<Proveedores> findById (@PathVariable ("Nit") Integer nit){
		return proveedoresRepository.findById(nit);
	}
	
	@DeleteMapping ("/borrar/{Nit}")
	public void borrar (@PathVariable ("Nit") Integer nit) {
		proveedoresRepository.deleteById(nit);
		
		
	}
	@PutMapping("/actualizar")
	public void update (@RequestBody Proveedores proveedor) {
		proveedoresRepository.save(proveedor);
	}
	
	@GetMapping ("/listar")
	public List<Proveedores> findAll(){
		return proveedoresRepository.findAll();
	}
	
	
}

