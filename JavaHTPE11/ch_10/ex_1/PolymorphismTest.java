package JavaHTPE11.ch_10.ex_1;

public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Or", "Hasson"
                , "222-22-2222", 10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", 5000,
                .04, 300);

        System.out.printf("%s %s: %n%n%s%n%n",
                "Call CommissionEmployee's toString with superclass reference",
                "to superclass object",
                commissionEmployee);

        System.out.printf("%s %s: %n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to superclass object",
                basePlusCommissionEmployee);

        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
        System.out.printf("%s %s: %n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with superclass",
                "reference to subclass object",
                commissionEmployee2);
    }
}
