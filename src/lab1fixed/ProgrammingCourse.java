/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1fixed;

/**
 *
 * @author nparbs
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;

    public final String getCourseName() {
        return courseName;
    }

     public abstract void setCourseName(String courseName);

    public final String getCourseNumber() {
        return courseNumber;
    }

    public abstract void setCourseNumber(String courseNumber);
    

    public final double getCredits() {
        return credits;
    }

    public abstract void setCredits(double credits);
    
    
    
    
}
