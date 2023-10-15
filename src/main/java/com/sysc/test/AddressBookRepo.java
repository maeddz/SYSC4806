package com.sysc.test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepo extends CrudRepository<AddressBook, Long> {
}