package com.sysc.test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuddyInfoRepo extends CrudRepository<BuddyInfo, Long> {
    BuddyInfo findBuddyInfoById(Long id);
}