package com.techpro.webstat.models;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


public interface UserRepo extends JpaRepository<User,Integer> {
    public List<User>  findByUsername(String username);


    

}


