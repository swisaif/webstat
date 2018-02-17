package com.techpro.webstat.models;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface RoleRepo extends CrudRepository<Role,Integer> {
    public List<Role> findAll();

}
