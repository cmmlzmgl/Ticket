import java.util.Scanner;

public class Ticket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distance, age, type;

        System.out.print("Lütfen Yaşınızı Giriniz: ");
        age = input.nextInt();

        System.out.print("Lütfen Mesafeyi KM Türünden Giriniz: ");
        distance = input.nextInt();

        System.out.print("Lütfen Uçuş Tipini Giriniz(Tek Yön = 1, Gidiş-Dönüş = 2: ");
        type = input.nextInt();

        if(distance < 0 || age < 0 || (type != 1 && type != 2))
        {
            System.out.print("Hatalı Değer Girdiniz. Lütfen Tekrar Deneyin!");
        } else
        {
            double price;
            if(type == 1)
            {
                price = distance * 0.10;
            } else
            {
                price = (distance * 0.10 * 2) * 0.8;
            }

            if (age < 12)
            {
                System.out.print("Bilet Turarınız: " + (price * 0.5));
            } else if (age < 24)
            {
                System.out.print("Bilet Turarınız: " + (price * 0.9));
            } else if (age > 65)
            {
                System.out.print("Bilet Turarınız: " + (price * 0.7));
            } else
            {
                System.out.print("Bilet Turarınız: " + price );
            }

        }


    }
}
