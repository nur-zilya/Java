import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(collectBirthdays(1999, 4, 28));
    }

    public static String collectBirthdays(int year, int month, int day){
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter dowFormatter = DateTimeFormatter.ofPattern("EEE", Locale.ENGLISH);
        int index = 0;
        StringBuilder sb = new StringBuilder();

        for (int birthdayYear = year; birthdayYear <= currentYear; birthdayYear++){
            LocalDate birthday;
            try{
                birthday = LocalDate.of(birthdayYear, month, day);
            } catch (DateTimeException e){
                continue;
            }

            if (birthday.isAfter(today)){
                break;
            }

            String formattedDate = birthday.format(dateFormatter);
            String dayOfWeek = birthday.format(dowFormatter);

            sb.append(index).append("-").append(formattedDate).append("-").append(dayOfWeek);

            sb.append(System.lineSeparator());
            index++;
        }
        return sb.toString();
    }
}