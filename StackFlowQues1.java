package com.test;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StackFlowQues1 {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("1", "f1", false);
        Fruit fruit2 = new Fruit("2", "f2", false);
        Fruit fruit3 = new Fruit("3", "f3", false);
        Fruit fruit4 = new Fruit("4", "f4", false);
        Fruit fruit5 = new Fruit("5", "f5", false);

        List<Fruit> firstList = Arrays.asList(fruit1, fruit2, fruit3, fruit4, fruit5);

        Fruit fruit6 = new Fruit("2", "f2", true);
        Fruit fruit7 = new Fruit("7", "f7", false);
        Fruit fruit8 = new Fruit("5", "f5", true);
        Fruit fruit9 = new Fruit("9", "f9", false);
        Fruit fruit10 = new Fruit("10", "f10", false);

        List<Fruit> secondList = Arrays.asList(fruit6, fruit7, fruit8, fruit9, fruit10);

        List<Fruit> finalList = new ArrayList<>();
        LinkedList l = new LinkedList();
        l.addAll(secondList);
        FruitComparator comparator = new FruitComparator();
        for (Fruit firstFruit : firstList) {
            l.removeFirstOccurrence(firstFruit);
        }


        finalList.addAll(firstList);
        for (Fruit secondfruit : secondList) {
            boolean isRemoved = finalList.removeIf(firstfruit -> firstfruit.compareTo(secondfruit) == 0);
            if(isRemoved) {
                finalList.add(0,secondfruit);
            }
        }
        for (Fruit fruit : finalList) {
            System.out.println(fruit.getName());
        }



    }
}

class Fruit implements Comparable<Fruit> {
    private String id;
    private String name;
    private boolean isChecked;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    Fruit(String id, String name, boolean isChecked) {
        this.id = id;
        this.name = name;

        this.isChecked = isChecked;
    }

    @Override
    public int compareTo(Fruit o) {
        if (o.isChecked && this.id.equalsIgnoreCase(o.id)) {
            return 0;
        }
        else {
            return 1;
        }
    }
}


class FruitComparator implements Comparator<Fruit> {


    @Override
    public int compare(Fruit o1, Fruit o2) {
        return 0;
    }
}
