package mydb.file.io;

public abstract class FileIO {
    protected String file;

    public FileIO(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
