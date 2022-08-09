package br.com.nakatec.checkabackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nakatec.checkabackend.modelo.dominio.Checklist;

public interface ChecklistRepository extends JpaRepository<Checklist, Long> {

    List<Checklist> findByDriverName(String name);

    List<Checklist> findByDriverCpf(String cpf);

    List<Checklist> findByTruckLicense(String license);
}
