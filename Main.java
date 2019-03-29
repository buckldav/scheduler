import java.util.TreeSet;

import filemanager.*;
import model.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        TreeSet<Course> courses = new TreeSet<Course>();
        
        courses.add(new Course("Jazz Band", 213));
        courses.add(new Course("Orchestra", 213));
        courses.add(new Course("Computer Science", 227));
        courses.add(new Course("Jazz Band 1", 213));

        for (var course : courses) {
            System.out.println(course.toString());
        }
    }
}