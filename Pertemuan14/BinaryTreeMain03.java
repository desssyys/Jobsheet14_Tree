package Pertemuan14;

public class BinaryTreeMain03 {
    public static void main(String[] args) {
        BinaryTree03 bst = new BinaryTree03();

        bst.add(new Mahasiswa03("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa03("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa03("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa03("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa03("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa03("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa03("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        // Tambahan: Menampilkan IPK terkecil dan terbesar
        System.out.println("\nMahasiswa dengan IPK terkecil:");
        bst.cariMinIPK();

        System.out.println("\nMahasiswa dengan IPK terbesar:");
        bst.cariMaxIPK();

        // Tambahan: Menampilkan mahasiswa dengan IPK di atas 3.50
        System.out.println("\nMahasiswa dengan IPK di atas 3.50:");
        bst.tampilMahasiswaIPKdiAtas(3.50);

        System.out.println("\nPenghapusan data mahasiswa (IPK = 3.57)");
        bst.delete(3.57);

        System.out.println("\nDaftar semua mahasiswa setelah penghapusan (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}
