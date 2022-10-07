package com.example.springbatchtodb.processor;

import com.example.springbatchtodb.model.Student;
import com.example.springbatchtodb.repositories.StudentRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Student> {

    private StudentRepository studentRepository;

    @Autowired
    public DBWriter(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public void write(List<? extends Student> students) throws Exception {
        studentRepository.saveAll(students);
    }
}
