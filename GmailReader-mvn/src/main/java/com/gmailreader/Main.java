package com.gmailreader;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     GmailSer objGmailSer = new GmailSer();

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Querry (like subject:interview)");

        String query = scn.nextLine();
        HashMap data = objGmailSer.getGmailData(query);
        System.out.println(data.get("subject"));
        System.out.println("------- Body ---------");
        System.out.println(data.get("body"));
        System.out.println("------ Links --------------");
        System.out.println(data.get("link"));

        System.out.println(">>>>> Total Number of Emails recived by the Mail: <<<<");
        System.out.println("Total count of emails is :"+objGmailSer.getTotalCountOfMails());

        System.out.println("---- any link present -----");
        boolean exist = objGmailSer.isMailExist("new link");
        System.out.println("title exist or not: " + exist);

    }
}