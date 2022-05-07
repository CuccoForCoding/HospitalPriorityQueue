/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triagesimulator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.nio.charset.StandardCharsets;
import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;


/**
 // Joey Cucco
 */
public class Main {
    
     public static void main(String[] args) throws IOException {
       
             TriageSimulator triSim = new TriageSimulator();
             
             ArrayList<TriageSimulator> pqTri = new ArrayList<>();
             
             ArrayList<Patient> patientAL = new ArrayList<>();
             
             patientAL.add(new Patient("Ilene", "Dover", "SF"));
             patientAL.add(new Patient("Sum-Yung", "Gai", "BL"));
             patientAL.add(new Patient("Jacques", "Strap", "IW"));
             patientAL.add(new Patient("Wilma", "Fingaheel", "HN"));
             patientAL.add(new Patient("Seymore", "Butts", "AL"));
             patientAL.add(new Patient("Omai", "Chestowsh", "HA"));
             patientAL.add(new Patient("Alotta", "Payne", "KS"));
             patientAL.add(new Patient("Mike", "Rotchertz", "KS"));
             
             
             System.out.println(patientAL.get(0).FName + " " + patientAL.get(0).LName + " " + patientAL.get(0).TriCode);
             System.out.println(patientAL.get(1).FName + " " + patientAL.get(1).LName + " " + patientAL.get(1).TriCode);
             System.out.println(patientAL.get(2).FName + " " + patientAL.get(2).LName + " " + patientAL.get(2).TriCode);
             System.out.println(patientAL.get(3).FName + " " + patientAL.get(3).LName + " " + patientAL.get(3).TriCode);
             System.out.println(patientAL.get(4).FName + " " + patientAL.get(4).LName + " " + patientAL.get(4).TriCode);
             System.out.println(patientAL.get(5).FName + " " + patientAL.get(5).LName + " " + patientAL.get(5).TriCode);
             System.out.println(patientAL.get(6).FName + " " + patientAL.get(6).LName + " " + patientAL.get(6).TriCode);
             System.out.println(patientAL.get(7).FName + " " + patientAL.get(7).LName + " " + patientAL.get(7).TriCode);
             
             System.out.println();
             
         
            
            triSim.readFromFile();
           // System.out.println(triSim.patientArray1.get(0).FName);
           // System.out.println("");
          //  System.out.println(triSim);
            
    }
}

