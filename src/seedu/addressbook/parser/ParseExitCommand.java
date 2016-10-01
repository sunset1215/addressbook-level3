package seedu.addressbook.parser;

import seedu.addressbook.commands.Command;
import seedu.addressbook.commands.ExitCommand;

/**
 * Represents a parser that parses ExitCommand
 */
public class ParseExitCommand implements Parser {

    @Override
    public Command parseArguments(String arguments) {
        return new ExitCommand();
    }

}
