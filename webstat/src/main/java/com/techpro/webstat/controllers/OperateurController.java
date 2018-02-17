package com.techpro.webstat.controllers;

import com.techpro.webstat.models.OperateurRepo;
import com.techpro.webstat.models.Operateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OperateurController {

    @Autowired
    OperateurRepo appRepo;

    @RequestMapping("/oper")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("operateur");
        mv.addObject("lists",appRepo.findAll());
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mv.addObject("name",name);

        return mv;
    }



    @RequestMapping( value = "/save", method = RequestMethod.POST)
    public ModelAndView doSave(@RequestParam("oper_id") String oper_id, @RequestParam("oper_name") String oper_name){
        ModelAndView mv = new ModelAndView("redirect:/oper");
        Operateur op;
        op = new Operateur();

        if(!oper_id.isEmpty()){
            op =(Operateur)appRepo.findOne(Integer.parseInt(oper_id));
        } else {
            op = new Operateur();
        }

        op.setOper_name(oper_name);
        appRepo.save(op);
        return mv;
    }



    @RequestMapping( value = "/view/{oper_id}", method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("oper_id") int oper_id){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("lists",appRepo.findOne(oper_id));
        return mv;
    }

    @RequestMapping( value = "/delete/{oper_id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("oper_id") int oper_id){
        ModelAndView mv = new ModelAndView("redirect:/oper");
        appRepo.delete(oper_id);
        return mv;
    }

    @RequestMapping( value = "/edit/{oper_id}", method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("oper_id") int oper_id){
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("lists",appRepo.findOne(oper_id));
        return mv;
    }

}
