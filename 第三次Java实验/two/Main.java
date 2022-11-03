package two;

import java.util.*;

public class Main{
    static int teachernum = 0;
    public static void main(String[] args) {
        ArrayList<Teacher> p = new ArrayList<Teacher>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎使用选课系统，请选择需要操作的对象");
            System.out.println("1、教师系统 | 2、学生系统");
            String choice = scanner.next();
            if(Objects.equals(choice, "1") ) {
                teachernum++;               
                switch (choice) {
                    case "1":
                        addProfessor(p);
                        break; 
                }
            } else if(teachernum == 0) {
                System.out.println("教师暂未录入课程");
                break;
            } else if(Objects.equals(choice,"2")) {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("欢迎进入学生系统");
                    System.out.println("请输入姓名");
                    String name = scanner1.next();
                    System.out.println("请输入学号");
                    int id1 = Integer.parseInt(scanner1.next());
                    while (true) {
                        for (int i = 1; i <= p.size(); i++) {
                            Teacher p1 = p.get(i - 1);
                            System.out.println("课程序号  " + "教授名称     " + "教授工号   " + "课题名称");
                            System.out.println((5 * i - 4) + "          " + p1.getName() + "          " + p1.getId() + "          " + p1.getCourses(0));
                        }
                        int c = Integer.parseInt(scanner.next());
                        if (c >= 1 && c <= p.size() * 5) {
                            Teacher p1 = p.get((int) Math.ceil((double) c / 5) - 1);
                            int c1;
                            if (c <= 5) {
                                c1 = c;
                            } else {
                                c1 = c % 5;
                            }
                                p1.setStudent(name,id1, p1.getCourses(c1 - 1));
                                p1.setStatus(c1 - 1);
                                p.set((int) Math.ceil((double) c / 5) - 1,p1);
                                System.out.println("选课完成！\n");
                                break;
                        }
                                System.out.println("选课完成！\n");
                                break;
                            }
                        }
                    }
            }
    private static void addProfessor(ArrayList<Teacher> p) {
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.next();
        System.out.println("教工号");
        int id  = Integer.parseInt(scanner.next());
        for(int i = 0; i < p.size(); i++) {
            if (Objects.equals(p.get(i).getName(), name) && Objects.equals(p.get(i).getId(), id)) {
                flag++;
                System.out.println("欢迎查看您的学生信息");
                if(p.get(i).getNum() == 0) {
                    System.out.println("还没有学生选择您的课程！\n");
                } else {
                    for(int j = 0; j < p.get(i).getNum(); j++) {
                        System.out.println("姓名:   " + p.get(i).stu[j][0] + "   id:   "+ p.get(i).stu[j][1] + "    课程:   " + p.get(i).stu[j][2]);
                    }
                }
            }
        }
        String[] courses = new String[5];
        if(flag == 0){
            System.out.println("请输入您所开设的课程");
            for(int k = 0; k < 1; k++) {
                courses[k] = scanner.next();
            }
            Teacher p1 = new Teacher(name, id, courses);
            p.add(p1);
            System.out.println("创建课程成功，感谢使用");
            System.out.println();
        }
    }
}