package com.hotel.booking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client persone1 = new Client("Lera", "Shu", "+709019309", "ttmmi@kfk.ru", "female");
        Client persone2 = new Client("Max", "Shush", "+72423445", "tr@.ru", "male");

        Bill billPersone1 = new Bill(1000);
        Bill billPersone2 = new Bill(2000);

        persone1.setBill(billPersone1);
        // System.out.println(persone1.getBill().getAmmount());

        persone2.bill2 = billPersone2;
        // System.out.println(persone2.bill2.getAmmount());

        Room room1 = new Room(2, 500, "yes", 25, "male");
        Room room2 = new Room(4267, 435, "yes", 80, "female");
        Room room3 = new Room(6887, 6090, "no",60, "male");
        Room room4 = new Room(22, 5020, "yes", 100, "female");

        Hotel hotel1 = new Hotel("Paris", new Room[]{room1, room2, room3});
        Hotel hotel2 = new Hotel("Vok", new Room[]{room1, room2, room3, room4});


        Client[] clientArray = new Client[]{persone1, persone2};
        Hotel[] hotelArray = new Hotel[]{hotel1, hotel2};
        Room[] roomArray = new Room[]{room1, room2, room3, room4};

        Scanner scanner = new Scanner(System.in);

        for (; ; ) {

            Client selectedClient = selectObject(clientArray, scanner);


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
                    for (Room elementHotelRoom : elementHotelName.getRoomsList()) {
                        if (selectedClient.getClienGgender() == elementHotelRoom.getGender()) {
                            System.out.println(elementHotelRoom.getRoomId() + " " +
                                    "Стоимость номера2: " + elementHotelRoom.getCost() + " " +
                                    "Свободно: " + elementHotelRoom.getFree() + " " +
                                    "Количество человек: " + elementHotelRoom.getNumberOfPeople() + " " + "Площадь номера: " + elementHotelRoom.getSquare());
                        }
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
                    System.out.println(elementRoom.getGender());


                }
            }
        }
    }
    public static Client selectObject(Client[] clientArray, Scanner scanner) {
        System.out.print("Введите цифру, соответствующую имени: ");
        for (Client elementClient : clientArray) {
            System.out.print(elementClient.getPersoneId() + " " + "-" + " ");
            System.out.print(elementClient.getName() + ";" + " ");
        }
        Integer nameId = scanner.nextInt();

        for (Client elementName : clientArray) {
            if (nameId == elementName.getPersoneId()) {
                System.out.println(elementName.getName());
                return elementName;
            }
        }
        return null;
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
