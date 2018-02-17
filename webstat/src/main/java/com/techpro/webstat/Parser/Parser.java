package com.techpro.webstat.Parser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.techpro.webstat.models.Operation;
import com.techpro.webstat.models.OperationRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.xml.bind.ValidationException;

@Component
public class Parser {

    @Autowired
    OperationRepo appRepo;


// the following method would be invoked every 2 seconds


    @Scheduled(fixedRate = 2000)
    public void extractandsave() throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        //String fichier = "/" +dateFormat.format(date).concat(".log");


        File file = new File("ax.txt");
        
        try {
            // Create a new Scanner object which will read the data
            // from the file passed in. To check if there are more
            // line to read from it we check by calling the
            // scanner.hasNextLine() method. We then read line one
            // by one till all lines is read.
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //System.out.println(line);
                String delims = "[|]";
                String[] tokens = line.split(delims);

                List <Operation> opp = appRepo.findAll();
                Operation op;
                op = new Operation();
                String d=tokens[2];
                String c=tokens[7].substring(7);
                Boolean trouve  = false;

                for(int i=0; i<opp.size(); i++){
                    //System.out.println(opp.get(i).getOpeDate().equals(tokens[2]));
                    if(opp.get(i).getOpeDate().equals(tokens[2])) {
                        if ((opp.get(i).getOpeContrat().equals(c))&&(opp.get(i).getOpeDate().equals(d)))
                            trouve = true;
                    }
                }

                if (trouve == false){
                    if(tokens[23].equals("KO")){

                        op.setOpeDate(tokens[2]);
                        op.setOpeServeur(tokens[8].substring(3));
                        op.setOpeSda(tokens[9].substring(5));
                        op.setOpe_adresse(tokens[6].substring(18));

                        op.setOpeContrat(tokens[7].substring(7));
                        op.setOpe_version(tokens[4].substring(4));
                        op.setOpeOperation(tokens[11]);
                        op.setOpe_modulation(tokens[17]);
                        op.setOpe_vitesse(tokens[18]);
                        op.setOpe_msgsrx(tokens[19]);
                        op.setOpe_msgstx(tokens[21]);
                        op.setOpe_octetsrx(tokens[20]);
                        op.setOpe_octetstx(tokens[22]);
                        op.setOpe_stat_date(tokens[12]);
                        op.setOpe_stat_heure(tokens[16]);
                        op.setOpe_port(tokens[1]);
                        op.setOpe_retour(tokens[4]);
                        op.setOpe_max_cv(120);
                        op.setOpeDuree(tokens[10]);
                        op.setOpe_numero(tokens[0]);
                        appRepo.save(op);



                    }
                    else {
                        op.setOpeDate(tokens[2]);
                        op.setOpeServeur(tokens[8].substring(3));
                        op.setOpeSda(tokens[9].substring(5));
                        op.setOpe_adresse(tokens[6].substring(4));
                        op.setOpeContrat(tokens[7].substring(7));
                        op.setOpe_version(tokens[4].substring(4));
                        if (tokens[11].contains("."))
                        {
                            op.setOpeOperation(tokens[11].substring(0,11));

                        }
                        else
                        {
                            op.setOpeOperation(tokens[11]);

                        }
                        op.setOpe_modulation(tokens[17]);
                        op.setOpe_vitesse(tokens[18]);
                        op.setOpe_msgsrx(tokens[19]);
                        op.setOpe_msgstx(tokens[21]);
                        op.setOpe_octetsrx(tokens[20]);
                        op.setOpe_octetstx(tokens[22]);
                        op.setOpe_stat_date(tokens[12]);
                        op.setOpe_stat_heure(tokens[16]);
                        op.setOpe_port(tokens[1]);
                        op.setOpe_retour(tokens[4]);
                        op.setOpe_max_cv(120);
                        op.setOpeDuree(tokens[10]);
                        op.setOpe_numero(tokens[0]);
                        appRepo.save(op);
                    }

                }



            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



}



//2017/07/02 00:11:46