package ru.geekbrains.JavaCoreForAndroid;

import java.util.ArrayList;
import java.util.Arrays; // в данном примере использую чтобы быстро использовать встроенный метод toString

/**
 * Сourse: java core for android
 * Faculty of Geek University Android Development
 *
 * @Author Student Dmitry Veremeenko aka StDimensiy
 * Group 24.12.2020
 * <p>
 * HomeWork for lesson 11
 * Created 14.02.2021
 * v1.0
 */
public class Lesson11 {
    public static void main(String[] args) {
        //Задание №1
        Integer[] testArr1 = {1, 2, 3, 4};
        System.out.print("Первоначальное состояние массива arr:");
        System.out.println(Arrays.toString(testArr1));
        SwapTwoArrayElements(testArr1, 1, 2);
        System.out.print("Результат работы метода перестановки:");
