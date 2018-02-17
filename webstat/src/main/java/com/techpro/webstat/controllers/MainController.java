package com.techpro.webstat.controllers;
import com.techpro.webstat.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.techpro.webstat.models.Periodes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

@RestController
public class MainController {

    @Autowired
    OperationRepo appRepo;

    @Autowired
    UserRepo UsRepo;

    @RequestMapping("/ww")
    public ModelAndView doOperladtion(){
        ModelAndView mv = new ModelAndView("ww");
        mv.addObject("lists",appRepo.findAll());
        return  mv;


    }


    @RequestMapping("/home")
    public ModelAndView doOperation(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        
        String name = auth.getName(); //get logged in username
        ModelAndView mv = new ModelAndView("home");

        if(auth.getAuthorities().toString().equals("[ROLE_USER]"))
        {
        	List <User> u=UsRepo.findByUsername(name);

            ModelAndView mv3 = new ModelAndView ("preference");
            mv3.addObject("name",name);
            return mv3;


        }
        if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){

            ModelAndView mv2 = new ModelAndView ("preference");
            mv2.addObject("name",name);

            return mv2;

        }
        return mv;

    }

    @RequestMapping("/")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("login");
        return mv;

    }




    @RequestMapping("/3383")
    public ModelAndView GetSDA1(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        ModelAndView mv = new ModelAndView("3383");
Operation o;
int x=0;
int x2=0;
int x3=0;
int x4=0;
int x5=0;
        List<Operation> list = appRepo.findAll();
        Iterator<Operation> i=list.iterator();
while(i.hasNext()) {
	o=i.next();
	if(o.getOpeSda().equals("3383")) {
		x++;
	}
	if(o.getOpeSda().equals("3384")) {
		x2++;
	}
	if(o.getOpeSda().equals("81101111")) {
		x3++;
	}
	if(o.getOpeSda().equals("81101104")) {
		x4++;
	}
	if(o.getOpeSda().equals("81101101")) {
		x5++;
	}
}
System.out.println(x);
System.out.println(x3);

mv.addObject("x", x);
mv.addObject("x2", x2);
mv.addObject("x3", x3);
mv.addObject("x4", x4);
mv.addObject("x5", x5);


        mv.addObject("lists", list);
        mv.addObject("name",name);

        return mv;
    }
    
    @RequestMapping("/serveur")
    public ModelAndView GetSD(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        ModelAndView mv = new ModelAndView("serveur");
Operation o;
int x=0;
int x2=0;
int x3=0;
int x4=0;
int x5=0;
        List<Operation> list = appRepo.findAll();
        Iterator<Operation> i=list.iterator();
while(i.hasNext()) {
	o=i.next();
	if(o.getOpe_port().equals("tunis1")) {
		x++;
	}
	if(o.getOpe_port().equals("sousse")) {
		x2++;
	}
	if(o.getOpe_port().equals("monastir")) {
		x3++;
	}
	if(o.getOpe_port().equals("tunis2")) {
		x4++;
	}
	if(o.getOpe_port().equals("sfax")) {
		x5++;
	}
}
System.out.println(x);
System.out.println(x3);

mv.addObject("x", x);
mv.addObject("x2", x2);
mv.addObject("x3", x3);
mv.addObject("x4", x4);
mv.addObject("x5", x5);


        mv.addObject("lists", list);
        mv.addObject("name",name);

        return mv;
    }
    @RequestMapping("/wiw")
    public ModelAndView perf(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        List<User> lli = UsRepo.findByUsername(auth.getName());

        List<Operation> list = appRepo.findAll();
        ModelAndView mv = new ModelAndView("wiw");
        if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
        	ListIterator<Operation> it = list.listIterator();
            ArrayList<Operation> list2=new ArrayList<>() ; 

            while(it.hasNext()){

               Operation str = it.next();
              if(str.getOpeSda().equals(lli.get(0).usernumero)) {

            	  list2.add(str);
              }
            }
            mv.addObject("lists", list2);
            mv.addObject("name",name);

        }

        if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
        
        mv.addObject("lists", list);
        mv.addObject("name",name);}

        return mv;
    }
    @RequestMapping("/at")
    public ModelAndView afficherT(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        List<User> lli = UsRepo.findByUsername(auth.getName());

        List<Operation> list = appRepo.findAll();
        ModelAndView mv = new ModelAndView("at");
        if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
        	ListIterator<Operation> it = list.listIterator();
            ArrayList<Operation> list2=new ArrayList<>() ; 

            while(it.hasNext()){

               Operation str = it.next();
              if(str.getOpeSda().equals(lli.get(0).usernumero)) {

            	  list2.add(str);
              }
            }
            mv.addObject("lists", list2);
            mv.addObject("name",name);

        }

        if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
        
        mv.addObject("lists", list);
        mv.addObject("name",name);}

        return mv;
    }
    
    
    
    
    @RequestMapping("/3384")
    public ModelAndView GetSDA2(){
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        ModelAndView mv = new ModelAndView("3383");

        List<Operation> list = getListSDA2();
        mv.addObject("lists", list);

        mv.addObject("name",name);

        return mv;
    }


    @RequestMapping("/81101111")
    public ModelAndView GetSDA3(){
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        ModelAndView mv = new ModelAndView("3383");

        List<Operation> list = getListSDA3();
        mv.addObject("lists", list);

        mv.addObject("name",name);

        return mv;
    }

    @RequestMapping("/81101104")
    public ModelAndView GetSDA4(){
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        ModelAndView mv = new ModelAndView("3383");

        List<Operation> list = getListSDA4();
        mv.addObject("lists", list);

        mv.addObject("name",name);

        return mv;
    }


    @RequestMapping("/81101101")
    public ModelAndView GetSDA5(){
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        ModelAndView mv = new ModelAndView("3383");

        List<Operation> list = getListSDA5();
        mv.addObject("lists", list);

        mv.addObject("name",name);

        return mv;
    }

    @RequestMapping("/hier")
    public ModelAndView ee(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        List<User> lli = UsRepo.findByUsername(auth.getName());

        List<Operation> list = getYesterdayDate();
        ModelAndView mv = new ModelAndView("hier");
        if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
        	ListIterator<Operation> it = list.listIterator();
            ArrayList<Operation> list2=new ArrayList<>() ; 

            while(it.hasNext()){

               Operation str = it.next();
              if(str.getOpeSda().equals(lli.get(0).usernumero)) {

            	  list2.add(str);
              }
            }
            mv.addObject("lists", list2);
            mv.addObject("name",name);

        }

        if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
        
        mv.addObject("lists", list);
        mv.addObject("name",name);}

        return mv;
    }

    @RequestMapping("/moisencours")
    public ModelAndView eee(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        List<User> lli = UsRepo.findByUsername(auth.getName());

        List<Operation> list = getMonthDate();
        ModelAndView mv = new ModelAndView("moisencours");
        if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
        	ListIterator<Operation> it = list.listIterator();
            ArrayList<Operation> list2=new ArrayList<>() ; 

            while(it.hasNext()){

               Operation str = it.next();
              if(str.getOpeSda().equals(lli.get(0).usernumero)) {

            	  list2.add(str);
              }
            }
            mv.addObject("lists", list2);
            mv.addObject("name",name);

        }

        if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
        
        mv.addObject("lists", list);
        mv.addObject("name",name);}

        return mv;
    }

    @RequestMapping("/moisprecedent")
    public ModelAndView esee(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        List<User> lli = UsRepo.findByUsername(auth.getName());

        List<Operation> list = getPreviousMonth();
        ModelAndView mv = new ModelAndView("moisencours");
        if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
        	ListIterator<Operation> it = list.listIterator();
            ArrayList<Operation> list2=new ArrayList<>() ; 

            while(it.hasNext()){

               Operation str = it.next();
              if(str.getOpeSda().equals(lli.get(0).usernumero)) {

            	  list2.add(str);
              }
            }
            mv.addObject("lists", list2);
            mv.addObject("name",name);

        }

        if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
        
        mv.addObject("lists", list);
        mv.addObject("name",name);}

        return mv;
    }


    public List<Operation> getMonthDate() {


        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
        //System.out.println(dateFormat.format(cal.getTime()));
        List<Operation> l4 = appRepo.findAllByOpeDateStartingWith(dateFormat.format(cal.getTime()));


        return l4;
    }




    @RequestMapping("/date")
    public ModelAndView GetTodayDate(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        List<User> lli = UsRepo.findByUsername(auth.getName());

        List<Operation> list = getTodayDate();
        ModelAndView mv = new ModelAndView("date");
        if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
        	ListIterator<Operation> it = list.listIterator();
            ArrayList<Operation> list2=new ArrayList<>() ; 

            while(it.hasNext()){

               Operation str = it.next();
              if(str.getOpeSda().equals(lli.get(0).usernumero)) {

            	  list2.add(str);
              }
            }
            mv.addObject("lists", list2);
            mv.addObject("name",name);

        }

        if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
        
        mv.addObject("lists", list);
        mv.addObject("name",name);}

        return mv;
    }


    public List<Operation> getListSDA1() {

        List<Operation> l1 = appRepo.findAllByOpeSda("3383");

        return l1;
    }
    public List<Operation> getListSDA2() {

        List<Operation> l2 = appRepo.findAllByOpeSda("3384");

        return l2;
    }

    public List<Operation> getListSDA3() {

        List<Operation> l2 = appRepo.findAllByOpeSda("81101111");

        return l2;
    }

    public List<Operation> getListSDA4() {

        List<Operation> l2 = appRepo.findAllByOpeSda("81101104");

        return l2;
    }

    public List<Operation> getListSDA5() {

        List<Operation> l2 = appRepo.findAllByOpeSda("81101101");

        return l2;
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


    public List<Operation> getPreviousMonth() {


        //date hier
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
        // System.out.println(dateFormat.format(cal.getTime()));
        List<Operation> l4 = appRepo.findAllByOpeDateStartingWith(dateFormat.format(cal.getTime()));


        return l4;
    }

/*
    @RequestMapping( value = "/test/{ope_id}", method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("ope_id") int ope_id){
        ModelAndView mv = new ModelAndView("test");
        mv.addObject("lists",appRepo.findOne(ope_id));
        return mv;
    }
*/


/*
    @RequestMapping(value="/test", method=RequestMethod.GET)
    public ModelAndView recoverPass(@RequestParam("ope_sda") int ope_sda) {
        ModelAndView mv = new ModelAndView("test");
        mv.addObject("lists",appRepo.findBySomeValue(ope_sda));
        return mv;
    }

*/

    @RequestMapping("/recherche")
    public ModelAndView ddddd(HttpServletRequest request){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username


        ModelAndView mv = new ModelAndView("recherche");
        mv.addObject("name",name);

        return mv;
    }

 

    @RequestMapping("/welcome")
    public ModelAndView welcome(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("welcome");

        return mv;
    }

    @RequestMapping("/admin")
    public ModelAndView admin(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("admin");

        return mv;
    }

    @RequestMapping("/403")
    public ModelAndView Error403(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("403");

        return mv;
    }
    @RequestMapping("/preference")
    public ModelAndView faza(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("preference");

        return mv;
    }

    @RequestMapping("/aa")
    public ModelAndView dddsssssdd(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("aa");

        return mv;
    }


    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public ModelAndView logoutPage (HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView("login");

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return mv; //You can redirect wherever you want, but generally it's a good practice to show login screen again.
    }


    @RequestMapping("/foo")
    public ModelAndView ddddfssdd(){
        ModelAndView mv = new ModelAndView("forgotpassword");
        return mv;
    }


    @RequestMapping("/result")
    public ModelAndView recoverPass(@RequestParam(required=false) String fieldName,@RequestParam(required=false) String fieldName2,@RequestParam(required=false) String dropDown,@RequestParam(required=false) String dropDown2,@RequestParam(required=false) String dropDown3,@RequestParam(required=false) String au) {
        ModelAndView mv = new ModelAndView("result");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        List<User> lli = UsRepo.findByUsername(auth.getName());

        System.out.println(au +"auuuu");

        String opeSda = getopeSda(dropDown2);
        String opeOperation = getOperation(dropDown3);

        if(dropDown.equals(""))
        {
            List<Operation> list = getContratAndOrigine(fieldName,fieldName2,"",opeSda,opeOperation);
            if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
            	ListIterator<Operation> it = list.listIterator();
                ArrayList<Operation> list2=new ArrayList<>() ; 

                while(it.hasNext()){

                   Operation str = it.next();
                  if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                	  list2.add(str);
                  }
                }
                mv.addObject("lists", list2);
                mv.addObject("name",name);

            }

            if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
            
            mv.addObject("lists", list);
            mv.addObject("name",name);}

            return mv;
        }

        if(dropDown.equals("Hier"))
        {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, -1);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            List<Operation> list = getContratAndOrigine(fieldName,fieldName2,dateFormat.format(cal.getTime()),opeSda,opeOperation);
            if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
            	ListIterator<Operation> it = list.listIterator();
                ArrayList<Operation> list2=new ArrayList<>() ; 

                while(it.hasNext()){

                   Operation str = it.next();
                  if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                	  list2.add(str);
                  }
                }
                mv.addObject("lists", list2);
                mv.addObject("name",name);

            }

            if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
            
            mv.addObject("lists", list);
            mv.addObject("name",name);}

            return mv;
        }

        if(dropDown.equals("Aujourd'hui"))
        {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            List<Operation> list = getContratAndOrigine(fieldName,fieldName2,dateFormat.format(date),opeSda,opeOperation);
            if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
            	ListIterator<Operation> it = list.listIterator();
                ArrayList<Operation> list2=new ArrayList<>() ; 

                while(it.hasNext()){

                   Operation str = it.next();
                  if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                	  list2.add(str);
                  }
                }
                mv.addObject("lists", list2);
                mv.addObject("name",name);

            }

            if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
            
            mv.addObject("lists", list);
            mv.addObject("name",name);}

            return mv;
        }

        if(dropDown.equals("Mois en cour"))
        {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, -1);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
            //System.out.println(dateFormat.format(cal.getTime()));
            List<Operation> list = getContratAndOrigine(fieldName,fieldName2,dateFormat.format(cal.getTime()),opeSda,opeOperation);
            if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
            	ListIterator<Operation> it = list.listIterator();
                ArrayList<Operation> list2=new ArrayList<>() ; 

                while(it.hasNext()){

                   Operation str = it.next();
                  if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                	  list2.add(str);
                  }
                }
                if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
                	ListIterator<Operation> it1 = list2.listIterator();
                    ArrayList<Operation> list3=new ArrayList<>() ; 

                    while(it.hasNext()){

                       Operation str = it.next();
                      if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                    	  list3.add(str);
                      }
                    }
                    mv.addObject("lists", list3);
                    mv.addObject("name",name);

                }

                if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
                
                mv.addObject("lists", list2);
                mv.addObject("name",name);}

                return mv;

            }

            if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
            
            mv.addObject("lists", list);
            mv.addObject("name",name);}

            return mv;


