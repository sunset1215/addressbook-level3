package seedu.addressbook.parser;

import java.util.HashMap;

import seedu.addressbook.commands.*;

/**
 * Represents a map of parsers that contains the parser of every command
 */
public class ParserMap extends HashMap<String, Parser> {

    public ParserMap() {
        buildMap();
    }

    private void buildMap() {
        this.put(AddCommand.COMMAND_WORD, new ParseAddCommand());
        this.put(DeleteCommand.COMMAND_WORD, new ParseDeleteCommand());
        this.put(ClearCommand.COMMAND_WORD, new ParseClearCommand());
        this.put(FindCommand.COMMAND_WORD, new ParseFindCommand());
        this.put(ListCommand.COMMAND_WORD, new ParseListCommand());
        this.put(ViewCommand.COMMAND_WORD, new ParseViewCommand());
        this.put(ViewAllCommand.COMMAND_WORD, new ParseViewAllCommand());
        this.put(ExitCommand.COMMAND_WORD, new ParseExitCommand());
        this.put(HelpCommand.COMMAND_WORD, new ParseHelpCommand());
    }
    
    public ParserMap getParserMap() {
        return this;
    }
    
}
