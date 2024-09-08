package com.me.Clientes.microserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.Clientes.microserver.entity.Clientes;


public interface ClientesRepository extends MongoRepository<Clientes, String>  {

}
