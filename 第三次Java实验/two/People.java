package two;

public class People {
    protected String name;
    protected int id;
    protected String studentName;
    protected int  studentId;
    protected int num = 0;
    public People() {
        super();
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getNum() {
        return num;
    }
}
