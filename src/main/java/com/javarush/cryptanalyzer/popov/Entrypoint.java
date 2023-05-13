package com.javarush.cryptanalyzer.popov;

import com.javarush.cryptanalyzer.popov.app.Application;
import com.javarush.cryptanalyzer.popov.controller.MainController;
import com.javarush.cryptanalyzer.popov.entity.Result;
import com.javarush.cryptanalyzer.popov.exception.FileReadingException;
import com.javarush.cryptanalyzer.popov.repository.ResultCode;
import com.javarush.cryptanalyzer.popov.view.ConsoleView;

import com.javarush.cryptanalyzer.popov.view.View;

import java.io.IOException;
import java.util.Scanner;


public class Entrypoint {
    public static void main(String[] args) throws IOException, FileReadingException {

        View view = new ConsoleView();
        MainController mainController = new MainController(view);
        Application application = new Application(mainController);

        while (true) {
            Result result = application.run();
            application.printResult(result);

            if (!mainController.getView().getContinuation()) {
                break;
            }
        }
    }
}

