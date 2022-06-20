package com.CH4;

public class StringSplit {
    public static void main(String[] args) {
        String withSpace = "This is the line with Spaces";
        String withDash = "This-is-the-line-with-dash";

        String[] withSpaces = withSpace.split(" ");
        for(String str : withSpaces) {
            System.out.println(str);
        }

        System.out.println("=================================");
        String[] withDashes = withDash.split("-");
        for(String str : withDashes) {
            System.out.println(str);
        }
    }
}
