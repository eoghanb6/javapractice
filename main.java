import java.security.PublicKey;
import java.util.Scanner ;
public class main
{

	public static void main(String[] args)
	{
        Scanner user_input = new Scanner (System.in) ;
        String name;
        System.out.print("Enter your name: ") ;
        name = user_input.next() ;
        float salary;
        System.out.print("Enter your salary:");
        salary = user_input.nextFloat() ;

        float tax;
        if (salary <= 10000) {
            tax = 20;
        } else if (salary > 10000) {
            tax = 25;
        } else {
            tax = 0;
        }

        float result = CalculateSalaryWithTax(tax, name, salary);

    }

    public static float CalculateSalaryWithTax (float taxPercent, String personName, float salaryBeforeTax)
    {

            System.out.println("Starting to calculate tax for" + " " + personName);
            System.out.println(salaryBeforeTax + " before tax");

            float TaxDeduction = ((taxPercent / 100) * salaryBeforeTax);
            System.out.println(TaxDeduction + " To be deducted");
            System.out.println("Finished calculating tax for" + " " + personName);
            float SalaryWithTax =(salaryBeforeTax - TaxDeduction);
            System.out.println(SalaryWithTax + " Amount to be paid");

            return SalaryWithTax ;
    }



}



