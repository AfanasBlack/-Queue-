public class Person {

   public String name;

   public String surname;
   public int ticket;

   public Person(String name, String surname, int ticket) {
       this.name = name;
       this.surname = surname;
       this.ticket = ticket;
   }

   public void minusTicket () {
       if (ticket > 0) {
           ticket--;
       }
    }
}
