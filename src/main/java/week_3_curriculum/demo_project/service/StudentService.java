package week_3_curriculum.demo_project.service;

import week_3_curriculum.demo_project.model.Principal;
import week_3_curriculum.demo_project.model.Student;

public interface StudentService {
    void expelStudent(Student student, Principal principal);
}
