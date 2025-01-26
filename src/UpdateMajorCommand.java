public class UpdateMajorCommand implements ICommand {
    private final Version version;

    public UpdateMajorCommand(Version version) {
        this.version = version;
    }

    @Override
    public void execute() {
        this.version.updateMajor();
    }
}
