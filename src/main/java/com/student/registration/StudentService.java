package com.student.registration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    
    // Fetch All Students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Fetch Student by ID
    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(null);
    }

    //Add Student
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    
    // Update Student
    public Student updateStudent(Long id, Student updatedStudent) {
        Optional<Student> existingStudentOpt = studentRepository.findById(id);
        if (existingStudentOpt.isPresent()) {
            Student existingStudent = existingStudentOpt.get();
            existingStudent.setsName(updatedStudent.getsName());
            existingStudent.setsPhone(updatedStudent.getsPhone());
            existingStudent.setsEmail(updatedStudent.getsEmail());
            existingStudent.setsCourse(updatedStudent.getsCourse());
            existingStudent.setsPassword(updatedStudent.getsPassword());
            return studentRepository.save(existingStudent);
        }
        return null;
    }
    
    // Delete Student
    public boolean deleteStudent(Long id) {
        Optional<Student> existingStudent = studentRepository.findById(id);
        if (existingStudent.isPresent()) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

