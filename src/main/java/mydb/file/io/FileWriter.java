package mydb.file.io;

import mydb.datastructure.TableData;

import java.io.*;

public class FileWriter extends FileIO{
    private FileOutputStream fileOutputStream;
    ObjectOutputStream objectOutputStream;

    public FileWriter(String file) throws IOException {
        super(file);
        this.fileOutputStream = new FileOutputStream(new File(file));
        this.objectOutputStream = new ObjectOutputStream(this.fileOutputStream);
    }

    public FileOutputStream getFileOutputStream() {
        return fileOutputStream;
    }

    public void setFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public ObjectOutputStream getObjectOutputStream() {
        return objectOutputStream;
    }

    public void setObjectOutputStream(ObjectOutputStream objectOutputStream) {
        this.objectOutputStream = objectOutputStream;
    }

    public void writeTable(TableData table) throws IOException {
        this.objectOutputStream.writeObject(table);
    }
}
