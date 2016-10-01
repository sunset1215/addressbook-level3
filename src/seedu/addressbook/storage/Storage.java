package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents an abstract storage used to store address book data.
 */
public abstract class Storage {

    /**
     * Signals that some error has occurred while trying to convert and read/write data between the application
     * and the storage file.
     */
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }

    /**
     * Signals that the given file path does not fulfill the storage filepath constraints.
     */
    public static class InvalidStorageFilePathException extends IllegalValueException {
        public InvalidStorageFilePathException(String message) {
            super(message);
        }
    }
    
    
    /**
     * Initialize Storage with a concrete subclass. This method can be modified to allow users to select the 
     * storage type
     * 
     * @throws InvalidStorageFilePathException
     */
    public static Storage initialise() throws InvalidStorageFilePathException {
        return new StorageFile();
    }
    
    /**
     * Saves all data to the storage.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to file.
     */
    public abstract void save(AddressBook addressBook) throws StorageOperationException;

    /**
     * Loads data from the storage.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data from file.
     */
    public abstract AddressBook load() throws StorageOperationException;

    /**
     * Returns the path of the storage.
     */
    public abstract String getStoragePath();

}
