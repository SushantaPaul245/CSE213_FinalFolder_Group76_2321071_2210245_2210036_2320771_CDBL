package chairman;

public class navigation {
    private String overallButton;

    public navigation(String overallButton) {
        this.overallButton = overallButton;
    }

    public String getOverallButton() {
        return overallButton;
    }

    public void setOverallButton(String overallButton) {
        this.overallButton = overallButton;
    }

    @Override
    public String toString() {
        return "navigation{" +
                "overallButton='" + overallButton + '\'' +
                '}';
    }
}
