package Pertemuan14;

public class BinaryTreeArrayMain03 {
    public static void main(String[] args) {
        BinaryTreeArray03 bta = new BinaryTreeArray03();

        Mahasiswa03 mhs1 = new Mahasiswa03("244160121", "Ali", "A", 3.57);
        Mahasiswa03 mhs2 = new Mahasiswa03("244160185", "Candra", "C", 3.41);
        Mahasiswa03 mhs3 = new Mahasiswa03("244160221", "Badar", "B", 3.75);
        Mahasiswa03 mhs4 = new Mahasiswa03("244160220", "Dewi", "B", 3.35);

        Mahasiswa03 mhs5 = new Mahasiswa03("244160131", "Devi", "A", 3.48);
        Mahasiswa03 mhs6 = new Mahasiswa03("244160205", "Ehsan", "D", 3.61);
        Mahasiswa03 mhs7 = new Mahasiswa03("244160170", "Fizi", "B", 3.86);

        Mahasiswa03[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswa, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        // Tugas no 4 Menambahkan mahasiswa baru menggunakan method add()
        Mahasiswa03 mhs8 = new Mahasiswa03("244160300", "Desy", "D", 3.91);
        bta.add(mhs8);

        // Tugas no 4 Menambahkan mahasiswa baru menggunakan method traversePreOrder()
        System.out.println("\nSetelah tambah 1 mahasiswa (Desy), Preorder traversal:");
        bta.traversePreOrder(0);
    }
}


