package com.example;

public class Main {
    public static void validateEmails(String[] emails) {
        for (String employeeEmail : emails ) {
            if (employeeEmail != null &&employeeEmail.contains("@")) {
                System.out.println(employeeEmail);
            } else {
                System.out.println("Invalid or missing email");
            }
        }
    }

    public static void main(String[] args) {
        String[] employeeEmails = {"alice@company.com", null, "bob@company.com", null, "charlie@company.com"};

        validateEmails(employeeEmails);
    }
}