package br.com.nakatec.checka.repository;

import br.com.nakatec.checka.domain.Driver;
import org.springframework.data.repository.CrudRepository;

public interface DriverRepository extends CrudRepository<Driver, Long> {
}
