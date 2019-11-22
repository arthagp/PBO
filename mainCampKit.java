
package campkitsederhana;
import java.util.Scanner;
public class mainCampKit {
    Scanner camp=new Scanner(System.in);
    tenda tenda1= new tenda();
    matras matras1= new matras();
    sleepingBag sleBag=new sleepingBag();
    carrier carrier1=new carrier();
    Person person1=new Person();
    tendaDome dome=new tendaDome();
    tendaMontanaBestway montanaBestway=new tendaMontanaBestway();
    tendaPramuka pramuka=new tendaPramuka();
    
    //Variabel
    int pil;
    boolean b=true;
    String pilihan;
    String[] entriNama = new String[4];
    
    
    public static void main(String[] args){
    mainCampKit mainCampKit1=new mainCampKit();
    mainCampKit1.menuAwal();
    

    
    }
    
    public void menuAwal(){
        System.out.println("===== Menu Awal =====");
        System.out.println("[1]Entri Data Barang");
        System.out.println("[2]Menu User/Admin");
        System.out.println("Masukan Pilihan : ");
        pil=camp.nextInt();
        switch(pil){
            case 1:
                entri();
                break;
            case 2:
                menu();
        }
    }
    
    public void entri(){
        //System.out.println("njajal :"+entriNama[0]); 
        String peringatan;
        System.out.println("===== ENTRI DATA BARANG =====");
        System.out.println("Masukan Nama Barang Ke 0 :");
        entriNama[0]=camp.nextLine();
        
        
        
        System.out.println("Apakah anda ingin kembali ke Menu Awal :[y/n]");
        peringatan=camp.nextLine();
        if (peringatan.equalsIgnoreCase("y")) {
        menuAwal();
        } else if (peringatan.equalsIgnoreCase("n")) {
        System.out.println("=======================================================");
        System.out.println("\tTerimakasih telah menggunakan layanan kami.");
        }
                
    }
    
    
    public void menu(){
        System.out.println("===== Menu =====");
        System.out.println("[1]SEWA");
        System.out.println("[2]PENGEMBALIAN");
        System.out.println("[3]TAMBAH");
        System.out.println("[4]HAPUS");
        System.out.println("Masukan Pilihan :");
        pil=camp.nextInt();
        switch(pil){
            case 1:
                Sewa();
                break;
                
        }
        
    }
    
    // Penyewaan
    
    public void Sewa(){
        Scanner scan=new Scanner(System.in);
        int penarikan;
        System.out.println("===== SEWA =====");
        System.out.println("[1]Tenda");
        System.out.println("[2]Matras");
        System.out.println("[3]Sleeping Bag");
        System.out.println("[4]Carrier");
        pil=camp.nextInt();
        switch(pil){
            case 1:
                System.out.println("===== Tenda =====");
                System.out.println("[1]Tenda Dome");
                System.out.println("[2]Tenda Montana Bestway");
                System.out.println("[3]Tenda Pramuka");
                System.out.println("Pilih Jenis Tenda :");
                pil=camp.nextInt();
                switch(pil){
                    case 1:
                        //Tenda Dome
                    System.out.println("===== Tenda Dome =====");
                    System.out.println("Merk yang tersediaa :");    
                    for(String b :dome.merk){
                        System.out.println(b);   
                    }
                        System.out.println("Pilih Merk :");
                    pil=camp.nextInt();
                    switch(pil){
                        case 1:
                            System.out.println("Berikut Stok Eiger yang tersedia :"+dome.stokTendaEiger);
                        case 2:
                            System.out.println("Berikut Stok Eiger yang tersedia :"+dome.stokTendaEiger);
                        case 3:
                            System.out.println("Berikut Stok Eiger yang tersedia :"+dome.stokTendaEiger);
                        case 4:
                            System.out.println("Berikut Stok Eiger yang tersedia :"+dome.stokTendaEiger);
                               
                    }
                    case 2:
                        //Tenda Montana
                        System.out.println("===== Tenda Montana Bestway =====");
                        System.out.println("Merk yang tersedia :");
                        for(String b :dome.merk){
                        System.out.println(b);   
                    }
                        System.out.println("Pilih Merk :");
                    pil=camp.nextInt();
                    switch(pil){
                        case 1:
                            System.out.println("Berikut Stok Eiger yang tersedia :"+dome.stokTendaEiger);
                        case 2:
                            System.out.println("Berikut Stok Eiger yang tersedia :"+dome.stokTendaEiger);
                        case 3:
                            System.out.println("Berikut Stok Eiger yang tersedia :"+dome.stokTendaEiger);
                        case 4:
                            System.out.println("Berikut Stok Eiger yang tersedia :"+dome.stokTendaEiger);
                               
                    }
                    case 3:
                        //Tenda Pramukaa
                        System.out.println("===== Tenda Pramuka =====");
                        System.out.println("Merk yang tersedia :");
                        for(String b :dome.merk){
                            System.out.println(b);   
                    }
                        System.out.println("Pilih Merk :");
                    pil=camp.nextInt();
                    switch(pil){
                        case 1:
                            System.out.println("Berikut Stok Eiger yang tersedia :"+dome.stokTendaEiger);
                        case 2:
                            System.out.println("Berikut Stok Eiger yang tersedia :"+dome.stokTendaEiger);
                               
                    }
                    
                }
            case 2:
                System.out.println("===== Matras =====");
                System.out.println("Merk yang Tersedia");
                for(String b :matras1.merk){
                    System.out.println(b);
                }
                System.out.println("Pilih Merk :");
            pil=camp.nextInt();
            switch(pil){
                case 1:
                    System.out.println("Berikut Stok Airland yang tersedia :"+matras1.stokMatrasAirland);
                    System.out.println("Pilih 1");
                    pil=camp.nextInt();
                    if (pil==1){
                        System.out.println("Jumlah :");
                        penarikan = scan.nextInt();
                        PenarikanAirland(penarikan);
                        break;
                            
                    }
                    

        
                    
                    
            }
            
                
                   
            
                }
  
        }
    //PENARIKAN AIRLAND(MATRAS)
    public void PenarikanAirland(int nominal){
    matras1.stokMatrasAirland = matras1.getStokMatrasAirland();
    if (nominal > matras1.stokMatrasAirland){
                        System.out.println("Maaf jumlah yang di sewa melebihi stok");
                    }else{
                    matras1.stokMatrasAirland -=nominal;
                    matras1.setStokMatrasAirland(matras1.stokMatrasAirland);
                        System.out.println("Jumlah yang di sewa :"+nominal);
                        System.out.println("Sisa Stok : "+matras1.getStokMatrasAirland());
            }
        }
    
    
    
    
    
    
    
        
        
    }


