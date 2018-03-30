package ru.innopolis;

public class Main {
    public static void main(String[] args) {

       double[] array = new double[]{3.8, 5, 8, 10, 87};
       double[] array2 = new double[]{99, 5, 56, 10, 87};

       MathBox mBox = new MathBox(array);
        MathBox mBox2 = new MathBox(array);

        System.out.println(mBox2.equals(mBox));

        System.out.println(mBox.hashCode());
        System.out.println(mBox2.hashCode());

        System.out.println("Коллекция+: ");
        System.out.println(mBox.getMathBoxArray());
        System.out.println("Сумма элементов коллекции: " + mBox.summator());

        System.out.println("Коллекция после Метода splitter: ");
        mBox.splitter(5);

        System.out.println(mBox.getMathBoxArray());

    }
}