package com.javarush.cryptanalyzer.popov.repository;

import com.javarush.cryptanalyzer.popov.services.*;


public enum FunctionCode {
    ENCODE(new Encode()), DECODE(new Decode()), UNSUPPORTED_FUNCTION(new UnsupportedFunction()),BRUTEFORCE(new BruteForce());

    private Function function;

    FunctionCode(Function function) {
        this.function = function;
    }

    public Function getFunction() {
        return function;
    }
}
