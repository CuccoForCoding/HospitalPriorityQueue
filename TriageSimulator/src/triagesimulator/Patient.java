package triagesimulator;

/**
 // Joey Cucco
 */
public class Patient {

    public String FName;
    public String LName;
    public String TriCode;
    public int priority;

    public Patient() {

    }

    public Patient(String firstName, String lastName, String condition) {
        
        this.FName = firstName;
        this.LName = lastName;
        this.TriCode = condition;
        
         if ("AL".equals(condition) || "HA".equals(condition) || "ST".equals(condition)) {
                    priority = 1;
            }
         
         if ("BL".equals(condition) || "SF".equals(condition) || "IW".equals(condition) || "KS".equals(condition) ||"OT".equals(condition)) {
                    priority = 2;
        }
         
          if ("HN".equals(condition)) {
                    priority = 3;
        }
    }
}
