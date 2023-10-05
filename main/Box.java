package ru.geekbrains.JavaCoreForAndroid;

import java.util.ArrayList;

/**
 * Сourse: java core for android
 * Faculty of Geek University Android Development
 *
 * @Author Student Dmitry Veremeenko aka StDimensiy
 * Group 24.12.2020
 * <p>
 * HomeWork for lesson1
 * Created 04.02.2021
 * v2.0
 */
public class Box {
    // У каждой новой создаваемой коробки есть предназначение (только для конкретного типа фруктов)
    // для хранения фруктов внутри коробки можно использовать ArrayList
    private ArrayList<Fruit> product = new ArrayList<>(); // пока оставил класс родителя в АррейЛисте потом посмотрб смогу лия чтонить с ним сделать

    // считать коробки нам пока ненужно поэтому статических переменных не будет


    public Box() {