/*
            String s = "2017/07/02";
            String e = "2017/09/20";
            LocalDate start = LocalDate.parse(s);
            LocalDate end = LocalDate.parse(e);
            List<LocalDate> totalDates = new ArrayList<>();
            while (!start.isAfter(end)) {
                totalDates.add(start);
                start = start.plusDays(1);
                System.out.println(start);
            }
*/

        }

        if(dropDown.equals("Mois précédent"))
        {

            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MONTH, -1);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM");

            List<Operation> list = getContratAndOrigine(fieldName,fieldName2,dateFormat.format(cal.getTime()),opeSda,opeOperation);
            if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
            	ListIterator<Operation> it = list.listIterator();
                ArrayList<Operation> list2=new ArrayList<>() ; 

                while(it.hasNext()){

                   Operation str = it.next();
                  if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                	  list2.add(str);
                  }
                }
                mv.addObject("lists", list2);
                mv.addObject("name",name);

            }

            if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
            
            mv.addObject("lists", list);
            mv.addObject("name",name);}

            return mv;
        }
        
        

        if(dropDown.equals("3 derniers jours"))
        {
            Date date = new Date();
            Calendar cal = Calendar.getInstance();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            cal.add(Calendar.DATE, -1);
            String hier = dateFormat.format(cal.getTime());
            System.out.println(hier);


            String today = dateFormat.format(date);
            System.out.println(today);

            cal.add(Calendar.DATE, -1);
            String hh = dateFormat.format(cal.getTime());
            System.out.println(hh);



            List<Operation> supplierNames = new ArrayList<Operation>();


            List<Operation> list1 = getContratAndOrigine(fieldName,fieldName2,today,opeSda,opeOperation);
            List<Operation> list2 = getContratAndOrigine(fieldName,fieldName2,hier,opeSda,opeOperation);
            List<Operation> list3 = getContratAndOrigine(fieldName,fieldName2,hh,opeSda,opeOperation);

            supplierNames.addAll(list1);
            supplierNames.addAll(list2);
            supplierNames.addAll(list3);
            if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
            	ListIterator<Operation> it = supplierNames.listIterator();
                ArrayList<Operation> list4=new ArrayList<>() ; 

                while(it.hasNext()){

                   Operation str = it.next();
                  if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                	  list2.add(str);
                  }
                }
                mv.addObject("lists", list4);
                mv.addObject("name",name);

            }

            if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
            
            mv.addObject("lists", supplierNames);
            mv.addObject("name",name);}

            return mv;

        }

        mv.addObject("name",name);

        return mv;
    }

    public List<Operation> getContratAndOrigine(String contrat,String origine,String opeDate,String opeSda,String opeOperation) {
        List<Operation> l3 = appRepo.findAllByOpeContratStartingWithAndOpeServeurStartingWithAndOpeDateStartingWithAndOpeSdaStartingWithAndOpeOperationStartingWith(contrat,origine,opeDate,opeSda,opeOperation);

        return l3;
    }



    String getopeSda(String dropDown2){
        String b = "";
        
        switch(dropDown2) {
            case "3383 (GPRS SPDH PROD)":
                b =  "3383";
                break;
            case "3384 (IP SPDH PROD)":
                b =  "3384";
                break;
            case "81101111 (RTC CB2A UBCI)":
                b =  "81101111";
                break;
            case "81101101 (RTC SPDH SMT PROD)":
                b =  "81101101";
                break;
            case "81101104 (TMS GEMALTO)":
                b =  "81101104";
                break;
            default:
                b = "";

        }

        return b;

    }


    String getOperation(String dropDown3){
        String b = "";

        switch(dropDown3) {
            case "Autorisation":
                b =  "FO00 - Auto.";
                break;
            case "Telec/p":
                b =  "AO60 - Cloture";
                break;
            case "Echec":
                b =  "No Action";
                break;
        }

        return b;

    }
    @RequestMapping("/atr")
    public ModelAndView recoverPass2(@RequestParam(required=false) String fieldName,@RequestParam(required=false) String fieldName2,@RequestParam(required=false) String dropDown,@RequestParam(required=false) String dropDown2,@RequestParam(required=false) String dropDown3,@RequestParam(required=false) String au) {
        ModelAndView mv = new ModelAndView("atr");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        List<User> lli = UsRepo.findByUsername(auth.getName());

        System.out.println(au +"auuuu");

        String opeSda = getopeSda(dropDown2);
        String opeOperation = getOperation(dropDown3);

        if(dropDown.equals(""))
        {
            List<Operation> list = getContratAndOrigine(fieldName,fieldName2,"",opeSda,opeOperation);
            if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
            	ListIterator<Operation> it = list.listIterator();
                ArrayList<Operation> list2=new ArrayList<>() ; 

                while(it.hasNext()){

                   Operation str = it.next();
                  if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                	  list2.add(str);
                  }
                }
                mv.addObject("lists", list2);
                mv.addObject("name",name);

            }

            if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
            
            mv.addObject("lists", list);
            mv.addObject("name",name);}

            return mv;
        }

        if(dropDown.equals("Hier"))
        {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, -1);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            List<Operation> list = getContratAndOrigine(fieldName,fieldName2,dateFormat.format(cal.getTime()),opeSda,opeOperation);
            if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
            	ListIterator<Operation> it = list.listIterator();
                ArrayList<Operation> list2=new ArrayList<>() ; 

                while(it.hasNext()){

                   Operation str = it.next();
                  if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                	  list2.add(str);
                  }
                }
                mv.addObject("lists", list2);
                mv.addObject("name",name);

            }

            if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
            
            mv.addObject("lists", list);
            mv.addObject("name",name);}

            return mv;
        }

        if(dropDown.equals("Aujourd'hui"))
        {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            List<Operation> list = getContratAndOrigine(fieldName,fieldName2,dateFormat.format(date),opeSda,opeOperation);
            if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
            	ListIterator<Operation> it = list.listIterator();
                ArrayList<Operation> list2=new ArrayList<>() ; 

                while(it.hasNext()){

                   Operation str = it.next();
                  if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                	  list2.add(str);
                  }
                }
                mv.addObject("lists", list2);
                mv.addObject("name",name);

            }

            if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
            
            mv.addObject("lists", list);
            mv.addObject("name",name);}

            return mv;
        }

        if(dropDown.equals("Mois en cour"))
        {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, -1);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
            //System.out.println(dateFormat.format(cal.getTime()));
            List<Operation> list = getContratAndOrigine(fieldName,fieldName2,dateFormat.format(cal.getTime()),opeSda,opeOperation);
            if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
            	ListIterator<Operation> it = list.listIterator();
                ArrayList<Operation> list2=new ArrayList<>() ; 

                while(it.hasNext()){

                   Operation str = it.next();
                  if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                	  list2.add(str);
                  }
                }
                if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
                	ListIterator<Operation> it1 = list2.listIterator();
                    ArrayList<Operation> list3=new ArrayList<>() ; 

                    while(it.hasNext()){

                       Operation str = it.next();
                      if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                    	  list3.add(str);
                      }
                    }
                    mv.addObject("lists", list3);
                    mv.addObject("name",name);

                }

                if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
                
                mv.addObject("lists", list2);
                mv.addObject("name",name);}

                return mv;

            }

            if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
            
            mv.addObject("lists", list);
            mv.addObject("name",name);}

            return mv;


