package aceptaelreto;

import java.util.Scanner;

public class OrganizandoLosHangares {

    static boolean Caso(int[] v, int[] z) {

        for (int i = 0; i < z.length; i++) {
            if (! Entra(v, z[i])) {
                return false;
            }
        }
        return true;
    }

    static boolean Entra(int[] v, int tamaño) {
        int pos = MAX(v);
        if (v[pos] < tamaño) {
            return false;
        } else {
            v[pos] = v[pos] - tamaño;
            return true;
        }
    }

    static int MAX(int[] v) {
        int max = Integer.MIN_VALUE;
        int p = 0;
        for (int i = 0; i < v.length; i++) {
            if (max < v[i]) {
                max = v[i];
                p = i;
            }
        }
        return p;
    }

   public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner tec = new Scanner(System.in);
        int n;
        while ( (n = tec.nextInt()) != 0) {

            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = tec.nextInt();
            }
            n = tec.nextInt();
            int[] z = new int[n];
            for (int i = 0; i < n; i++) {
                z[i] = tec.nextInt();
            }
            if (Caso(v, z)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

}

