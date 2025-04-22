package chairman;

public class NewMeeting {
    private String dob;

    public NewMeeting(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "NewMeeting{" +
                "dob='" + dob + '\'' +
                '}';
    }
}
