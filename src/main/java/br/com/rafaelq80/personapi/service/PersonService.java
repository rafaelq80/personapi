package br.com.rafaelq80.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.rafaelq80.personapi.dto.response.MessageResponseDTO;
import br.com.rafaelq80.personapi.model.Person;
import br.com.rafaelq80.personapi.repository.PersonRepository;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {

        this.personRepository = personRepository;

    }

    public MessageResponseDTO createPerson(@RequestBody Person person) {

        Person savedPerson = personRepository.save(person);

        return MessageResponseDTO.builder().message("Created person whith ID " + savedPerson.getId()).build();
    }
}
