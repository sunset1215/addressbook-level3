package seedu.addressbook.parser;

import seedu.addressbook.commands.ClearCommand;
import seedu.addressbook.commands.Command;

/**
 * Represents a parser that parses ClearCommand
 */
public class ParseClearCommand implements Parser {

    @Override
    public Command parseArguments(String arguments) {
        return new ClearCommand();
    }

}
