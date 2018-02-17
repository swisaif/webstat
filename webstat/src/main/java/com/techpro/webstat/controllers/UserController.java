package com.techpro.webstat.controllers;
import com.techpro.webstat.models.Role;
import com.techpro.webstat.models.RoleRepo;
import com.techpro.webstat.models.User;

import com.techpro.webstat.models.UserRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UserController {

    @Autowired
    UserRepo appRepo;

    @Autowired
    RoleRepo appRepo2;




    @Autowired
    private PasswordEncoder passwordEncoder;
    



    @RequestMapping("/utilisateurs")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("utilisateurs");
        mv.addObject("lists",appRepo.findAll());

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mv.addObject("name",name);



        return mv;
    }



    @RequestMapping( value = "/saveeeee", method = RequestMethod.POST)
    public ModelAndView doSave(@RequestParam("user_id") String user_id, @RequestParam("username") String username,@RequestParam("user_numero") String user_numero,@RequestParam("password") String password,@RequestParam("rol") String rol){
        ModelAndView mv = new ModelAndView("redirect:/utilisateurs");
        User op;
        op = new User();

        Role ro;
        ro = new Role();



        if(!user_id.isEmpty()){
            op =(User)appRepo.findOne(Integer.parseInt(user_id));
        } else {
            op = new User();
        }

        op.setUsername(username);
        op.setUsernumero(user_numero);
        op.setPassword(passwordEncoder.encode(password));
        ro.setRole(rol);

        op.setRo(ro);

        appRepo.save(op);

        ro.setUsername(op.getUsername());
        ro.setUser(op);

        appRepo.save(op);

        return mv;
    }

/*

    @RequestMapping( value = "/view/{oper_id}", method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("oper_id") int oper_id){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("lists",appRepo.findOne(oper_id));
        return mv;
    }
*/

    @RequestMapping( value = "/deleteuserid/{user_id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("user_id") int user_id){
        ModelAndView mv = new ModelAndView("redirect:/utilisateurs");
       
        appRepo2.delete(user_id);
        appRepo.delete(user_id);
        return mv;
    }



}
