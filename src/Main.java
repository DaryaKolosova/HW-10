public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 ");

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        System.out.println("Задача 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println("Задача 3");

        String fullName3 = "Иванов Семён Семёнович";
        String fullName3Changed = fullName3.replace('ё', 'e');
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName3Changed);
    }

}