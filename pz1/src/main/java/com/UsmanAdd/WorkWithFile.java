package com.UsmanAdd;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithFile{
        private String file;
        private ArrayList<String> text = new ArrayList<String>();

        public WorkWithFile(String file){
            this.file = file;
        }

        public void reader() throws Exception{
            FileReader fr = new FileReader(file);
            Scanner scan = new Scanner(fr);
            while (scan.hasNext()) {
                text.add(scan.nextLine());
            }
            display();
            fr.close();
        }

        public void spilling(String filter) {
            //Поиск с помощью regex
            String filterUp = filter.toUpperCase();
            String regex = "((^"+filterUp + "|\\s" + filterUp +")[\\s|,|?|...|.|!|:])|(\\s" + filterUp +"[,|.|\\?|!|;|:]*$)";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

            for (int i = 0; i < text.size(); i++){
                Matcher matcher = pattern.matcher(text.get(i).toUpperCase());
                while(matcher.find()){
                    System.out.println(text.get(i));
                    break;
                }
            }

            /* Обычный поиск
            String[] line;
            String[] filterLine;
            filterLine = filter.split(" ");
            for (int i = 0; i < text.size(); i++) {
                if (filterLine.length == 1) {
                    line = text.get(i).split(" ");
                    for (String word : line){
                        if (word.length() == filter.length()
                                && (word.toUpperCase().contains(filter.toUpperCase())
                                || text.get(i).toUpperCase().contains(filter.toUpperCase() + ","))){
                            System.out.println(text.get(i));
                            break;
                        }
                    }
                } else {
                    if (text.get(i).toUpperCase().contains(filter.toUpperCase())){
                        System.out.println(text.get(i));
                    }
                }
            } */
        }

        private void display(){
            for (int i = 0; i < text.size(); i++) {
                System.out.println(text.get(i));
            }
        }
}
