package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Mobile;

public interface MobileRepository extends CrudRepository<Mobile, String> {

}
