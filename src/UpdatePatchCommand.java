public class UpdatePatchCommand implements ICommand {
    private final Version version;

    public UpdatePatchCommand(Version version) {
        this.version = version;
    }

    @Override
    public void execute() {
        this.version.updatePatch();
    }
}
