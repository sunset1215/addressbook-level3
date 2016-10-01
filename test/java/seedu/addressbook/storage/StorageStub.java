package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.Storage;

/**
 * Represents an empty implementation of StorageFile used to store address book data for testing purposes
 */
public class StorageStub extends Storage {

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
    public String getStoragePath() {
        // this method is supposed to do nothing
        return null;
    }

}
