package zadanie6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dziennik {
    private List<Student> studentLists = new ArrayList<>();


    public void dodajStudenta(Student student) {
        this.studentLists.add(student);
    }

    public void usunStudenta(Student student) {
        this.studentLists.remove(student);
    }

    public void usunStudentaIndex(String index) {
        for (Student student : studentLists) {
            if (student.getNumerIndexu().equals(index))
                studentLists.remove(student);
            break;
        }
    }

    //    public Student zwracaStudenta(String index) {
//        for (Student student : studentLists) {
//            if (student.getNumerIndexu().equals(index))
//              return student;
//
//        }
//        return null;
//    }
    public Optional<Student> zwracaStudenta(String index) {
        for (Student student : studentLists) {
            if (student.getNumerIndexu().equals(index))
                return Optional.of(student);

        }
        return Optional.empty();
    }


    public Optional<Double> podajSredniaStudenta(String index) {
        Optional<Student> studentOptional = zwracaStudenta(index);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            return student.obliczSrednia();
        }
        return Optional.empty();
    }


    public List<Student> podajStudentówZagrozonych() {
        List<Student> zagrozeni = new ArrayList<>();
        for (Student student : studentLists) {
            Optional<Double> srednia = student.obliczSrednia();
            if (srednia.isPresent() && srednia.get() <= 2.5) {
                zagrozeni.add(student);
            }
        }
        return zagrozeni;


    }
}

