package example;
import example.Data.Student;
import example.Data.Subject;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MEUrena on 7/4/16.
 * All rights reserved.
 */
@WebService()
public class StudentService {

    static Map<String, Student> studentsMap = new HashMap<>();
    static List<Subject> subjects = new ArrayList<>();

    @WebMethod
    public void createStudent(int id, String name, String career, List<Subject> studentSubjects) {
        Student newStudent = new Student(id, name, career);
        newStudent.setSubjects(studentSubjects);
        String stringId = String.valueOf(id);
        studentsMap.put(stringId, newStudent);
    }

    @WebMethod
    public Subject getSubject(int index) {
        return subjects.get(index);
    }

    @WebMethod
    public List<Subject> listSubjects() {
        return subjects;
    }

    @WebMethod
    public Student getStudent(int id) {
        String stringId = String.valueOf(id);
        return studentsMap.get(stringId);
    }

    @WebMethod
    public void updateStudent(Student student) {
        String stringId = String.valueOf(student.getId());
        studentsMap.put(stringId, student);
    }

    @WebMethod
    public void removeStudent(int id) {
        String stringId = String.valueOf(id);
        studentsMap.remove(stringId);
    }

    @WebMethod
    public List<Student> listStudents() {
        return new ArrayList<Student>(studentsMap.values());
    }

    private static void populateSubjects() {

        subjects.add(new Subject("ISC-573", "Tecnologias Emergentes"));
        subjects.add(new Subject("ISC-581", "Temas Especiales ISC"));
        subjects.add(new Subject("ISC-415", "Programacion Web"));
        subjects.add(new Subject("ISC-517", "Programacion Web Avanzada"));
        subjects.add(new Subject("ISC-571", "Proyecto Final"));

    }

    public static void main(String[] argv) {
        populateSubjects();
        Object implementor = new StudentService();
        String address = "http://localhost:9000/StudentService";
        Endpoint.publish(address, implementor);
    }

}
