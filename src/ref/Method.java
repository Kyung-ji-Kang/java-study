package ref;

public class Method {
    public static void main(String[] args) {

        Student st1 = CreateStudent("강경지",28,100);
        Student st2 = CreateStudent("김민주",25,90);
        PrnStudent(st1);
        PrnStudent(st2);

    }

    static Student CreateStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void PrnStudent(Student student){
        System.out.println("이름: "+student.name+" 나이: "+ student.age+" 성적: "+ student.grade);
    }
}
