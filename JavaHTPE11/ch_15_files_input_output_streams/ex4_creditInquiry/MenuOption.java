package JavaHTPE11.ch_15_files_input_output_streams.ex4_creditInquiry;

public enum MenuOption {
    // declare contents of enum type
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);

    private final int value;

    private MenuOption(int value) {
        this.value = value;
    }
}
