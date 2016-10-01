package seedu.addressbook.parser;

import seedu.addressbook.commands.Command;
import seedu.addressbook.commands.HelpCommand;

/**
 * Represents a parser that parses HelpCommand
 */
public class ParseHelpCommand implements Parser {

    @Override
    public Command parseArguments(String arguments) {
        return new HelpCommand();
    }

}
