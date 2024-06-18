import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    final byte monthsInYear=12;
    final byte percent=100;
    Scanner input= new Scanner(System.in);
    System.out.print("Principal: ");
    int principal=input.nextInt();

    System.out.print("Annual Interest Rate: ");
    float monthlyRate=input.nextFloat()/percent/monthsInYear;

    System.out.print("Period (Years): ");
    int paymentsInMonths=input.nextInt()*monthsInYear;

    double calculation=principal*(
                    (monthlyRate*Math.pow(1+monthlyRate,paymentsInMonths))
                    /(Math.pow(1+monthlyRate,paymentsInMonths)-1)
                     );
    String mortgage=NumberFormat.getCurrencyInstance().format(calculation);
    System.out.print("Mortgage: "+ mortgage);
    }
}