package br.com.nakatec.checkabackend.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.nakatec.checkabackend.modelo.dominio.Driver;

public interface DriverRepository extends CrudRepository<Driver, Long> {
}
