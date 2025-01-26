public class UpdateMinorCommand implements ICommand {
    private final Version version;

    public UpdateMinorCommand(Version version) {
        this.version = version;
    }

    @Override
    public void execute() {
        this.version.updateMinor();
    }
}
