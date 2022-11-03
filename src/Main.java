public class Main {
    public static void main(String[] args) {

        System.out.println("Задание № 1");

        System.out.println("Задача № 1");
        int age = 22;

        if (age < 18) {
            System.out.println("К сожалению вы еще несовершеннолетний.");
        }
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }

        System.out.println("Задача № 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

        System.out.println("Задача № 3");
        short passengers = 102;
        short seatsRailwayCarriage = 102;
        short sittingPlace = 60;
        int standingPlace = seatsRailwayCarriage - sittingPlace;

        if (sittingPlace <= passengers && passengers < seatsRailwayCarriage) {
            System.out.println("Остались только стоячие места.");
        }
        if (sittingPlace > passengers) {
            System.out.println("Ещё остались сидячие места.");
        }
        if (seatsRailwayCarriage <= passengers) {
            System.out.println("вагон уже полностью забит");
        }


        System.out.println("Задание № 2");

        System.out.println("Задача № 1");
        if (age < 18) {
            System.out.println("К сожалению вы еще несовершеннолетний.");
        } else {
            System.out.println("Поздравляем с совершеннолетием!");
        }

        System.out.println("Задача № 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

        System.out.println("Задача № 3");
        if (sittingPlace <= passengers && passengers < seatsRailwayCarriage) {
            System.out.println("Остались только стоячие места.");
        }
        if (sittingPlace > passengers) {
            System.out.println("Ещё остались сидячие места.");
        } else {
            System.out.println("Вагон уже полностью забит");
        }


        System.out.println("Задание № 3");

        System.out.println("Задача № 1");
        if (age > 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему Нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }

        System.out.println("Задача № 2");
        if (age < 5) {
            System.out.println("Ребенку меньше 5 лет, он не может кататься на аттракционе.");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Ребенку больше 5, но меньше 14 лет, он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Ребенок старше 14 лет, можно кататься без сопровождения взрослого.");
        }

        System.out.println("Задача № 3");
        int one = 22;
        int two = 33;
        int three = 11;

        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число " + one);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число " + two);
            } else {
                System.out.println("Максимальное число " + three);
            }

        } else if (one > three) {
            System.out.println("Максимальное число " + one);
        } else if (three > one) {
            System.out.println("Максимальное число " + three);
        } else {
            System.out.println("Все три числа равны " + one);
        }
    }
}