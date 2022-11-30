public class Person {

   private final String name;
   private final String surname;
   private int ticket;

   public Person(String name, String surname, int ticket) {
       this.name = name;
       this.surname = surname;
       this.ticket = ticket;
   }

   public boolean minusTicket (Person person) {
       if (person.ticket > 0) {
           person.ticket--;
           System.out.println(person.name + person.surname + "прокатился на атракционе!");
           return true;
       } else {
           return false;
       }
    }
}
