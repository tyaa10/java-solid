package org.tyaa.solid.d;

public class Student {
    public String firstName;
    public String lastName;
    public Integer age;
    public Double avgScore;

    public Student(String firstName, String lastName, Integer age, Double avgScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", avgScore=" + avgScore +
                '}';
    }
}
