package com.sysc.test;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("addressBook")
public class AdrBookControllerAPI {
    @Autowired(required = false)
    private AddressBookRepo repository;



    @GetMapping(path = "", produces = "application/json")
    List<AddressBook> getAll( HttpServletResponse response) {
        response.setContentType("text/plain");
        return (List<AddressBook>) repository.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    ResponseEntity<AddressBook> getById(@PathVariable("id") Long id) {
        Optional<AddressBook> abOpt = repository.findById(id);
        if (abOpt.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(abOpt.get());
    }

    @PostMapping("/{id}")
    @ResponseBody
    public AddressBook addBuddyInfo(@PathVariable long id,
                                    @RequestBody BuddyInfo buddy) {
        Optional<AddressBook> a = this.repository.findById(id);
        if (a.isEmpty()){
            return null;
        }
        a.get().addBuddy(buddy);
        this.repository.save(a.get());
        return a.get();
    }

    @PostMapping(path = "", produces = "application/json")
    @ResponseBody
    public String create(HttpServletResponse response) {
        AddressBook adrBook = new AddressBook();
        repository.save(adrBook).getId();
        response.setContentType("text/plain");
        return "Created!";
    }
}
