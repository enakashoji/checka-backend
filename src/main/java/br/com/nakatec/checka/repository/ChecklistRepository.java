package br.com.nakatec.checka.repository;

import br.com.nakatec.checka.domain.Checklist;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChecklistRepository extends CrudRepository<Checklist, Long> {

    List<Checklist> findByDriverName(String name);

    List<Checklist> findByDriverCpf(String cpf);

    List<Checklist> findByTruckLicense(String license);
}
