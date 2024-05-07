public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача № 1 ");
        System.out.println();
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println(" Итирация цикла " + i);
        }
        System.out.println();
        System.out.println(" Задача № 2 ");
        System.out.println();
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(" Итирация цикла " + i);
        }
        System.out.println();
        System.out.println(" Задача № 3 ");
        System.out.println();
        for (int i = 2; i < 17; i = i + 2) {
            System.out.println(" Итирация цикла " + i);
        }
        System.out.println();
        System.out.println(" Задача № 4 ");
        System.out.println();
        for (int i = -10; i < 11; i = i + 1) {
            System.out.println(" Итирация цикла " + i);
        }
        System.out.println();
        System.out.println(" Задача № 5 ");
        System.out.println();
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " Год являеться високосным ");
        }
        System.out.println();
        System.out.println(" Задача № 6 ");
        System.out.println();
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(" Итирация цикла " + i);
        }
        System.out.println();
        System.out.println(" Задача № 7 ");
        System.out.println();
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(" Итирация цикла " + i);
        }
        System.out.println();
        System.out.println(" Задача № 8 ");
        System.out.println();
        {
            int salary = 29000;
            int total = 0;
            for (int i = 1; i < 12; i = i + 1) {
                total = total + salary;
                System.out.println(" Месяц " + i + " , сумма накоплений равна " + total + " рублей ");
            }
        }

        System.out.println();
        System.out.println(" Задача № 9 ");
        System.out.println();

        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 12; i = i + 1) {
            total = total + salary;
            total = total + total / 100;
            System.out.println(" Месяц " + i + " , сумма накоплений равна " + total + " рублей ");
        }
        System.out.println();
        System.out.println(" Задача № 10 ");
        System.out.println();
        for (int i = 1; i < 11; i = i +1) {
            System.out.println(" 2 * " + i + " = " + i * 2);
        }
    }
}
