package seedu.addressbook.parser;

import seedu.addressbook.commands.Command;
import seedu.addressbook.commands.HelpCommand;

public class ParseHelpCommand implements Parser {

    @Override
    public Command parseArguments(String arguments) {
        return new HelpCommand();
    }

}
