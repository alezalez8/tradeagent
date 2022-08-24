package com.example.tradeagent_java.repositories;

import com.example.tradeagent_java.model.PlaceOfContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceOfContactRepository extends JpaRepository<PlaceOfContact, Long > {
}
