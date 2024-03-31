package JavaHTPE11.ch_10.ex_3;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        // create four-element Payable array
        Payable[] payableObjects = new Payable[]{
                new Invoice("01234", "seat", 2, 375.0),
                new Invoice("56789", "tire", 4, 79.95),
                new SalariedEmployee("Or", "Hasson", "111-11-111", 700.00),
                new SalariedEmployee("Lisa", "Barnes", "222-22-222", 1200.00)
        };

        System.out.println("Invoices and Employees processed polymorphic-ally");

        // generically process each element in array payableObjects
        for (Payable currentPayable : payableObjects) {
            // output currentPayable and its appropriate payment amount
            System.out.printf("%n%s %npayment due: $%, .2f%n",
                    currentPayable.toString(),
                    currentPayable.getPaymentAmount());
        }

    }

}
