package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListTesting {
    public static void main(String[] args) {

        // Constant number for the number of cars to be generated
        final int NUM_CARS = 10000;

        // Create an arraylist of cars
        ArrayList<Car> carsArray = new ArrayList<Car>();

        // Time how long it takes to add cars to the arraylist in milliseconds
        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_CARS; i++) {
            carsArray.add(new Car());
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / (1000000);
        System.out.println("Time to add " + NUM_CARS + " cars to the arraylist: " + duration + " milliseconds");

        // Time how long it takes to sort the arraylist by make in milliseconds
        startTime = System.nanoTime();
        Collections.sort(carsArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / (1000000);
        System.out.println("Time to sort the arraylist by make: " + duration + " milliseconds");

        // Time how long it takes to shuffle the arraylist in milliseconds
        startTime = System.nanoTime();
        Collections.shuffle(carsArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / (1000000);
        System.out.println("Time to shuffle the arraylist: " + duration + " milliseconds");

        // Time how long it takes to get a random car from the arraylist 1,000,000 times
        // in milliseconds
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            carsArray.get((int) (Math.random() * NUM_CARS));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / (1000000);
        System.out
                .println("Time to get a random car from the arraylist 1,000,000 times: " + duration + " milliseconds");

        // Time how long it takes to get each element sequentially from the arraylist in
        // milliseconds
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_CARS; i++) {
            carsArray.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / (1000000);
        System.out.println("Time to get each element sequentially from the arraylist: " + duration + " milliseconds");

        // Create a linkedlist of cars
        LinkedList<Car> carsLinked = new LinkedList<Car>();

        // Time how long it takes to add cars to the linkedlist in milliseconds
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_CARS; i++) {
            carsLinked.add(new Car());
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / (1000000);
        System.out.println("Time to add " + NUM_CARS + " cars to the linkedlist: " + duration + " milliseconds");

        // Time how long it takes to sort the linkedlist by make in milliseconds
        startTime = System.nanoTime();
        Collections.sort(carsLinked);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / (1000000);
        System.out.println("Time to sort the linkedlist by make: " + duration + " milliseconds");

        // Time how long it takes to shuffle the linkedlist in milliseconds
        startTime = System.nanoTime();
        Collections.shuffle(carsLinked);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / (1000000);
        System.out.println("Time to shuffle the linkedlist: " + duration + " milliseconds");

        // Time how long it takes to get a random car from the linkedlist 1,000,000
        // times in milliseconds
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            carsLinked.get((int) (Math.random() * NUM_CARS));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / (1000000);
        System.out
                .println("Time to get a random car from the linkedlist 1,000,000 times: " + duration + " milliseconds");

        // Time how long it takes to get each element sequentially from the linkedlist
        // in milliseconds
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_CARS; i++) {
            carsLinked.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / (1000000);
        System.out.println("Time to get each element sequentially from the linkedlist: " + duration + " milliseconds");

    }
}
