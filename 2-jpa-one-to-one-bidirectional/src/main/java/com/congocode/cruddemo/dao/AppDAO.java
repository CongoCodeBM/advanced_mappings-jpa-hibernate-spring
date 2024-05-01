package com.congocode.cruddemo.dao;

import com.congocode.cruddemo.entity.Instructor;
import com.congocode.cruddemo.entity.InstructorDetail;

public interface AppDAO
{
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}
