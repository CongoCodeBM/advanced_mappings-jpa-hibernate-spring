package com.congocode.cruddemo.dao;

import com.congocode.cruddemo.entity.Course;
import com.congocode.cruddemo.entity.Instructor;
import com.congocode.cruddemo.entity.InstructorDetail;

import java.util.List;

public interface AppDAO
{
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void updateInstructor(Instructor tempInstructor);

    void updateCourse(Course tempCourse);

    Course findCourseById(int theId);

    void deleteCourseById(int theId);
}
