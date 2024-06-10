public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else{
            int megabytes= kiloBytes / 1024;
            int remainigkiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB"+" = "+megabytes+" MB"+" And Remaining is "+remainigkiloBytes+" KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(4000);
        printMegaBytesAndKiloBytes(-7000);

    }

}