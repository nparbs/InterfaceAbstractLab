package lab2fix;

import lab1fixed.*;
import javax.swing.JOptionPane;
import lab1.*;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    /*public IntroJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }*/

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits=credits;
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
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            System.out.println("BAD COURSE #");
        }else{
        this.courseNumber=courseNumber;
        //this.setCourseNumber(courseNumber);
        }
    }

     public String getCourseName() {
        return courseName;    
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public double getCredits() {
        return credits;
    }

}
