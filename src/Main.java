import java.util.*;

public class Main {

    public static void main(String[] args) {

        Deque<Person> personQueue = new LinkedList<>(generateClients());

        while (true) {
            Person s = personQueue.pollFirst();
            if (s == null) {
                System.out.println("Программа завершена!");
                break;
            }
            if (s.minusTicket(s)) {
                personQueue.addLast(s);
            } else {
                personQueue.remove(s);
            }
        }
    }


    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();

        Person person1 = new Person("Petya", " Petrov ", 3);
        Person person2 = new Person("Tanya", " Ivanov ", 2);
        Person person3 = new Person("Kolya", " Vavilov ", 5);
        Person person4 = new Person("Pasha", " Tihov ", 4);
        Person person5 = new Person("Sasha", " Gusev ", 6);

        clients.add(person1);
        clients.add(person2);
        clients.add(person3);
        clients.add(person4);
        clients.add(person5);
        return clients;
    }
}
