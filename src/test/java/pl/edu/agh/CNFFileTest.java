package pl.edu.agh;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CNFFileTest {

    @Test
    void initialize() throws IOException {
        CNFFile.CNFFileBuilder cnfFileBuilder = new CNFFile.CNFFileBuilder();
        CNFFile cnfFile = cnfFileBuilder.filepath("C:\\Users\\anhay\\Desktop\\sp\\tseitin-transformation\\src\\test\\java\\pl\\edu\\agh\\sample.cnf").build();
        String name = cnfFile.getName();
        String content = cnfFile.getText();

        assertEquals("sample.cnf", name);
        assertEquals("some content", content);
    }

    @Test
    void initializeBadly() throws IOException {
        CNFFile.CNFFileBuilder cnfFileBuilder = new CNFFile.CNFFileBuilder();

        assertThrows(IllegalFileExtensionException.class, () -> cnfFileBuilder.filepath("C:\\Users\\anhay\\Desktop\\sp\\tseitin-transformation\\src\\test\\java\\pl\\edu\\agh\\sample.txt").build(), ".cnf file expected");

    }

}