package seedu.addressbook.parser;

import seedu.addressbook.commands.Command;
import seedu.addressbook.commands.ExitCommand;

public class ParseExitCommand implements Parser {

    @Override
    public Command parseArguments(String arguments) {
        return new ExitCommand();
    }

}
