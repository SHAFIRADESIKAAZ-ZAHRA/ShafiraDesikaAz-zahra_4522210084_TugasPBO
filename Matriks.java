package Operasi;

public class Matriks {
    public Pecahan[][] angka;
    private int baris;
    private int kolom;

    public Matriks(int baris, int kolom) {
        this.baris = baris;
        this.kolom = kolom;
        angka = new Pecahan[baris][kolom];
    }

    public void penambahan(Matriks other) {
        if (this.baris != other.baris || this.kolom != other.kolom) {
            System.out.println("Matriks tidak dapat dijumlahkan. Ukuran berbeda.");
            return;
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                angka[i][j] = angka[i][j].tambah(other.angka[i][j]);
            }
        }
    }

    public void pengurangan(Matriks other) {
        if (this.baris != other.baris || this.kolom != other.kolom) {
            System.out.println("Matriks tidak dapat dikurangkan. Ukuran berbeda.");
            return;
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                angka[i][j] = angka[i][j].kurang(other.angka[i][j]);
            }
        }
    }

    public Matriks dot(Matriks other) {
        if (this.kolom != other.baris) {
            System.out.println("Matriks tidak dapat di-dot. Ukuran tidak sesuai.");
            return null;
        }

        Matriks result = new Matriks(this.baris, other.kolom);

        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < other.kolom; j++) {
                Pecahan sum = new Pecahan(0, 1);
                for (int k = 0; k < this.kolom; k++) {
                    sum = sum.tambah(this.angka[i][k].kali(other.angka[k][j]));
                }
                result.angka[i][j] = sum;
            }
        }

        return result;
    }

    public Matriks transpose() {
        Matriks result = new Matriks(this.kolom, this.baris);

        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                result.angka[j][i] = this.angka[i][j];
            }
        }

        return result;
    }

    public Matriks inverse() {
        if (this.baris != this.kolom) {
            System.out.println("Matriks tidak dapat diinvers. Bukan matriks persegi.");
            return null;
        }

        int n = this.baris;
        Matriks augmentedMatriks = new Matriks(n, 2 * n);

        // Membuat matriks augmented yang berisi matriks asli dan matriks identitas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmentedMatriks.angka[i][j] = this.angka[i][j];
                augmentedMatriks.angka[i][j + n] = (i == j) ? new Pecahan(1, 1) : new Pecahan(0, 1);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                result.append(angka[i][j]).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}