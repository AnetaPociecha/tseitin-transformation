## Tseitin transformation

#### DNF DIMACS to CNF DIMACS converter

Tseitin transformation takes input file in DNF DIMACS format and produces output file CNF DIMACS format.

Usage examples:

```java
DNFFile.DNFFileBuilder dnfFileBuilder = new DNFFile.DNFFileBuilder();
DNFFile input = dnfFileBuilder.filepath("source filename").build();
TseitinTransformation tseitinTransformation = new TseitinTransformation(input);
CNFFile output = tseitinTransformation.convertDNFToCNF();
output.save("target filename");
```

```java
DNFFile.DNFFileBuilder dnfFileBuilder = new DNFFile.DNFFileBuilder();
DNFFile input = dnfFileBuilder.name("name").text("content").build();
TseitinTransformation tseitinTransformation = new TseitinTransformation(input);
CNFFile output = tseitinTransformation.convertDNFToCNF();
String text = output.getText();
```
