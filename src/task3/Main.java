package task3;

public class Main {
    public static void main(String[] args) {
        Student[] students = getStudents();

        for (Student student : students) {
            student.printNameIfHighMark();
        }
    }

    public static Student[] getStudents() {
        return new Student[]{
                new Student("Turko O.S.", 2, new int[]{6, 8, 9, 10, 10}),
                new Student("Ivanov O.S.", 2, new int[]{6, 8, 9, 10, 10}),
                new Student("Petrov O.S.", 17, new int[]{10, 9, 9, 10, 10}),
                new Student("Sidorov O.S.", 4, new int[]{10, 9, 9, 10, 10}),
                new Student("Marly O.S.", 1, new int[]{10, 9, 8, 10, 10}),
                new Student("Huba O.S.", 3, new int[]{10, 9, 9, 10, 10}),
                new Student("Shibkova O.S.", 10, new int[]{1, 9, 2, 3, 10}),
                new Student("Mitop O.S.", 3, new int[]{10, 9, 9, 10, 10}),
                new Student("Beeymor O.S.", 6, new int[]{0, 7, 9, 10, 10}),
                new Student("Pupko O.S.", 5, new int[]{4, 5, 9, 10, 10}),
        };
    }
}
