package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

/**
 * Represents an empty implementation of StorageFile used to store address book data for testing purposes
 */
public class StorageStub implements Storage {

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        // this method is supposed to do nothing
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        // this method is supposed to do nothing
        return null;
    }

    @Override
    public String getFilePath() {
        // this method is supposed to do nothing
        return null;
    }

}