/*
            String s = "2017/07/02";
            String e = "2017/09/20";
            LocalDate start = LocalDate.parse(s);
            LocalDate end = LocalDate.parse(e);
            List<LocalDate> totalDates = new ArrayList<>();
            while (!start.isAfter(end)) {
                totalDates.add(start);
                start = start.plusDays(1);
                System.out.println(start);
            }
*/

        }

        if(dropDown.equals("Mois précédent"))
        {

            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MONTH, -1);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM");

            List<Operation> list = getContratAndOrigine(fieldName,fieldName2,dateFormat.format(cal.getTime()),opeSda,opeOperation);
            if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
            	ListIterator<Operation> it = list.listIterator();
                ArrayList<Operation> list2=new ArrayList<>() ; 

                while(it.hasNext()){

                   Operation str = it.next();
                  if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                	  list2.add(str);
                  }
                }
                mv.addObject("lists", list2);
                mv.addObject("name",name);

            }

            if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
            
            mv.addObject("lists", list);
            mv.addObject("name",name);}

            return mv;
        }
        
        

        if(dropDown.equals("3 derniers jours"))
        {
            Date date = new Date();
            Calendar cal = Calendar.getInstance();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            cal.add(Calendar.DATE, -1);
            String hier = dateFormat.format(cal.getTime());
            System.out.println(hier);


            String today = dateFormat.format(date);
            System.out.println(today);

            cal.add(Calendar.DATE, -1);
            String hh = dateFormat.format(cal.getTime());
            System.out.println(hh);



            List<Operation> supplierNames = new ArrayList<Operation>();


            List<Operation> list1 = getContratAndOrigine(fieldName,fieldName2,today,opeSda,opeOperation);
            List<Operation> list2 = getContratAndOrigine(fieldName,fieldName2,hier,opeSda,opeOperation);
            List<Operation> list3 = getContratAndOrigine(fieldName,fieldName2,hh,opeSda,opeOperation);

            supplierNames.addAll(list1);
            supplierNames.addAll(list2);
            supplierNames.addAll(list3);
            if(auth.getAuthorities().toString().equals("[ROLE_USER]")) {
            	ListIterator<Operation> it = supplierNames.listIterator();
                ArrayList<Operation> list4=new ArrayList<>() ; 

                while(it.hasNext()){

                   Operation str = it.next();
                  if(str.getOpeSda().equals(lli.get(0).usernumero)) {

                	  list2.add(str);
                  }
                }
                mv.addObject("lists", list4);
                mv.addObject("name",name);

            }

            if(auth.getAuthorities().toString().equals("[ROLE_ADMIN]")){
            
            mv.addObject("lists", supplierNames);
            mv.addObject("name",name);}

            return mv;

        }

        mv.addObject("name",name);

        return mv;
    }

}
