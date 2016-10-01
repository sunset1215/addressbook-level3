package seedu.addressbook.parser;

import static seedu.addressbook.common.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.addressbook.commands.Command;
import seedu.addressbook.commands.IncorrectCommand;
import seedu.addressbook.commands.ViewCommand;

/**
 * Represents a parser that parses ViewCommand
 */
public class ParseViewCommand implements Parser {

    @Override
    public Command parseArguments(String arguments) {
        try {
            final int targetIndex = parseArgsAsDisplayedIndex(arguments);
            return new ViewCommand(targetIndex);
        } catch (ParseException | NumberFormatException e) {
            return new IncorrectCommand(String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                    ViewCommand.MESSAGE_USAGE));
        }
    }

}
