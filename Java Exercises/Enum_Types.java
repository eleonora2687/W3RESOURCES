// 1. Write a Java program to create an enum called "DaysOfWeek" representing the days of the week.

public class Enum_Types{
   enum Months_Of_Year{
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
   } 
   
   public static void main(String[] args) {
    Months_Of_Year current = Months_Of_Year.May;
    System.out.println("The current month is: " + current);
   }
}