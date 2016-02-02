/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2fix;

/**
 *
 * @author nparbs
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
