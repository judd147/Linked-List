package com.company;
/*  Liyao Zhang
    CSC221 Spring 2019
    Project 1
    Jan. 27, 2019

    This program implements a doubly linked list to sort
    some points in order of their distance from origin.*/
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
            throws IOException  {
        InputStream txt = new FileInputStream("D:\\Liyao\\CSC 221\\points.txt");                            //Create the inputstream to access the file
        Scanner snjr = new Scanner(txt);
        MyLinkedList<Point> list = new MyLinkedList<>();
        double x,y;
        while (snjr.hasNext()) {                                                                                      //Read each line of file
            String[] str;
            str = snjr.nextLine().split("[:]|\\s*[,]\\s*");                                                   //Extract x and y from the string
            x = Double.parseDouble(str[1]);
            y = Double.parseDouble(str[2]);
            Point coord = new Point(x, y);                                                                            //Create a new point object for each point
                if (list.isEmpty())                                                                                   //Add the point directly if an empty list
                    list.add(coord);
                else {
                    int counter = 0;                                                                                  //Index counter for the list
                    java.util.Iterator<Point> itr = list.iterator();
                    while(itr.hasNext() && itr.next().distance() < coord.distance()){                                 //Stop the counter until the distance is smaller than a point's
                        counter++;
                    }
                    list.add(counter,coord);                                                                           //Place the point at that place
                }
        }
        Scanner scnr = new Scanner(System.in);                                                                        //Create a new scanner
        System.out.println("Enter an integer.");
        int k = scnr.nextInt();
        for (int i = 0; i < k; i++) {
            System.out.println(list.get(i));                                                                          //Print specified amount of points
        }
    }
}