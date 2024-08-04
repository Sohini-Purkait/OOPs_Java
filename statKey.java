class Student{
    String name;
    static String school;  //school name is same for all the students

    public static void changeSchool(){
        school = "newschool";
    }
}

public class OOPS{
    public static void main(String args[]){
       Student.school = "JMV";
       Student s1 = new Student();
       s1.name = "John";
       System.out.println(s1.school);
    }
}