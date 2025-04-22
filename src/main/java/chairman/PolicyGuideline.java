package chairman;

public class PolicyGuideline {
    private String policyNameTF;
    private String policyDetailsTA;

    public PolicyGuideline(String policyNameTF, String policyDetailsTA) {
        this.policyNameTF = policyNameTF;
        this.policyDetailsTA = policyDetailsTA;
    }

    public String getPolicyNameTF() {
        return policyNameTF;
    }

    public void setPolicyNameTF(String policyNameTF) {
        this.policyNameTF = policyNameTF;
    }

    public String getPolicyDetailsTA() {
        return policyDetailsTA;
    }

    public void setPolicyDetailsTA(String policyDetailsTA) {
        this.policyDetailsTA = policyDetailsTA;
    }

    @Override
    public String toString() {
        return "PolicyGuideline{" +
                "policyNameTF='" + policyNameTF + '\'' +
                ", policyDetailsTA='" + policyDetailsTA + '\'' +
                '}';
    }
}
