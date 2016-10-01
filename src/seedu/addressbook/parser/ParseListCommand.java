package seedu.addressbook.parser;

import seedu.addressbook.commands.Command;
import seedu.addressbook.commands.ListCommand;

/**
 * Represents a parser that parses ListCommand
 */
public class ParseListCommand implements Parser {

    @Override
    public Command parseArguments(String arguments) {
        return new ListCommand();
    }

}
