package com.techpro.webstat.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.techpro.webstat.models.Operation;
import com.techpro.webstat.models.OperationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.techpro.webstat.models.Periodes;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/find")
public class PeriodeController {

    @Autowired
    OperationRepo appRepo;



    @RequestMapping(method = RequestMethod.GET)
    public String initForm(Model model) {
        Periodes per = new Periodes();
        model.addAttribute("find", per);
        initModelList(model);
        return "find";
    }




    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(Model model, @Validated Periodes per, BindingResult result) {
        model.addAttribute("find", per);
        String returnVal;

        System.out.println(per.getPeriode());
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("name",name);

        List<Operation> list1 = getTodayDate();
        List<Operation> list2 = getYesterdayDate();
        List<Operation> list3 = getMonthDate();
        List<Operation> list4 = getPreviousMonth();
        List<Operation> list5 = getThreeLastDays();

        if (per.getPeriode().equals("Aujourd'hui")) {
            model.addAttribute("lists",list1);
        }

        if (per.getPeriode().equals("Hier")) {
            model.addAttribute("lists",list2);
        }

        if (per.getPeriode().equals("Mois en cour")) {
            model.addAttribute("lists",list3);
        }
        if (per.getPeriode().equals("Mois précédent")) {
            model.addAttribute("lists",list4);
        }

        if (per.getPeriode().equals("3 derniers jours")) {
            model.addAttribute("lists",list5);
        }


        returnVal = "date";
       /* if(result.hasErrors()) {
            initModelList(model);
            returnVal = "colour";
        } else {
            model.addAttribute("colour", colour);
        }*/
        return returnVal;
    }

    private void initModelList(Model model) {
        List<String> coloursList = new ArrayList<String>();
        coloursList.add("Aujourd'hui");
        coloursList.add("Hier");
        coloursList.add("3 derniers jours");
        coloursList.add("Mois en cour");
        coloursList.add("Mois précédent");
        coloursList.add("Personnalisée");

        model.addAttribute("colours", coloursList);
    }



    public List<Operation> getTodayDate() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();

        List<Operation> l3 = appRepo.findAllByOpeDateStartingWith(dateFormat.format(date));


        return l3;
    }


    public List<Operation> getYesterdayDate() {


        //date hier
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        //System.out.println(dateFormat.format(cal.getTime()));
        List<Operation> l4 = appRepo.findAllByOpeDateStartingWith(dateFormat.format(cal.getTime()));


        return l4;
    }

    public List<Operation> getMonthDate() {


        //date hier
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
        //System.out.println(dateFormat.format(cal.getTime()));
        List<Operation> l4 = appRepo.findAllByOpeDateStartingWith(dateFormat.format(cal.getTime()));


        return l4;
    }

    public List<Operation> getPreviousMonth() {


        //date hier
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
       // System.out.println(dateFormat.format(cal.getTime()));
        List<Operation> l4 = appRepo.findAllByOpeDateStartingWith(dateFormat.format(cal.getTime()));


        return l4;
    }

    public List<Operation> getThreeLastDays() {

        List<Operation> l5 = new ArrayList<Operation>();



        //date hier
        Calendar cal = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        for (int i=0; i <3; i++) {
            System.out.println(i);
            cal.add(Calendar.DATE, -i);
          //  System.out.println(dateFormat.format(cal.getTime()));

            List<Operation> l4 = appRepo.findAllByOpeDateStartingWith(dateFormat.format(cal.getTime()));
            l5.addAll(l4);
        }
//List<String> newList = ListUtils.union(list1,list2);






        //System.out.println(dateFormat.format(cal.getTime()));

        return l5;
    }




}
