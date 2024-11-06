public class penyalur {
    private String nama;
    private double jmlzkt;

    // Constructor
    public penyalur(String nama) {
        this.nama = nama;
        this.jmlzkt = 0.0;
    } //parameternya

    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    
    public double getjmlzkt() {
        return jmlzkt;
    }

    public void setjmlzkt(double jmlzkt) {
        this.jmlzkt = jmlzkt;
    }
}
