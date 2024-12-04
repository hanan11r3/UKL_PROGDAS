public class soalmudah3 {

    public static void main(String[] args) {

        String [] kalimat = {"saya anak moklet","saya anak wikusama","saya angkatan 33"};
        int indexKalimat =0;

        for(int i=50 ; i >=2; i--){
            System.out.println(i + ". " + kalimat[indexKalimat]);
            indexKalimat = (indexKalimat + 1) % kalimat.length;
        }System.out.println("1.saya senang");
    }
}