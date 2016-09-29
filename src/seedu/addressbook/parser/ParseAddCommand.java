package seedu.addressbook.parser;

import static seedu.addressbook.common.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.util.regex.Matcher;

import seedu.addressbook.commands.AddCommand;
import seedu.addressbook.commands.Command;
import seedu.addressbook.commands.IncorrectCommand;
import seedu.addressbook.data.exception.IllegalValueException;

public class ParseAddCommand implements Parser {

    @Override
    public Command parseArguments(String arguments) {
        final Matcher matcher = PERSON_DATA_ARGS_FORMAT.matcher(arguments.trim());
        // Validate arguments string format
        if (!matcher.matches()) {
            return new IncorrectCommand(String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE));
        }
        try {
            return new AddCommand(
                    matcher.group("name"),

                    matcher.group("phone"),
                    isPrivatePrefixPresent(matcher.group("isPhonePrivate")),

                    matcher.group("email"),
                    isPrivatePrefixPresent(matcher.group("isEmailPrivate")),

                    matcher.group("address"),
                    isPrivatePrefixPresent(matcher.group("isAddressPrivate")),

                    getTagsFromArgs(matcher.group("tagArguments"))
                    );
        } catch (IllegalValueException ive) {
            return new IncorrectCommand(ive.getMessage());
        }
    }

}
