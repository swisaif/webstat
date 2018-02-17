package com.techpro.webstat.models;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public interface OperationRepo extends JpaRepository<Operation,Long>{

   public List<Operation> findAllByOpeSda(String opeSda);
   public List<Operation> findAllByOpeDateStartingWith(String opeDate);

   public List<Operation> findAll();


   // public List<Operation> findAllByOpeContratAndOpeDateStartingWith(String opeDate,String opeContrat);
  // public List<Operation> findAllByOpeContratAndOpeServeur(String OpeContrat,String opeServeur);
   public List<Operation> findAllByOpeContratStartingWithAndOpeServeurStartingWithAndOpeDateStartingWithAndOpeSdaStartingWithAndOpeOperationStartingWith(String OpeContrat,String opeServeur,String opeDate,String opeSda,String opeOperation);

   public List<Operation> findAllByOpeContrat(String OpeContrat);
   //public List<Operation> findAllByOpeContratStartingWithAndOpeServeurStartingWithAndOpeDateStartingWithOrOpeDateStartingWith(String OpeContrat,String opeServeur,String opeDate1,String opeDate2);
	public  List<Operation> findAllByOpeServeur (String opeserveur);



}

