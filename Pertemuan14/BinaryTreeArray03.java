package Pertemuan14;

public class BinaryTreeArray03 {
    Mahasiswa03[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray03() {
        this.dataMahasiswa = new Mahasiswa03[10];
    }

    void populateData (Mahasiswa03 datMhs[], int idxLast) {
        this.dataMahasiswa = datMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder (int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    //Tambahan tugas no 4 menambahkan method add
    void add(Mahasiswa03 data) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Tree Penuh, tidak bisa menambahkan data.");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    //Tambahan tugas no 4 menambahkan method traversePreOrder()
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null){
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}



