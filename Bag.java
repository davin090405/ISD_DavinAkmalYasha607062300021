public class Bag {
        String kode;
        String jenis;
        String namaBarang;
        int StokBarang;
    
    public Bag (String kode, String jenis, String namaBarang, int StokBarang) {
    this.kode = kode; 
    this.jenis = jenis;
    this.namaBarang = namaBarang;
    this.StokBarang = StokBarang;
    }
    public String getkode() {
    return kode;
    }
    public String getjenis() {
        return jenis;
    }
    public String getnamaBarang() {
        return namaBarang;
    }
    public int getStokBarang() {
        return StokBarang;
    }
    @Override
    public String toString() {
        return "Bag [kode : " + kode + ", Jenis : " + jenis + ", Nama Barang : " + namaBarang + ", Stok Barang :" + StokBarang
                + "]";
    }
    
    }

