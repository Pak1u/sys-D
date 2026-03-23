
import java.util.ArrayList;

public class Remote {
    public ArrayList<Command> commands;
    public Command undoCommand;
    public Remote() {
        commands = new ArrayList<>(5);
        for(int i = 0 ; i < 5; ++i) {
            commands.add(new noCommand());
        }
        undoCommand = commands.get(4);
    }

    public void OnButtonPress(int slot) {
        if(slot == 4) {
            undoCommand.undo();
        }
        else {
            commands.get(slot).execute();
            undoCommand = commands.get(slot);
        }
    }

}
