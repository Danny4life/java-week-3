package week_3_curriculum.demo_project.model;

import week_3_curriculum.demo_project.enums.CourseOffer;

public class Course {

    private CourseOffer courseOffer;

    public Course(CourseOffer courseOffer) {
        this.courseOffer = courseOffer;
    }

    public CourseOffer getCourseOffer() {
        return courseOffer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseOffer=" + courseOffer +
                '}';
    }
}
