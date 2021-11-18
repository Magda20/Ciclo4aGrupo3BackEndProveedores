package com.Grupo3LaGenerica.Proveedores.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Grupo3LaGenerica.Proveedores.Model.Proveedores;

public interface ProveedoresRepository  extends MongoRepository <Proveedores, Integer>{

}
