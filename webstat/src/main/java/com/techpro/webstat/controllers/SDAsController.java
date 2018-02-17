package com.techpro.webstat.controllers;

import com.techpro.webstat.models.SDAsRepo;
import com.techpro.webstat.models.SDAs;
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
public class SDAsController {

    @Autowired
    SDAsRepo appRepo;



    @RequestMapping("/sda")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("sdas");
        mv.addObject("lists",appRepo.findAll());


        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mv.addObject("name",name);



        return mv;
    }



    @RequestMapping( value = "/savee", method = RequestMethod.POST)
    public ModelAndView doSave(@RequestParam("sda_id") String sda_id, @RequestParam("sda") String sda,@RequestParam("oper_sda") String oper_sda,@RequestParam("num_sda") String num_sda,@RequestParam("oper_num") String oper_num){
        ModelAndView mv = new ModelAndView("redirect:/sda");
        SDAs op;
        op = new SDAs();

        if(!sda_id.isEmpty()){
            op =(SDAs)appRepo.findOne(Integer.parseInt(sda_id));
        } else {
            op = new SDAs();
        }

        op.setNum_sda(num_sda);
        op.setOper_num(oper_num);
        op.setSda(sda);
        op.setOper_sda(oper_sda);
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

    @RequestMapping( value = "/deletesda/{sda_id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("sda_id") int sda_id){
        ModelAndView mv = new ModelAndView("redirect:/sda");
        appRepo.delete(sda_id);
        return mv;
    }

    @RequestMapping( value = "/editsda/{sda_id}", method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("sda_id") int sda_id){
        ModelAndView mv = new ModelAndView("editsda");
        mv.addObject("lists",appRepo.findOne(sda_id));
        return mv;
    }



}
