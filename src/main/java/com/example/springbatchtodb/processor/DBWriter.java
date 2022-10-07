package com.example.springbatchtodb.processor;

import com.example.springbatchtodb.model.Student;
import com.example.springbatchtodb.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DBWriter implements ItemWriter<Student> {

    private final StudentRepository studentRepository;

    @Override
    public void write(List<? extends Student> students) throws Exception {
        studentRepository.saveAll(students);
    }
}
