package pl.edu.agh;

public final class CNFFile extends AbstractFile {

    private CNFFile(String name, String text) {
        super(name, text);
    }

    public static class CNFFileBuilder {
        private String name;
        private String text;

        public CNFFile.CNFFileBuilder filepath(String filepath) {
            this.name = "tseitin";
            this.text = "1 -2 3 4 -5 0\n" +
                    "2 -3 -4 5 6 0\n" +
                    "-1 2 -3 4 5 0\n" +
                    "1 -3 4 5 6 0\n" +
                    "-2 -3 4 5 6 0\n";
            return this;
        }

        public CNFFile build() {
            CNFFile cnfFile = new CNFFile(this.name, this.text);
            return cnfFile;
        }
    }
}
