package mydb.fileworking.validation;

import mydb.validation.Validator;

import java.io.File;

public class FileValidation implements Validator {
    private final int MAX_FILE_SIZE = 8;
    @Override
    public boolean validate(Object object) {
        return new File(String.valueOf(object)).length() / 1024 >= MAX_FILE_SIZE;
    }
}
