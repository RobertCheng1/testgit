package com.company.mywebsite;


public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        System.out.println("aaa");
        Person person = new Person();
        person.setName("JordanMikeE");
        person.setAge(22229);

        Person cpx = new Person();
        cpx.setName("cpx");
        cpx.setAge(23);
        System.out.printf("cpx.getName = %s\n", cpx.getName());
        System.out.printf("cpx.getAge = %d\n", cpx.getAge());
        System.out.println("this is the good info");
    }


}