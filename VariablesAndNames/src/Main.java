public class Main {

    public static void main(String[] args) {

        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;

        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers    available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );

        System.out.println(" ");

        //problem 2

        String x;
        String z;
        String y;

        x = "113";
        y = "2.171828";
        z = "Computer Science";


        System.out.println("This is room # " + x );
        System.out.println("3 is close to " + y );
        System.out.println("I am learning more about" + z );

        System.out.println(" ");

        //problem 3

        String c1, c2, c3, c4, c5,c6, c7, c8;

        c1 = "Fitness & Conditioning";
        c2 = "Physics";
        c3 = "Online Course";
        c4 = "Automotive";
        c5 = "Introdutory Spanish";
        c6 = "Computer Programming";
        c7 = "English";
        c8 = "Pre-Cal";

        //Teachers

        String t1, t2, t3, t4, t5, t6, t7, t8;

        t1 = "Mr. White";
        t2 = "Mr Jung";
        t3 = "Mr. O'Connor";
        t4 = "Mr. Lai";
        t5 = "Ms. Fogale";
        t6 = "Mr. Zaremba";
        t7 = "Ms. Au";
        t8 = "Mr. Tam";

        //Grade
        String a;

        a = "11";

        System.out.println("+---------------------------------------------+");
        System.out.println("| 1 | "+ c1 + a+ " |    "+ t1 +" |  " );
        System.out.println("| 2 |                "+ c2 + a+ " |      "+ t2 +" |" );
        System.out.println("| 3 |          "+ c3 + a+ " | "+ t3 +" |" );
        System.out.println("| 4 |             "+ c4 + a+ " |      " + t4 +" |");
        System.out.println("| 5 |    " + c5 + a+" |   " + t5 +" |");
        System.out.println("| 6 |    " + c6 + a+"|  "+ t6 +" |");
        System.out.println("| 7 |                "+ c7 + a+ " |       "+ t7 +" |");
        System.out.println("| 8 |                "+ c8 + a+" |      " + t8 +" |");
        System.out.println("+---------------------------------------------+");


    }
}
