package seedu.addressbook.parser;

import static seedu.addressbook.common.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;

import seedu.addressbook.commands.Command;
import seedu.addressbook.commands.FindCommand;
import seedu.addressbook.commands.IncorrectCommand;

/**
 * Represents a parser that parses FindCommand
 */
public class ParseFindCommand implements Parser {

    @Override
    public Command parseArguments(String arguments) {
        final Matcher matcher = KEYWORDS_ARGS_FORMAT.matcher(arguments.trim());
        if (!matcher.matches()) {
            return new IncorrectCommand(String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                    FindCommand.MESSAGE_USAGE));
        }

        // keywords delimited by whitespace
        final String[] keywords = matcher.group("keywords").split("\\s+");
        final Set<String> keywordSet = new HashSet<>(Arrays.asList(keywords));
        return new FindCommand(keywordSet);
    }

}
