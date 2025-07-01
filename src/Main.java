//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + (age) + " он совершенолетний");
        } else {
            System.out.println("Он не достиг совершенолетия, нужно немного подождать");
        }

        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице " + (temperature) + " градусов, нужно надеть шапку");
        } else {
            System.out.println("Можно идти без шапки");
        }

        int speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " + (speed) + " то придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }

        int peopleAge = 26;
        if (peopleAge >= 2 && peopleAge <= 6) {
            System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить в детский сад");
        }
        if (peopleAge >= 7 && peopleAge <= 17) {
            System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить в школу");
        }
        if (peopleAge >= 18 && peopleAge <= 24) {
            System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить в университет");
        }
        if (peopleAge > 24) {
            System.out.println(" Если  возраст человека равен " + peopleAge + " то ему нажно работать");
        }


        int childAge = 14;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на атракционе");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на атракционе в сопровождении взрослого");
        }
        if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на атракционе без сопровождения взрослого");
        }


        int peopleInWagon = 105;
        if (peopleInWagon <= 60) {
            System.out.println("Если в вагоне " + peopleInWagon + " человек, остались сидячие места");
        } else if (peopleInWagon > 60 && peopleInWagon <= 102) {
            System.out.println("Если в вагоне " + peopleInWagon + " человек, остались стоячие места");
        } else {
            System.out.println("Вагон полностью заполнен");
        }


        int one = 3;
        int two = 5;
        int three = 7;
        if (one > two && one > three) {
            System.out.println("Первое число самое большое");
        } else if (two > one && two > three) {
            System.out.println("Второе число самое большое");
        } else {
            System.out.println("Третье число самое большое");
        }


    }
}

