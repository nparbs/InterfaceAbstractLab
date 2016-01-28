package lab2fix;

import lab1fixed.*;
import lab1.*;
import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements ProgrammingCourse {
    
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse() { 
        
    }
    public IntroToProgrammingCourse(String name, String num) {  
        this.courseName=name;
        this.courseNumber=num;
    }

   

    @Override
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            System.out.println("BAD COURSE #");
        }else{
        this.courseNumber=courseNumber;
        //this.setCourseNumber(courseNumber);
        }
    }


    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            System.out.println("BAD CREDIT #");
        }else{
        this.credits=credits;
        //this.setCredits(credits);
        }
    }

    @Override
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
                System.out.println("BAD NAME #");
        }else{
        this.courseName=courseName;
        //this.setCourseName(courseName);
        }
    }
    @Override
    public String getCourseName() {
        return courseName;    
    }
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    @Override
    public double getCredits() {
        return credits;
    }

    
}
