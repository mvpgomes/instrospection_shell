package ist.meic.pa.command;

import ist.meic.pa.MethodCallEntry;

import java.util.Stack;

public class AbortCommand implements Command {
    @Override
    public void execute(Stack<MethodCallEntry> stack, Object calledObject, String[] args) {
        System.exit(0);
    }
}
