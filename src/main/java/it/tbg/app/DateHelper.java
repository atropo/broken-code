package it.tbg.app;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class DateHelper {

    public static int calculateAge(LocalDate birthDate){
        LocalDate currentDate = getLocalDate();

        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    private LocalDate getLocalDate() {
        Date today = new Date();
        return today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

}
