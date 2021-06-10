package command.lamp;

public class AlarmOnCommand implements Command {
    private Alarm theAlarm;

    public AlarmOnCommand(Alarm theAlarm) {
        this.theAlarm = theAlarm;
    }

    @Override
    public void execute() {
        this.theAlarm.start();
    }
}