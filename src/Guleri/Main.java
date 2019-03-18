package Guleri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hello foodie,\n welcome to the food court order system:" +
                "choose your order:-------" +
                "\n\n\033[1;32m" +
                "French Fries                    \t106/-\n" +
                "Chilli Cheese Toast             \t115/-\n" +
                "Chilli Cheese Gralic Toast      \t115/-\n" +
                "Garlic Bread                    \t98/-\n" +
                "Garlic Bread with Cheese        \t119/-\n\033[0m" +
                "  \t \n" +
                "\033[1;33m" +
                "Sandvich \t \n" +
                "Plain Sandwich                  \t175/-\n" +
                "Grilled Sandwich                \t175/-\n" +
                "Club Sandwich                   \t175/-\033[0m\n" +
                "  \t \n" +
                "Burgers \t \n" +
                "Veg. Burger                     \t72/-\n" +
                "  \t \n" +
                "\033[1;34m Pizza's \t \n" +
                "Plain Cheese Pizza              \t190/-\n" +
                "Capsicum, Onion Pizza           \t210/-\n" +
                "Tomato, Onion Pizza             \t210/-\n" +
                "Capsicum, Onion, Mashroom Pizza \t250/-\n" +
                "Jain Spl. Pizza                 \t250/-\n" +
                "Tandoori Pizza                  \t250/-\n" +
                "Veggie Pizza(Double Cheese)     \t265/-\n" +
                "  \t \n" +
                "Extra Toppings \t \n" +
                "Cheese                          \t55/-\n" +
                "  \t \n" +
                "Hearth Stone Special \t \n" +
                "Lasanana Roll                   \t133/-\n" +
                "Paneer Salsa Wrap               \t133/-\n" +
                "Lebenense Fala Fel              \t133/-\033[0m \n" +
                "  \t \n " +
                "\033[1;35m " +
                "Fresh Juices Seasonal/Mix       \t160/-\n" +
                "  \t \n" +
                "Smoothies & Mocktails \t \n" +
                "Fruit Punch                     \t150/-\n" +
                "Red Sea                         \t150/-\n" +
                "Virgin Colada                   \t150/-\n" +
                "Love Valley                     \t150/-\n" +
                "Pomi Twist                      \t150/-\n" +
                "Ginger Fizz                     \t150/-\n" +
                "Italian Smooch                  \t150/-\n" +
                "Devils Kiss                     \t150/-\n" +
                "Blue Lagoon                     \t150/-\n" +
                "Fresh Mint Mojito               \t150/-\n" +
                "Kiwi Smoothie                   \t150/-\n" +
                "Virgin Guava                    \t150/-\n" +
                "Litchi Smoothie                 \t150/-\n" +
                "Peach Apricot                   \t150/-\n" +
                "Blue Berry Smoothie             \t150/-\n" +
                "Green Hayland                   \t150/-\n" +
                "White Rosy                      \t150/-\n" +
                "Watermelon Mojito               \t150/-\033[0m\n" +
                "  \t \n" +
                "\033[1;36m" +
                "Ice Cream \t \n" +
                "Vanilla/Strawberry              \t51/-\n" +
                "Tutti Fruti                     \t60/-\n" +
                "Pineapple                       \t60/-\n" +
                "Chocolate                       \t60/-\n" +
                "Butter Scotch                   \t60/-\n" +
                "Kaju Kishmish                   \t60/-\n" +
                "Vanilla Chocochips              \t60/-\n" +
                "Mango                           \t60/-\n" +
                "Anjeer Honey                    \t60/-\n" +
                "Chocolate Almond Fudge          \t60/-\n" +
                "Kesar Pista                     \t60/-\n" +
                "Black Currant                   \t60/-\n" +
                "  \t \n" +
                "Ice Cream Shakes \t \n" +
                "Vanilla                         \t128/-\n" +
                "Mango                           \t128/-\n" +
                "Pineapple                       \t128/-\n" +
                "Chocolate / Coffee              \t128/-\n" +
                "Kesar Pista                     \t128/-\n" +
                "Butter Scotch                   \t128/-\033[0m\n" +
                "  \t \n" +
                "\033[1;37m " +
                "Tea & Coffee \t \n" +
                "Tea                             \t40/-\n" +
                "Coffee Mocachino                \t51/-\n" +
                "Coffee Americano (Black)        \t55/-\n" +
                "Coffee Espresso                 \t60/-\n" +
                "Ice Tea (Lemon)                 \t51/-\n" +
                "Coffee Cappuccino               \t51/-\n" +
                "Espresso (Black)                \t55/-\n" +
                "Cold-Coffee (Frappe)            \t70/-\n" +
                "  \t \n" +
                "Areated Beverages \t \n" +
                "Cola / Orange / Lemon           \t55/-\n" +
                "Diet Pepsi                      \t55/-\n" +
                "Fresh Lime Soda Sweet / Salt    \t60/-\n" +
                "Mineral Water                   \t55/-\n" +
                "Fresh lime Water Sweet / Salt   \t60/-\033[0m\n" +

                "\n please enter your order:::------>>>>\n");
        System.out.println("\033[1;41m enter your response:\033[0m");
        String order = input.nextLine();
        System.out.println("please enter your table number:--");
        String table = input.nextLine();
        System.out.println("your order is: \n\033[1;34m" + order + " \nand  your table number is: " + table);
        System.out.println("\033[0m thanks you foodie!!!!!");
    }

}
