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

        IntroToProgrammingCourse intToPro = new IntroToProgrammingCourse();
        intToPro.setCourseName("Intro To Programming");
        intToPro.setCourseNumber("42424");
        System.out.println(intToPro.getCourseName());
            System.out.println(intToPro.getCourseNumber());
            
            
                IntroJavaCourse java1 = new IntroJavaCourse();
        java1.setCourseName("Into To Java");
        java1.setCourseNumber("46672");
        System.out.println(java1.getCourseName());
        System.out.println(java1.getCourseNumber());
        
        
    }
    
}
