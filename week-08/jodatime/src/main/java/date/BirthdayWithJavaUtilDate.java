package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public final class BirthdayWithJavaUtilDate implements BirthdayCalculator<Date> {

    @Override
    public Date parseDate(String str) {
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
        Date result = null;
        try {
            result = parser.parse(str);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + parser);
        }
        return result;
    }

    @Override
    public String printMonthAndDay(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("MM-dd");
        String reportDate = df.format(date);
        return reportDate;
    }

    @Override
    public boolean isAnniversaryToday(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("MM-dd");
        String currentDate = df.format(new Date());
        String compareDate = df.format(date);
        if (currentDate.matches(compareDate)) {
            return true;
        }
        return false;
    }

    @Override
    public int calculateAgeInYears(Date birthday) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        String currentDate = df.format(new Date());
        String compareDate = df.format(birthday);
        int currentYear = Integer.parseInt(currentDate);
        int compareYear = Integer.parseInt(compareDate);
        return currentYear - compareYear;
    }


    @Override
    public int calculateDaysToNextAnniversary(Date date) {
        final Calendar c = Calendar.getInstance();
        c.setTime(date);
        final Calendar today = Calendar.getInstance();

        final int BMonth = c.get(Calendar.MONTH);
        final int CMonth = today.get(Calendar.MONTH);

        final int BDate = c.get(Calendar.DAY_OF_MONTH);
        final int CDate = today.get(Calendar.DAY_OF_MONTH);

        c.set(Calendar.YEAR, today.get(Calendar.YEAR));
        c.set(Calendar.DAY_OF_WEEK,
                today.get(Calendar.DAY_OF_WEEK));
        if (BMonth < CMonth) {
            c.set(Calendar.YEAR,
                    today.get(Calendar.YEAR) + 1);
        } else if (BMonth == CMonth) {
            if (BDate < CDate) {
                c.set(Calendar.YEAR,
                        today.get(Calendar.YEAR) + 1);
            }
        }

        final long millis = c.getTimeInMillis()
                - today.getTimeInMillis();
        final long days = millis / 86400000;
        int daysInINt = new Long(days).intValue();
        return daysInINt;
    }

    public static void main(String[] args) {
        new BirthdayWithJavaUtilDate().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        Date birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");

}
