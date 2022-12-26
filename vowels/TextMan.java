package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class TextMan {
    String text;
    ArrayList<String> words = new ArrayList<String>();
    public TextMan(String text) {
        this.text = text;
    }

    public void NumSent(){
        ArrayList<String> sentences = new ArrayList<String>();
        sentences.addAll(Arrays.asList(this.text.split("\\.")));
        System.out.println("Number of sentences: " + sentences.size());
    }

    public void NumWords(){
        words.addAll(Arrays.asList(this.text.split(" ")));
        System.out.println("Number of words: " + words.size());
    }

    public void NumLet(){
        int sum = 0;
        String lines = text;
        lines = lines.toLowerCase();
        for(int i = 0; i < lines.length(); ++i){
            char el = lines.charAt(i);
            if(el >= 'a' && el <= 'z'){
                ++sum;
            }
        }
        System.out.println("Number of letters: " + sum);
    }

    public int SumIn(String el){
        return el.length();
    }

    public void VowelsAndCons(){
        String lines = this.text;
        int vow = 0, cons = 0;
        lines = lines.toLowerCase();

        for (int i = 0; i < lines.length(); ++i){
            char el = lines.charAt(i);
            if(el == 'i' || el == 'a' || el == 'e' || el == 'u' || el == 'y' || el == 'o'){
                ++vow;
            }else if(el >= 'a' && el <= 'z'){
                ++cons;
            }
        }
        System.out.println("Number of vowels: " + vow);
        System.out.println("Number of cons... consta... (I can't write it): " + cons);
    }

    public void mostFreqWords(){

    }
}