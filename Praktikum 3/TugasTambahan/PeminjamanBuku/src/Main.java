public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas anggota dan buku
        Anggota anggota= new Anggota("Miriam Stefani");
        Buku buku1 = new Buku("Antologi Rasa");
        Buku buku2 = new Buku("Heartbreak Motel");
        Buku buku3 = new Buku("Critical Eleven");
        Buku buku4 = new Buku("The Architecture Of Love");
        // TODO 4: Buat implementasi try-catch untuk handling exception pada saat melakukan peminjaman buku
        try{
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);
        }catch(MaksimumBukuTerpinjamException e){
            System.out.println("Buku yang dipinjam sudah melebihi batas."+e.getMessage());
        }catch(BukuTidakTersediaException e){
            System.out.println("Buku tidak tersedia"+e.getMessage());
        }
        // Buat dua block catch: ketika anggota sudah meminjam buku lebih dari 3 dan ketika buku tidak tersedia/sudah dipinjam
    }
}