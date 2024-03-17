package JavaHTPE11.ch_5;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NY");
        AutoPolicy policy2 = new AutoPolicy(11111112, "Ford Fusion", "ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not")
        );
    }
}
