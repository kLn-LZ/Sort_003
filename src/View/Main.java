package View;

import kLn.Order.ControllerOrdenacao;

public class Main {
    public static void main(String[] args) {

        ControllerOrdenacao co = new ControllerOrdenacao();

        int[] v = {31, 32, 33, 34, 99, 98, 97, 96};

        v = co.quickSort(v, 0, v.length - 1);

        for (int i: v) {

            System.out.print(i + " ");
        }


    }

}
