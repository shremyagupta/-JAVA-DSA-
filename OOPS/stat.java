public class stat {
    public static void main (String[] args){
        Student s1 = new Student();
        s1.schoolName = "JVM";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";
    }
}
class Student{
    String name ;
    int roll;
    static String schoolName;
    void setName(String name){
    this.name = name;
    }
    String getName(){
        return this.name;

    }
}
