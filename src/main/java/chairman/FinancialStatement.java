package chairman;

public class FinancialStatement {
    private String clintName;

    public FinancialStatement(String clintName) {
        this.clintName = clintName;
    }

    public String getClintName() {
        return clintName;
    }

    public void setClintName(String clintName) {
        this.clintName = clintName;
    }

    @Override
    public String toString() {
        return "FinancialStatement{" +
                "clintName='" + clintName + '\'' +
                '}';
    }
}
