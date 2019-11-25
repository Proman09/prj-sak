/*******************************************************************************
 * Copyright (C) 2019 Eric Pogue. All rights reserved. 
 * 
 * This file is part of the SwissArmyKnifeLite (sakl) project.
 * 
 * This file can not be copied and/or distributed without 
 * the express permission of Eric Pogue
 * 
 * This application uses the open source component HttpRequest.java
 ******************************************************************************/

public class sak {
    public static void main(String[] args) {
        System.out.println("");
        if (args.length < 1) {
            System.out.println("Nothing received. Type \" -Help \" more information.");         
        }
        else if (args[0].equalsIgnoreCase("-Help")) {
            System.out.println("-- HELP: STARTING SUCCESSFULLY --");
            Help.printHelp();          
        } 
        else if (args[0].equalsIgnoreCase("-HttpRequest")) {
            System.out.println("-- HTTPREQUEST: STARTING SUCCESSFULLY --");
            if (args.length <2) {
                System.out.println("Man, check those parameters and try again bro.");
            } else {
                String URL = args[1]; 
                HttpRequest request = new HttpRequest();
                long startTime = System.nanoTime();
                if (request.readURL(URL)) {
                    System.out.println(request);
                    System.out.println("---------------------------------------------------------------");
                    long elapsedTime = System.nanoTime() - startTime; 
                    System.out.println("\nTime required to complete this Request Command: " + elapsedTime/10000000 + " milliseconds.");
                }           
            }
        }   
        else if (args[0].equalsIgnoreCase("-HttpRequestIndex")) {
             System.out.println("--- HTTPREQUEST INDEX: STARTING SUCCESSFULLY ---");   
             System.out.println("\nHere are your URLs."); 
             System.out.println("\nSelect and copy the line to get individual JSON data");  
            if (args.length != 2) {
                System.out.println("Please check your parameters and try again, man.");
            } else {
                String indexURL = args[1];
                HttpRequestURLs request = new HttpRequestURLs();
                long startTime = System.nanoTime();
                if (request.readURL(indexURL)) {
                    System.out.println(request);
                    System.out.println("---------------------------------------------------------------");
                    long elapsedTime = System.nanoTime() - startTime; 
                    System.out.println("\nTime required to complete this Index Command: " + elapsedTime/1000000 + " milliseconds.");
                }  
            }
        }       

        System.out.println("");
    }  
} 