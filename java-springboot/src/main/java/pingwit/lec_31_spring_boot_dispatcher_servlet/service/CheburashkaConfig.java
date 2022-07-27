package pingwit.lec_31_spring_boot_dispatcher_servlet.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Comparator;
import java.util.TreeSet;

@Configuration
public class CheburashkaConfig {

    @Bean
    public CheburashkaService cheburashkaService(EgorkaConverter egorkaConverter) {
        return new CheburashkaService(egorkaConverter);
    }

    @Bean
    public EgorkaConverter egorkaConverter() {
        return new EgorkaConverter();
    }


    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();

        persons.add(new Person());

        System.out.println(persons);
    }
}

class PersonConparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }

}
class Person implements Comparable<Person>{

    @Override
    public int compareTo(Person o) {
        return 0;
    }
    
    @Override
    public int hashCode() {
        return 666;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
