import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        QueueLL<String> queue = new QueueLL<>();
        Scanner sc = new Scanner(System.in);
        boolean lanjut = true;
        while(lanjut){
        System.out.println("1. Tambah Data");
        System.out.println("2. Pekerjaan Yang Harus Diselesaikan");
        System.out.println("3. Hapus Data");
        System.out.println("4. Print Semua Data");
        System.out.println("5. done");
        System.out.print("Perintah: ");
        int pilih = sc.nextInt();
        String skip = sc.nextLine();
        switch (pilih) {
            case 1:
                String tambah = sc.nextLine();
                queue.queued(tambah);
                break;
            case 2:
                System.out.println("Pekerjaan yang harus diselesaikan : "+queue.peek());
                break;
            case 3:
                queue.unqueue();
                break;
            case 4:
                queue.printAll();
                break;
            case 5:
                lanjut = false;
                break;
            default:
                System.out.println("Beri Input Yang Valid");
                break;
        }
        }
        
        sc.close();
    }
}