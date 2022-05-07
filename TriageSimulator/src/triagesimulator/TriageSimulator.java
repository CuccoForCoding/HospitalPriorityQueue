package triagesimulator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.nio.charset.StandardCharsets;
import java.lang.Comparable;
import java.util.ArrayList;

/**
 // Joey Cucco
 */
public class TriageSimulator {

    public String lineFromFile;
    public String FName;
    public String LName;
    public String TriCode;
    public int priority;

    ArrayList<Patient> patientArray1 = new ArrayList<>();
    ArrayList<Patient> patientArray2 = new ArrayList<>();
    ArrayList<Patient> patientArray3 = new ArrayList<>();

    public TriageSimulator() {

    }

    public TriageSimulator(String firstName, String lastName, String condition) {
        this.FName = firstName;
        this.LName = lastName;
        this.TriCode = condition;

        if (priority == 1) {
            System.out.println(condition);
        }

        if (priority == 2) {
            System.out.println(condition);
        }

        if (priority == 3) {
            System.out.println(condition);
        }
    }

    public void add(String lineFromFile) {
        this.lineFromFile = lineFromFile;
    }

    public void remove() {

        if (patientArray1.get(0) != null) {
            System.out.println(patientArray1.get(0).FName);
            patientArray1.remove(0);
        }

        if (patientArray2.get(0) != null) {
            System.out.println(patientArray2.get(0).FName);
            patientArray2.remove(0);
        }

        if (patientArray3.get(0) != null) {
            System.out.println(patientArray3.get(0).FName);
            patientArray3.remove(0);

        }
    }

    public boolean isEmpty() {
        return true;
    }

    public TriageSimulator readFromFile() throws IOException {
        String fileName = "TriageSimulator.txt";
        TriageSimulator TriTemp = new TriageSimulator();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(fileName), StandardCharsets.UTF_8));) {
            String line;
            while ((line = br.readLine()) != null) {
                String arr[] = line.split(" ", 3);
                Patient p = new Patient(arr[0], arr[1], arr[2]);
                if (p.priority == 1) {
                    patientArray1.add(p);
                }
                if (p.priority == 2) {
                    patientArray2.add(p);
                }
                if (p.priority == 3) {
                    patientArray3.add(p);
                }
                System.out.println(p.FName);
                System.out.println(p.LName);
                System.out.println(p.TriCode);
                System.out.println(p.priority);
            }
            return TriTemp;
        }
    }
}
