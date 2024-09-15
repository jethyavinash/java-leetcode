package com.practice.coding;

public class HttpEntityUtils {

    public static String maskPasswordInHttpEntityString(String httpEntityString) {
        // Use regex to mask the password
        return httpEntityString.replaceAll("pwd=[^,]*", "pwd=****");
    }

    public static void main(String[] args) {
        // Example HttpEntity.toString() output
        String httpEntityString = "<{details={abc=123,pwd=$%#^,xyz=dddd}}>";

        // Mask the password in the HttpEntity string
        String maskedString = maskPasswordInHttpEntityString(httpEntityString);
        System.out.println(maskedString);
    }
}
