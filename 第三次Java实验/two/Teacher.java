package two;

public class Teacher extends People{
    String[][] stu = new String[1][4];
    String[]courses = new String[1];
    int[] status = {0,0,0,0,0};
    public Teacher(String name, int id, String courses[]) {
        super();
        this.name = name;
        this.id = id;
        this.courses = courses;
    }
    public void setStatus(int i) {
        status[i] = 1;
    }
    public String getCourses(int i) {
        return courses[i];
    }
    public void setStudent(String name, int id, String courses) {
        num++;
        stu[num-1][0] = name;
        stu[num-1][1] = String.valueOf(id);
        stu[num-1][2] = courses;
    }
}
