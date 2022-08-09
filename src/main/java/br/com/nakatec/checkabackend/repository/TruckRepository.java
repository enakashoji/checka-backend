package br.com.nakatec.checkabackend.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.nakatec.checkabackend.modelo.dominio.Truck;

public interface TruckRepository extends CrudRepository<Truck, Long> {
}
