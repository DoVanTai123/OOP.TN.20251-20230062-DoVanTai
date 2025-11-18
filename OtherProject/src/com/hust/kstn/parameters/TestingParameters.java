package com.hust.kstn.parameters;

public class TestingParameters {

    public static void misleadingSwap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void swapContent(Student o1, Student o2) {
        String tmpName = o1.getName();
        int tmpId = o1.getStudentId();

        o1.setName(o2.getName());
        o1.setStudentId(o2.getStudentId());

        o2.setName(tmpName);
        o2.setStudentId(tmpId);
    }

    public static void main(String[] args) {
        Student s1 = new Student(10, "Anna");
        Student s2 = new Student(20, "Brian");

        System.out.println("---( Misleading Swap (Original Lab Test) ---");
        System.out.println("Before swap: s1=" + s1.getName() + ", s2=" + s2.getName());

        misleadingSwap(s1, s2);

        System.out.println("After Misleading Swap (FAILED): s1=" + s1.getName() + ", s2=" + s2.getName());

        s1 = new Student(10, "Anna");
        s2 = new Student(20, "Brian");

        System.out.println("\n--- Content Swap (The Solution) ---");
        System.out.println("Before Content Swap: s1=" + s1.getName() + ", s2=" + s2.getName());

        swapContent(s1, s2);

        System.out.println("After Content Swap (SUCCESS): s1=" + s1.getName() + ", s2=" + s2.getName());
    }
}