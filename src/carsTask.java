import java.util.Scanner;

public class carsTask {
    public static void main(String[] args) {
        /*
Task
String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};

dizisini oluşturup, ekranda sıra numaralarıyla listeleyiniz.
1. Honda
2. Toyota
...     şeklinde olacaktır.

Listenin en altında kullanıcıdan seçim yapması istenilecektir.

Kullanıcının seçtiği arabaya uygun fiyat;
      Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın.
Şeklinde gösterilecektir.

Not 1: Arabaların fiyatı seçildikleri anda rastgele (randomly) üretilecektir.
Honda – Toyota – Nissan (Random price between 20000 and 40000)
BMW-Mercedes(Random price between 50000 and 80000)
Porsche - Ferrari(Random price between 100000 and 150000)

 */

        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};

        System.out.println("|    Arabalar    |");

        System.out.println("1. Honda");
        System.out.println("2. Toyota");
        System.out.println("3. Nissan");
        System.out.println("5. BMW");
        System.out.println("6. Mercedes");
        System.out.println("7. Porsche");
        System.out.println("8. Ferrari");
        System.out.print("Seçiminiz : ");
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();


    }
}

