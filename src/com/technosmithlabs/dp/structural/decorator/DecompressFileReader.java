package com.technosmithlabs.dp.structural.decorator;

public class DecompressFileReader extends ReaderDecorator {
    public DecompressFileReader(Reader reader) {
        super.setReaderType(reader);
    }
    public void read() {
        System.out.println("I am decompressing the file");
        System.out.println("Decompressing file complete");
        super.getReaderType().read();    }
}
