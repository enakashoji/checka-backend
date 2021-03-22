package br.com.nakatec.checka.repository;

import br.com.nakatec.checka.domain.Truck;
import org.springframework.data.repository.CrudRepository;

public interface TruckRepository extends CrudRepository<Truck, Long> {
}
