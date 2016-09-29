package seedu.addressbook.parser;

import static seedu.addressbook.common.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.addressbook.commands.Command;
import seedu.addressbook.commands.IncorrectCommand;
import seedu.addressbook.commands.ViewAllCommand;

public class ParseViewAllCommand implements Parser {

    @Override
    public Command parseArguments(String arguments) {
        try {
            final int targetIndex = parseArgsAsDisplayedIndex(arguments);
            return new ViewAllCommand(targetIndex);
        } catch (ParseException | NumberFormatException e) {
            return new IncorrectCommand(String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                    ViewAllCommand.MESSAGE_USAGE));
        }
    }

}
