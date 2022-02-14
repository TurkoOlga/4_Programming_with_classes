package task3;
/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.

 */

public class Student {
    private String surname;
    private int group;
    private int[] marks;

    public Student(String surname, int group, int[] marks) {
        this.surname = surname;
        this.group = group;
        this.marks = marks;
    }

    public void printNameIfHighMark() {
        boolean print = true;
        for (int mark : marks) {
            if (mark != 9 && mark != 10) {
                print = false;
                break;
            }
        }
        if (print) {
            System.out.println(surname + " " + group);
        }
    }
}
