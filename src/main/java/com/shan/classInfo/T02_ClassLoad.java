package com.shan.classInfo;

public class T02_ClassLoad {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(String.class.getClassLoader());
        System.out.println(T02_ClassLoad.class.getClassLoader());
        System.out.println(T02_ClassLoad.class.getClassLoader().getParent());
        Class glass = T02_ClassLoad.class.getClassLoader().loadClass("com.shan.classInfo.T01_ClassLayout");
        System.out.println(glass.getName());
    }

}
