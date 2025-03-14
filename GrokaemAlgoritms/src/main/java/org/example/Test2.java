package org.example;


import java.util.Map;

public class Test2 {
    public static void main(String[] args)
    {
        // Get the value of all environment variables
        // at once and store it in Map
        Map<String, String> env = System.getenv();

        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName,
                    env.get(envName));
        }
    }
}