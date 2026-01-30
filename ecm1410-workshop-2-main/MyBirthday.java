public class MyBirthday {
    public static void main(String[] args){
        int currentDay = 2; 
        int currentDate = 7; 
        int myBirthdayDate = 23;

        // value below is a constant
        final int DAYS_A_WEEK = 7;

        // Tasks

        // 1. calc number of days from current date
        //    to birthday

        int currentdaytobirthday = myBirthdayDate - currentDate;
        // 2. use this along with the current weekday 
        //    to find when the birthday falls
        int birthdayday = (currentDay + currentdaytobirthday) % DAYS_A_WEEK;

        System.out.println("birthday day: " + birthdayday);
    }
}