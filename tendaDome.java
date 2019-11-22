
package campkitsederhana;

    public class tendaDome extends tenda{
        int stokTendaEiger=12;
        int []jumlahFrame={4,6,8,12};
        int []jumlahLayer={2,3};
        int []jumlahPintu={1,2};
        String []jenisFrame={"Alumunium Alloy","Fiber Glass"};
        
        // Method

        
        public void taamabah(){
            System.out.println("njajal");
        }

    public int[] getJumlahFrame() {
        return jumlahFrame;
    }

    public void setJumlahFrame(int[] jumlahFrame) {
        this.jumlahFrame = jumlahFrame;
    }

    public int[] getJumlahLayer() {
        return jumlahLayer;
    }

    public void setJumlahLayer(int[] jumlahLayer) {
        this.jumlahLayer = jumlahLayer;
    }

    public int[] getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int[] jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String[] getJenisFrame() {
        return jenisFrame;
    }

    public void setJenisFrame(String[] jenisFrame) {
        this.jenisFrame = jenisFrame;
    }




        
    }
