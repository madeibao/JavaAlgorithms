package com.basicJava8.www;


public interface MyInterface {
    String myNewName(String newName);

    default String myOldName() {
        return "chao";
    }
}