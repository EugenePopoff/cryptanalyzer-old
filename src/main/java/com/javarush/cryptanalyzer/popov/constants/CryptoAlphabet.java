package com.javarush.cryptanalyzer.popov.constants;

public class CryptoAlphabet {
    private static final String lettersUpperCase = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static final String lettersLowerCase = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String numbers = "0123456789";
    private static final String symbols = ".,-:!?\" ";
    public static final String ALPHABET = lettersUpperCase+lettersLowerCase+numbers+symbols;


}
