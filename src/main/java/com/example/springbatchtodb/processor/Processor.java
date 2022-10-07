package com.example.springbatchtodb.processor;

import com.example.springbatchtodb.model.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class Processor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {
        Integer year = 2022 - student.getAge();
        String dob = "01-01-" + year;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d-MM-yyyy");
        LocalDate dobDate = LocalDate.parse(dob, format);
        student.setDob(dobDate);
        return student;
    }
}
