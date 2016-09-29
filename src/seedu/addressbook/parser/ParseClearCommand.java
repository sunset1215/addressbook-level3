package seedu.addressbook.parser;

import seedu.addressbook.commands.ClearCommand;
import seedu.addressbook.commands.Command;

public class ParseClearCommand implements Parser {

    @Override
    public Command parseArguments(String arguments) {
        return new ClearCommand();
    }

}
