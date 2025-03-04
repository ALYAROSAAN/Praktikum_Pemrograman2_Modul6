package application;

public class Mahasiswa {
    private int id;
    private String nim;
    private String nama;

    // Constructor
    public Mahasiswa(int id, String nim, String nama) {
        this.id = id;
        this.nim = nim;
        this.nama = nama;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
