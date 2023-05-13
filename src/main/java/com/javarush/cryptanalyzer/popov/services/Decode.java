package com.javarush.cryptanalyzer.popov.services;

import com.javarush.cryptanalyzer.popov.entity.Result;
import com.javarush.cryptanalyzer.popov.exception.FileReadingException;
import com.javarush.cryptanalyzer.popov.processes.FileUtils;
import com.javarush.cryptanalyzer.popov.processes.Decrypt;
import com.javarush.cryptanalyzer.popov.processes.FileUtils;
import com.javarush.cryptanalyzer.popov.processes.WriteToFile;
import com.javarush.cryptanalyzer.popov.repository.ResultCode;

import java.io.IOException;
import java.util.Objects;


public class Decode implements Function {

    @Override
    public Result execute(String[] args) throws  FileReadingException {

        String key = args[1];
        String inputFile = args[2];
        String outputFile = args[3];

        //System.out.println(message); // Вывод сообщение с исходным текстом
        String decrypted = Decrypt.decrypt(Objects.requireNonNull(FileUtils.readFile(inputFile)), Integer.parseInt(key));

        WriteToFile.write(outputFile, decrypted);

        return new Result(ResultCode.OK);
    }
}
