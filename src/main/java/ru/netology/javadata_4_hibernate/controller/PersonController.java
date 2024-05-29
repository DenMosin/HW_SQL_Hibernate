package ru.netology.javadata_4_hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.javadata_4_hibernate.entity.Person;
import ru.netology.javadata_4_hibernate.service.PersonService;

import java.util.List;

@RestController
public class PersonController {
    private final PersonService service;

    public PersonController(PersonService personService) {
        this.service = personService;
    }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Person> getProduct(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }
}
