public class Version {
    private String   version;
    private final String[] numbers;

    public Version() {
        this.version = "0.0.1";
        this.numbers = new String[] { "0", "0", "1" };
    }

    public Version(String version) {
        this.version = version;
        this.numbers = this.version.split("\\.");
    }

    public void updateMajor() {
        this.updateSegment(0);
    }

    public void updateMinor() {
        this.updateSegment(1);
    }

    public void updatePatch() {
        this.updateSegment(2);
    }

    private void updateSegment(int segment) {
        this.numbers[segment] = Integer.toString(Integer.parseInt(this.numbers[segment]) + 1);
        for (int i = segment + 1; i < this.numbers.length; i++) this.numbers[i] = "0";
        this.version = String.join(".", this.numbers);
    }

    @Override
    public String toString() {
        return this.version;
    }
}
