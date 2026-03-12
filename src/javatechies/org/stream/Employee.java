package javatechies.org.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
class Employee {

    private int id;

    private String name;

    private int age;

    private String gender;

    private String department;

    private int yearOfJoining;

    private double salary;

}