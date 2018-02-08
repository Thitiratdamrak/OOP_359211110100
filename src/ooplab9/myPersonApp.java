package ooplab9;

import com.sun.jndi.cosnaming.IiopUrl;

public class myPersonApp {
    public static void main(String[] args) {
        Person person = new Person("1111111111111",
                "Thitirat damrak",
                new Address("10 M.12", "Nakorn",
                        "80110"),
                new Job("Student", 5000));

        System.out.println(person.toString());

        person.getJob().setSalary(10000);
        System.out.println("Name: "+person.getName()+
                " Salary: "+person.getJob().getSalary());
    }   //main
}
