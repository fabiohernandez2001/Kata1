
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.Period;
public class Person {
    private final String name;
    private final LocalDate birthdate;
    private final long MILISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    public int getAge(){
        LocalDate today = LocalDate.now();
        return Period.between(birthdate,today).getYears();
    }
}