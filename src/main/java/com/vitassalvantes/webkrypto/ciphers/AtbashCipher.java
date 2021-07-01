package com.vitassalvantes.webkrypto.ciphers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class for encrypting messages with Atbash cipher
 *
 * @author VitasSalvantes
 * @version 1.5
 */

public class AtbashCipher {

    /**
     * List of letters of the English alphabet
     */
    private final ArrayList<Character> englishAlphabet = new ArrayList<Character>();

    /**
     * En- or decrypted message
     */
    private String outputMessage = "";

    /**
     * Message from user
     */
    private char[] inputMessage;

    /**
     * Method for creating letters of the English alphabet
     */
    private void createEnglishAlphabet() {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            englishAlphabet.add(letter);
        }
    }

    /**
     * Setter for {@link AtbashCipher#inputMessage}
     */
    public void setInputMessage(String inputMessage) {
        this.inputMessage = inputMessage.toLowerCase().toCharArray();
    }

    /**
     * Method for encrypting a user message with Atbash cipher
     */
    public String encryption() {
        createEnglishAlphabet();

        for (char c : inputMessage) {
            if (englishAlphabet.contains(c)) {
                outputMessage += englishAlphabet.get(25 - englishAlphabet.indexOf(c));
            } else {
                outputMessage += c;
            }
        }

        return outputMessage;
    }
}