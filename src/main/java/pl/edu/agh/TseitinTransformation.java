package pl.edu.agh;

public class TseitinTransformation {

    private Formula formula;

    public TseitinTransformation(DNFFile dnfFile) {
        this.formula = new Formula(dnfFile);
    }

    public CNFFile convertDNFToCNF() {
        CNFFile.CNFFileBuilder cnfFileBuilder = new CNFFile.CNFFileBuilder();
        CNFFile cnfFile = cnfFileBuilder.filepath("").build();
        return cnfFile;
    }

}
