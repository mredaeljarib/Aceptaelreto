import java.util.Scanner;

public class Escapando2 {

	static int PosibleCaminos(String[][] mapa, int f, int c, int filas,
			int columnas, int n) {
		// System.out.print(f + " " + c);
		// System.out.println(mapa[f][c]);
		String comparacion = mapa[f][c];
		int salida = 0;
		if ((comparacion.equals("*")) || (n == 0)) {

		} else {

			if (comparacion.equals("F")) {
				// System.out.print("encontrado");
				return 1;
			} else {

				if (f + 1 < filas) {
					mapa[f][c] = "*";
					salida = salida
							+ PosibleCaminos(mapa, f + 1, c, filas, columnas,
									n - 1);
				}

				if (c + 1 < columnas) {
					mapa[f][c] = "*";
					salida = salida
							+ PosibleCaminos(mapa, f, c + 1, filas, columnas,
									n - 1);
				}

				if (f - 1 > -1) {
					mapa[f][c] = "*";
					salida = salida
							+ PosibleCaminos(mapa, f - 1, c, filas, columnas,
									n - 1);
				}

				if (c - 1 > -1) {
					mapa[f][c] = "*";
					salida = salida
							+ PosibleCaminos(mapa, f, c - 1, filas, columnas,
									n - 1);
				}
			}
		}
		return salida;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		while (tec.hasNext()) {
			int f = 0;
			int SF = 0;
			int SC = 0;
			int c = 0;
			f = tec.nextInt();
			c = tec.nextInt();
			String[][] mapa = new String[f][c];

			for (int ii = 0; ii < f; ii++) {

				String fila = tec.next();

				for (int i = 0; i < c; i++) {

					mapa[ii][i] = Character.toString(fila.charAt(i));
					if (Character.toString(fila.charAt(i)).equals("S")) {
						SF = ii;
						SC = i;

					}

				}

			}
			int n = f * c;

			if (PosibleCaminos(mapa, SF, SC, f, c, n) > 0) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
	}
}
