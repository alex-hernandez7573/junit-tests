import java.util.ArrayList;

public class Student {

    private Long id;
    private String name;

    private ArrayList <Integer> grades;

    public Student (String name, Long id) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade (int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage(){
        int acc = 0;
        for (int i = 0; i < grades.size(); i++) {
            acc = acc +grades.get(i);
        }
        return acc/ grades.size();
    }
}
