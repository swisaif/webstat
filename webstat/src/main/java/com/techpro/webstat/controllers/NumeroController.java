package com.techpro.webstat.controllers;

import com.techpro.webstat.models.Numero;
import com.techpro.webstat.models.NumeroRepo;
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
public class NumeroController {



    @Autowired
    NumeroRepo appRepo;



    @RequestMapping("/numero")
    public ModelAndView doHfome(){
        ModelAndView mv = new ModelAndView("numero");
        mv.addObject("lists",appRepo.findAll());
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mv.addObject("name",name);

        return mv;
    }



    @RequestMapping( value = "/saveee", method = RequestMethod.POST)
    public ModelAndView doSave(@RequestParam("numero_id") String numero_id, @RequestParam("numero") String numero, @RequestParam("description") String description, @RequestParam("type") String type, @RequestParam("operateur") String operateur, @RequestParam("regle_tarifiaire") String regle_tarifiaire){
        ModelAndView mv = new ModelAndView("redirect:/numero");
        Numero op;
        op = new Numero();

        if(!numero_id.isEmpty()){
            op =(Numero)appRepo.findOne(Integer.parseInt(numero_id));
        } else {
            op = new Numero();
        }

        op.setNumero(numero);
        op.setType(type);
        op.setDescription(description);
        op.setOperateur(operateur);
        op.setRegle_tarifiaire(regle_tarifiaire);

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

    @RequestMapping( value = "/deletenum/{numero_id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("numero_id") int numero_id){
        ModelAndView mv = new ModelAndView("redirect:/numero");
        appRepo.delete(numero_id);
        return mv;
    }
/*
    @RequestMapping( value = "/edit/{oper_id}", method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("oper_id") int oper_id){
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("lists",appRepo.findOne(oper_id));
        return mv;
    }

*/
}
