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
        Room room4 = new Room(22, 5020, "yes");

        Hotel hotel1 = new Hotel("Paris", new Room[]{room1, room2, room3});
        Hotel hotel2 = new Hotel("Vok", new Room[]{room1, room2, room3, room4});


        Client[] clientArray = new Client[]{persone1, persone2};
        Hotel[] hotelArray = new Hotel[]{hotel1, hotel2};
        Room[] roomArray = new Room[]{room1, room2, room3, room4};


        for (; ; ) {

            System.out.print("Введите цифру, соответствующую имени: ");
            for (Client elementClient : clientArray) {
                System.out.print(elementClient.getPersoneId() + " " + "-" + " ");
                System.out.print(elementClient.getName() + ";" + " ");
            }
            Scanner scanner = new Scanner(System.in);
            Integer nameId = scanner.nextInt();

            for (Client elementName : clientArray) {
                if (nameId == elementName.getPersoneId()) {
                    System.out.println(elementName.getName());
                }

                //System.out.println(selectedPersone.getName()); // Lera
                //System.out.println(nameId);                      // Max
                //System.out.println(element.getName());         // Lera
            }


            System.out.println("Введите цифру, соответствующую отелю: ");
            for (Hotel elementHotel : hotelArray) {
                System.out.print(elementHotel.getHotelId() + " " + "-" + " ");
                System.out.print(elementHotel.getHotelName() + ";" + " ");
            }
            Scanner scanner2 = new Scanner(System.in);
            Integer hotelId = scanner.nextInt();

            for (Hotel elementHotelName : hotelArray) {

                    if (hotelId == elementHotelName.getHotelId()) {
                        System.out.println(elementHotelName.getHotelName());
                        System.out.println("Выберете цифру, соответствующую номеру:");
                        for (Room elementHotel : elementHotelName.getRoomsList()) {

                            System.out.println(elementHotel.getRoomId() + " " +
                                    "Стоимость номера: " + elementHotel.getCost() + " " +
                                    "Свободно: " + elementHotel.getFree() + " " +
                                    "Количество человек: " + elementHotel.getNumberOfPeople());


                        }
                    }
            }



            Scanner scanner3 = new Scanner(System.in);
            Integer roomId = scanner.nextInt();

            for (Room elementRoom : roomArray) {

                if (roomId == elementRoom.getRoomId()) {
                    System.out.println(elementRoom.getCost());
                    System.out.println(elementRoom.getFree());
                    System.out.println(elementRoom.getNumberOfPeople());


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
