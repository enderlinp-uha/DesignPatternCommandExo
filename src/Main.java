public class Main {
    public static void main(String[] args) {
        Version version = new Version("1.0.0");

        ICommand major = new UpdateMajorCommand(version);
        ICommand minor = new UpdateMinorCommand(version);
        ICommand patch = new UpdatePatchCommand(version);

        Controller controller = new Controller();
        controller.addCommand("patch", patch);
        System.out.println(version.toString());

        version.updateMajor();
        System.out.println(version.toString());

        minor.execute();
        System.out.println(version.toString());

        controller.execute("patch");
        System.out.println(version.toString());
    }
}