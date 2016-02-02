/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2fix;

import lab1fixed.*;

/**
 *
 * @author nparbs
 */
public class StartUp {
    
    public static void main(String[] args) {

   IntroToProgrammingCourse intToPro = 
                new IntroToProgrammingCourse("intro to prog","427573424");
        //intToPro.setCourseName("Intro To Programming");
        //intToPro.setCourseNumber("42424");
        System.out.println(intToPro.getCourseName());
        System.out.println(intToPro.getCourseNumber());
        
        IntroJavaCourse java1 = 
                new IntroJavaCourse("java1","4236774");
        System.out.println(java1.getCourseName());
        System.out.println(java1.getCourseNumber());
        
        //AdvancedJavaCourse advJava = 
        //        new AdvancedJavaCourse();
        
        //Polymorphism
        ProgrammingCourse[] courses = {new IntroToProgrammingCourse(),
            new AdvancedJavaCourse()};
        for(ProgrammingCourse c : courses){
            c.setCredits(3);
            System.out.println(c.getCredits());
            
        }
        }
    
}
