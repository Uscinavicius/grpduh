package com.grpduh.budget.controller;

import com.grpduh.budget.entity.Person;
import com.grpduh.budget.repo.InformationRepo;
import com.grpduh.budget.repo.PersonRepo;

import com.grpduh.budget.entity.Information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // This means that this class is a Controller
@RequestMapping(path="/Budget") // This means URL's start with /demo (after Application path)
public class Endpoint {
  @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private PersonRepo userRepository;

  @Autowired
  private InformationRepo dataRepository;

  @GetMapping(path="/test")
  public @ResponseBody String index() {
      return "Hello from the Budget Controller\n";
  }

  @GetMapping(path="/person/{id}")
  public @ResponseBody Person getPersonId(@PathVariable("id") int id) {
    // This returns a JSON or XML with the users
    return (Person) userRepository.findById(id);
  }

  @GetMapping(path="/statement/{id}")
  public @ResponseBody Information getStatementId(@PathVariable("id") int id) {
    // This returns a JSON or XML with the users
    return (Information) dataRepository.findById(id);
  }

  @GetMapping(path = "/addPerson")
    public @ResponseBody String addNewUser() {
      Person user = new Person("A","Nother");
        userRepository.save(user);
        return "User Created";
    }

  @GetMapping(path = "/addData")
  public @ResponseBody String addNewData() {;
    Information data_ = new Information(123,"Store","Stuff","Things");
    dataRepository.save(data_);
      return "Data Created";
  }

  @GetMapping(path = "/allPersons")
  public @ResponseBody Iterable < Person > getAllUsers() {
      return userRepository.findAll();
  }

  @GetMapping(path = "/allData")
  public @ResponseBody Iterable < Information > getAllData() {
      return dataRepository.findAll();
  }

}