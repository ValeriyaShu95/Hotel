package com.hotel.booking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client persone1 = new Client("Lera", "Shu", "+709019309", "ttmmi@kfk.ru");
        Client persone2 = new Client("Max", "Shush", "+72423445", "tr@.ru");

        Bill billPersone1 = new Bill(1000);
        Bill billPersone2 = new Bill(2000);

        persone1.setBill(billPersone1);
        // System.out.println(persone1.getBill().getAmmount());

        persone2.bill2 = billPersone2;
        // System.out.println(persone2.bill2.getAmmount());

        Room room1 = new Room(2, 500, "yes");
        Room room2 = new Room(4267, 435, "yes");
        Room room3 = new Room(6887, 6090, "no");

        Hotel hotel1 = new Hotel("Paris", new Room[]{room1, room2, room3});
        Hotel hotel2 = new Hotel("Vok", new Room[]{room1, room2, room3});


        Client[] clientArray = new Client[]{persone1, persone2};
        Hotel[] hotelArray = new Hotel[]{hotel1, hotel2};
        Room[] roomArray = new Room[]{room1, room2, room3};


        for (; ; ) {

            System.out.print("Введите цифру, соответствующую имени: ");
            for (Client element : clientArray) {
                System.out.print(element.getPersoneId() + " " + "-" + " ");
                System.out.print(element.getName() + ";" + " ");
            }
            Scanner scanner = new Scanner(System.in);
            Integer nameId = scanner.nextInt();

            for (Client element : clientArray) {
                if (nameId == element.getPersoneId()) {
                    System.out.println(element.getName());
                }

                //System.out.println(selectedPersone.getName()); // Lera
                //System.out.println(nameId);                      // Max
                //System.out.println(element.getName());         // Lera
            }


            System.out.println("Введите цифру, соответствующую отелю: ");
            for (Hotel element : hotelArray) {
                System.out.print(element.getHotelId() + " " + "-" + " ");
                System.out.print(element.getHotelName() + ";" + " ");
            }
            Scanner scanner2 = new Scanner(System.in);
            Integer hotelId = scanner.nextInt();

            for (Hotel element : hotelArray) {
                if (hotelId == element.getHotelId()) {
                    System.out.println(element.getHotelName());
                }
            }


            System.out.println("Выберете цифру, соответствующую номеру:");
            for (Room element : roomArray) {
                System.out.println(element.getRoomId() + " " +
                        "Стоимость номера: " + element.getCost() + " " +
                        "Свободно: " + element.getFree() + " " +
                        "Количество человек: " + element.getNumberOfPeople());


            }

            Scanner scanner3 = new Scanner(System.in);
            Integer roomId = scanner.nextInt();

            for (Room element : roomArray) {

                if (roomId == element.getRoomId()) {
                    System.out.println(element.getCost());
                    System.out.println(element.getFree());
                    System.out.println(element.getNumberOfPeople());


                }
            }
        }
    }
}

          /* System.out.println("Сумма до: ");
            System.out.println(selectedPersone.getBill().getAmmount());
            System.out.println("Сумма списания: ");
            System.out.println(selectedRoom.getCost());
            int newPersoneCost = selectedPersone.getBill().getAmmount() - room1.getCost();
            persone1.getBill().setAmmount(newPersoneCost);
            System.out.println("Ваш остаток на счете: ");
            System.out.println(selectedPersone.getBill().getAmmount());
        }
    } */
