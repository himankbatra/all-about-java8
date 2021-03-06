package com.himank.all_about_java8.learnjava.streams;

import com.himank.all_about_java8.learnjava.data.Student;
import com.himank.all_about_java8.learnjava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {

    public static List<Student> filterStudents(){

        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .filter((student -> student.getGender().equals("female"))) //Stream<Student>
                //filters and sends only the students whose gender is female
                .filter(student -> student.getGpa()>=3.9)
                .collect(toList());

    }

    public static void main(String[] args) {

        //System.out.println("filterStudents : " + filterStudents());
        filterStudents().forEach(System.out::println);

    }
}
