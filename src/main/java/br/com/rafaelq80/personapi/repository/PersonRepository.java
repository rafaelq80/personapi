package br.com.rafaelq80.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelq80.personapi.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
