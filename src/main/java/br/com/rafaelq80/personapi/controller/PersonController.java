package br.com.rafaelq80.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaelq80.personapi.dto.response.MessageResponseDTO;
import br.com.rafaelq80.personapi.model.Person;
import br.com.rafaelq80.personapi.service.PersonService;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    /**
     * Implementação sem Classe de serviço
     * 
     * @Autowired private PersonRepository personRepository;
     * 
     * @Autowired public PersonController(PersonRepository personRepository) {
     * 
     *            this.personRepository = personRepository;
     * 
     *            }
     * 
     */

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {

        this.personService = personService;

    }

    @GetMapping
    public String getPeople() {
        return "API Test!";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
}
