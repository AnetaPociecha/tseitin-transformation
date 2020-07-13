package pl.edu.agh;

import java.io.*;

public final class CNFFile extends AbstractFile {

    private CNFFile(String name, String text) {
        super(name, text);
    }

    public static class CNFFileBuilder {
        private String name;
        private String text;

        public CNFFile.CNFFileBuilder filepath(String filepath) throws IOException {

            if(!filepath.endsWith(".cnf")) {
                throw new IllegalFileExtensionException(".cnf file is expected");
            }

            File file = new File(filepath);
            BufferedReader br = new BufferedReader(new FileReader(file));

            StringBuilder stringBuilder = new StringBuilder();
            String buffer;

            while ((buffer = br.readLine()) != null) {
                stringBuilder.append(buffer);
            }

            this.name = file.getName();
            this.text = stringBuilder.toString();

            return this;
        }

        public CNFFile build() {
            CNFFile cnfFile = new CNFFile(this.name, this.text);
            return cnfFile;
        }
    }
}
