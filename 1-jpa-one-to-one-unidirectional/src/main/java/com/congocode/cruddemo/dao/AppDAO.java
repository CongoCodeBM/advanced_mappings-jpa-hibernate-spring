package com.congocode.cruddemo.dao;

import com.congocode.cruddemo.entity.Instructor;

public interface AppDAO
{
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);
}
