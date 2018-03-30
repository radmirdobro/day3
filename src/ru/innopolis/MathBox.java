package ru.innopolis;

import java.util.HashMap;
import java.util.ArrayList;

public class MathBox {
    private ArrayList<Double> MathBoxArray = new ArrayList();

    public ArrayList<Double> getMathBoxArray() {
        return MathBoxArray;
    }

    public MathBox(double[] arNumbers) {
        try {
            double tempEl;

            for (int i = 0; i < arNumbers.length; i++) {

                tempEl = arNumbers[i];
                MathBoxArray.add(arNumbers[i]);
                for (int j = (i + 1); j < arNumbers.length; j++) {
                    if (tempEl == arNumbers[j]) {
                        throw new RepeatingElementsInArrayException();
                    }
                    // System.out.println(arNumbers[j]);
                }
                //System.out.println("***");
            }

        } catch (RepeatingElementsInArrayException e) {
            System.out.println("Array has mistake!");
            MathBoxArray.clear();
        }
    }


    public double summator() {
        double s = 0;
        for (int i = 0; i < MathBoxArray.size(); i++) {
            s += MathBoxArray.get(i);
        }
        return s;
    }


    public void splitter(int divider) {
        try {
            if (divider == 0) throw new ArithmeticException();
            for (int i = 0; i < MathBoxArray.size(); i++) {
                MathBoxArray.set(i, MathBoxArray.get(i) / divider);
            }
        } catch (ArithmeticException e) {
            System.out.println("Wrong divider!");
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((MathBoxArray == null) ? 0 : MathBoxArray.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MathBox other = (MathBox) obj;
        if (MathBoxArray.equals(other.MathBoxArray))
            return true;
        return true;
    }
}



