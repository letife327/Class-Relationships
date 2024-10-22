public class Main {
    public static void main(String[] args) {
        // lala adli telebe sosial kursda sigmund freydden ders alir meselen

        Student[] students = new Student[10];
        Professors[] professors = new Professors[10];
        Departament departament1 = new Departament();
        departament1.name = "IT";
        Professors professor1 = new Professors();
        Professors professor2 = new Professors();
        professor1.name="Sigmund Freud";
        professor2.name="Martin Seligman";
        professors[0] = professor1;
        professors[1] = professor2;
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student2.name = "Shamil";
        student1.name = "Latifa";
        student3.name= "Murad";
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        departament1.students = students;
        departament1.professors = professors;
        System.out.println(departament1.professors[0].name);
        Course[] cours = new Course[10];
        Course course1 = new Course();
        Course course2 = new Course();
        course1.name="Ethics";
        course2.name="Social";
        cours[0]= course1;
        cours[1]= course2;
        student1.course = course1;
        student2.course = course2;
        student3.course = course1;
        departament1.cours = cours;
        student1.departament=departament1;
        System.out.println(student1.course.name);
        student1.professor= professor1;
        professor1.student = students;
        professor1.cours = cours;
        professor2.departament = departament1;
        course1.department = departament1;
        course2.professors = professor1;
        course1.professors= professor2;
        course2.students=students;
    }
}