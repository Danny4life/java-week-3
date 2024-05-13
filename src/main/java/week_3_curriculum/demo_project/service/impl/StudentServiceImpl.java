package week_3_curriculum.demo_project.service.impl;

import week_3_curriculum.demo_project.model.Principal;
import week_3_curriculum.demo_project.model.Student;
import week_3_curriculum.demo_project.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void expelStudent(Student student, Principal principal) {
        System.out.println("Student FullName : " +
                student.getName() + "\n" + "Expulsion Duration : " +
                "2 WEEKS" + "\n" + "Expelled By : " +
                "Principal " + principal.getName());

    }
}
