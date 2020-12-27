package ru.mirea.lab6;

public class StudentInsertionSort {
    public static void main(String[] args) {

            Student[] students = new Student[8];
            students[0] = new Student("Кирилл", "Воронин", 14);
            students[1] = new Student("Сергей", "Скориков", 12);
            students[2] = new Student("Иван", "Морозов", 25);
            students[3] = new Student("Александр", "Терентьев", 31);
            students[4] = new Student("Иван", "Паршин", 11);
            students[5] = new Student("Семен", "Ковязин", 14);
            students[6] = new Student("Диана", "Серегина", 21);
            students[7] = new Student("Александр", "Розенбаум", 31);

            for ( int i = 1; i < students.length; ++i ) {
                for ( int j = 0; j < i; ++j ) {
                    if ( students[i].iD() < students[j].iD() ) {
                        Student tmp = students[i];
                        for ( int k = i - 1; k >= j; --k )
                            students[k + 1] = students[k];
                        students[j] = tmp;
                    }
                }
            }

            System.out.printf("%-32s | %6s\n", "Имя", "ID");
            for ( int i = 0; i < students.length; ++i )
                System.out.printf("%-32s | %6d\n", students[i].getFullName(), students[i].iD());
        }
    }

