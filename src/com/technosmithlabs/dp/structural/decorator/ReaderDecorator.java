package com.technosmithlabs.dp.structural.decorator;

public abstract class ReaderDecorator implements Reader {
    private Reader readerType;

    public Reader getReaderType() {
        return readerType;
    }

    public void setReaderType(Reader readerType) {
        this.readerType = readerType;
    }

    public abstract void read();
}
