import java.util.*;

public class Student {
    private static int currentIndexNumber = 1;

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private Date birthDate;
    private String indexNumber;
    private StudyProgramme studyProgramme;
    private int currentSemester;
    private String status;
    private Map<String, Integer> grades;

    public Student(String firstName, String lastName, String email, String address, String phoneNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.indexNumber = "s" + currentIndexNumber++;
        this.currentSemester = 1;
        this.status = "Kandydat";
        this.grades = new HashMap<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
        this.status = "Student";
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public String getStatus() {
        return status;
    }

    public void addGrade(int grade, String subject) {
        grades.put(subject, grade);
    }

    public void promoteToNextSemester() {
        if (currentSemester < studyProgramme.getNumberOfSemesters()) {
            int itnCount = (int) grades.values().stream().filter(g -> g < 3).count();
            if (itnCount <= studyProgramme.getMaxItnsAllowed()) {
                currentSemester++;
            }
        } else {
            status = "Absolwent";
        }
    }

    public void displayInfo() {
        System.out.println("Student: " + firstName + " " + lastName + ", Index: " + indexNumber + ", Semester: " + currentSemester + ", Status: " + status);
    }
}


