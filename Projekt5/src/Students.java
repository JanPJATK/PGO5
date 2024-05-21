import java.util.*;

public class Students {
        private static List<Student> studentList = new ArrayList<>();

        public static void addStudent(Student student) {
                studentList.add(student);
        }

        public static void promoteAllStudents() {
                for (Student student : studentList) {
                        student.promoteToNextSemester();
                }
        }

        public static void displayInfoAboutAllStudents() {
                for (Student student : studentList) {
                        student.displayInfo();
                }
        }

        public static void main(String[] args) {
                Student s = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(1980, 1, 1));
                addStudent(s);

                StudyProgramme it = new StudyProgramme("IT", "AAA", 7, 5);
                s.enrollStudent(it);
                s.addGrade(5, "PGO");
                s.addGrade(2, "APBD");

                promoteAllStudents();
                displayInfoAboutAllStudents();
        }
}
