package chairman;

public class Finance {
    private String financialReportsButton;


    public Finance(String financialReportsButton) {
        this.financialReportsButton = financialReportsButton;
    }

    public String getFinancialReportsButton() {
        return financialReportsButton;
    }

    public void setFinancialReportsButton(String financialReportsButton) {
        this.financialReportsButton = financialReportsButton;
    }

    @Override
    public String toString() {
        return "Finance{" +
                "financialReportsButton='" + financialReportsButton + '\'' +
                '}';
    }
}
