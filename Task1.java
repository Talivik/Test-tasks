package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите ipv4 адрес:");
        String IPv4Adress=scanner.nextLine(); // 128.32.10.0
        //10000000  10000000 1010


        int ipInt = convertIPv4AdressToInt(IPv4Adress);
        System.out.println("Адрес ipv4 в int: " + ipInt);

        String ipString = intToIPv4(ipInt);
        System.out.println("Int в ipv4: " + ipString);
    }

    public static int convertIPv4AdressToInt(String address) {
        String[] octets = address.split("\\.");
        int intFromIPv4Adress = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println(Integer.toBinaryString(Integer.parseInt(octets[i])));
            intFromIPv4Adress |= Integer.parseInt(octets[i]) << (24 - (i * 8) );
        }
        return intFromIPv4Adress;
    }

    public static String intToIPv4(int ipInt) {
        StringBuilder ipAddress = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int octet = (ipInt >> (24 - i * 8)) & 0xFF;
            ipAddress.append(octet);
            if (i < 3) {
                ipAddress.append(".");
            }
        }
        return ipAddress.toString();
    }

}