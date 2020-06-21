package pl.edu.agh;

public final class DNFFile extends AbstractFile {

    private DNFFile(String name, String text) {
        super(name, text);
    }

    public static class DNFFileBuilder {
        private String name;
        private String text;

        public DNFFileBuilder filepath(String filepath) {
            this.name = "tseitin";
            this.text = "1 -2 3 4 -5 0\n" +
                    "2 -3 -4 5 6 0\n" +
                    "-1 2 -3 4 5 0\n" +
                    "1 -3 4 5 6 0\n" +
                    "-2 -3 4 5 6 0\n";
            return this;
        }

        public DNFFileBuilder text(String text) {
            this.text = text;
            return this;
        }

        public DNFFileBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DNFFile build() {
            DNFFile dnfFile = new DNFFile(this.name, this.text);
            return dnfFile;
        }
    }
}
