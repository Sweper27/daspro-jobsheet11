public class Kubus26 {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * (sisi * sisi); 
    }

    public static void main(String[] args) {
        
        int sisiKubus = 5;

        int volume = hitungVolume(sisiKubus);
        System.out.println("Volume Kubus dengan sisi " + sisiKubus + " adalah: " + volume);

        int luasPermukaan = hitungLuasPermukaan(sisiKubus);
        System.out.println("Luas Permukaan Kubus dengan sisi " + sisiKubus + " adalah: " + luasPermukaan);
    }
}
