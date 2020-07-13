package pl.edu.agh;

import java.io.IOException;

public class TseitinTransformation {

    private Formula formula;

    public TseitinTransformation(DNFFile dnfFile) {
        this.formula = new Formula(dnfFile);
    }

    public CNFFile convertDNFToCNF() throws IOException {
        CNFFile.CNFFileBuilder cnfFileBuilder = new CNFFile.CNFFileBuilder();
        CNFFile cnfFile = cnfFileBuilder.build();
        return cnfFile;
    }

}
