import java.util.Scanner;

class Student {
private String name;

//getter method 
public String GetName(){
    return name;
}

//setter method
public void setName(String name){
    this.name = name;
}
    
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Ritesh");
        System.out.println("student Name :" +s.GetName());

    }
}
