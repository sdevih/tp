package scrolls.elder.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import scrolls.elder.commons.exceptions.DataLoadingException;
import scrolls.elder.model.ReadOnlyAddressBook;
import scrolls.elder.model.ReadOnlyUserPrefs;
import scrolls.elder.model.UserPrefs;

/**
 * API of the Storage component
 */
public interface Storage extends AddressBookStorage, UserPrefsStorage {

    @Override
    Optional<UserPrefs> readUserPrefs() throws DataLoadingException;

    @Override
    void saveUserPrefs(ReadOnlyUserPrefs userPrefs) throws IOException;

    @Override
    Path getAddressBookFilePath();

    @Override
    Optional<ReadOnlyAddressBook> readAddressBook() throws DataLoadingException;

    @Override
    void saveAddressBook(ReadOnlyAddressBook addressBook) throws IOException;

}
