package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map;
public class ListofEmployee {
    public static void main (String [] args) {
        Map<String, Employee> persons = new HashMap<>();
        persons.put("1", new Employee("Anchal", 100, "Acad"));
        persons.put("2", new Employee("Shivani", 200, "AEM"));
        persons.put("3", new Employee("Shubham", 300, "AEM"));



        for (Map.Entry<String,Employee> entry : persons.entrySet()) {

//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());

            Employee employee =   entry.getValue();
            System.out.println("Department   " + employee.getDepartment());
            System.out.println("Name   " + employee.getName());
            System.out.println("Salary    " + employee.getSalary());

        }
    }
}
