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
public class IntroToProgrammingCourse extends ProgrammingCourse {
    
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        //this.setCourseName(courseName);
       // this.setCourseNumber(courseNumber);
       this.courseName=courseName;
       this.courseNumber=courseNumber;
        
    }

    public IntroToProgrammingCourse() {
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

    
}
