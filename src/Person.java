import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Person {
    public static void main(String[] args) {
        Stream.of(
         new Person("Oleg");
         new Person("Vladimir");
         new Person("Olga");
         new Person("Tatjana");

        List<Person> person = new ArrayList<>();
        person.stream()
                .map(p-> p.getName().length()>6)
                .filter(mama -> mama != null)
                .filter(papa-> papa != null)
                .forEach();

    }
}


//1. Создайте класс Person
//1.2 Добавьте в этот класс 3 поля: имя, папа и мама. Папа и мама - тоже поля класса Person
//2.1. У вас есть список из людей, найдите среди них всех их мам и пап, у которых имя длиннее 6 букв
//
//Подскажка: Делайте либо через Stream.of(), либо делаем по отдельности (способ Владимира)
//
//Дополнение: важно поработать со стримами, но разрешается где-то какое-то действие выполнить без них