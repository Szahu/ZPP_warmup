package com.example.cmdline;

import com.example.Greeting;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.ParseException;

public class Runner {
    public static void main(String args[]) {
        Greeting.sayHi();

        Options options = new Options();
        options.addOption("o", "option", false, "Display this value");
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            if (cmd.hasOption("o")) {
                System.out.println("Option was set");
            } else {
                System.out.println("Option was not set");
            }
        } catch (ParseException pe) {
            System.err.println("Failed to parse args.");
        }
    }
}
