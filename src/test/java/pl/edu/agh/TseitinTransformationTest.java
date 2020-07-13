package pl.edu.agh;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TseitinTransformationTest {

    @org.junit.jupiter.api.Test
    void perform() throws IOException {
        String inputFormula = "1 -2 3 4 -5 0\n" +
                "2 -3 -4 5 6 0\n" +
                "-1 2 -3 4 5 0\n" +
                "1 -3 4 5 6 0\n" +
                "-2 -3 4 5 6 0\n";
        String expectedOutputFormula = "10 2 0\n" +
                "-10 -2 0\n" +
                "-1 -10 20 0\n" +
                "-20 1 0\n" +
                "-20 10 0\n" +
                "-20 -3 30 0\n" +
                "-30 20 0\n" +
                "-30 3 0\n" +
                "-30 -4 40 0\n" +
                "-40 30 0\n" +
                "-40 4 0\n" +
                "50 5 0\n" +
                "-50 -5 0\n" +
                "-40 -50 60 0\n" +
                "-60 40 0\n" +
                "-60 50 0\n" +
                "70 3 0\n" +
                "-70 -3 0\n" +
                "-2 -70 80 0\n" +
                "-80 2 0\n" +
                "-80 70 0\n" +
                "90 4 0\n" +
                "-90 -4 0\n" +
                "-80 -90 100 0\n" +
                "-100 80 0\n" +
                "-100 90 0\n" +
                "-100 -5 110 0\n" +
                "-110 100 0\n" +
                "-110 5 0\n" +
                "-110 -6 120 0\n" +
                "-120 110 0\n" +
                "-120 6 0\n" +
                "130 1 0\n" +
                "-130 -1 0\n" +
                "-130 -2 140 0\n" +
                "-140 130 0\n" +
                "-140 2 0\n" +
                "150 3 0\n" +
                "-150 -3 0\n" +
                "-140 -150 160 0\n" +
                "-160 140 0\n" +
                "-160 150 0\n" +
                "-160 -4 170 0\n" +
                "-170 160 0\n" +
                "-170 4 0\n" +
                "-170 -5 180 0\n" +
                "-180 170 0\n" +
                "-180 5 0\n" +
                "190 3 0\n" +
                "-190 -3 0\n" +
                "-1 -190 200 0\n" +
                "-200 1 0\n" +
                "-200 190 0\n" +
                "-200 -4 210 0\n" +
                "-210 200 0\n" +
                "-210 4 0\n" +
                "-210 -5 220 0\n" +
                "-220 210 0\n" +
                "-220 5 0\n" +
                "-220 -6 230 0\n" +
                "-230 220 0\n" +
                "-230 6 0\n" +
                "240 2 0\n" +
                "-240 -2 0\n" +
                "250 3 0\n" +
                "-250 -3 0\n" +
                "-240 -250 260 0\n" +
                "-260 240 0\n" +
                "-260 250 0\n" +
                "-260 -4 270 0\n" +
                "-270 260 0\n" +
                "-270 4 0\n" +
                "-270 -5 280 0\n" +
                "-280 270 0\n" +
                "-280 5 0\n" +
                "-280 -6 290 0\n" +
                "-290 280 0\n" +
                "-290 6 0\n" +
                "-60 300 0\n" +
                "-120 300 0\n" +
                "-300 60 120 0\n" +
                "-300 310 0\n" +
                "-180 310 0\n" +
                "-310 300 180 0\n" +
                "-310 320 0\n" +
                "-230 320 0\n" +
                "-320 310 230 0\n" +
                "-320 330 0\n" +
                "-290 330 0\n" +
                "-330 320 290 0\n" +
                "330 0";

        DNFFile.DNFFileBuilder builder = new DNFFile.DNFFileBuilder();
        DNFFile dnfFile = builder.text(inputFormula).name("output").build();
        TseitinTransformation tseitinTransformation = new TseitinTransformation(dnfFile);
        CNFFile outputFile = tseitinTransformation.convertDNFToCNF();
        String actualOutputFormula = outputFile.getText();

        assertEquals(expectedOutputFormula, actualOutputFormula);
    }
}