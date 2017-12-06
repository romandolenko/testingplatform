package com.testing.platform.business.protocol;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Address {

    private String street;

    private String city;

    private String state;

    private String zipCode;

    public Address() {
    }

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public abstract String getTest();
}

class Test extends Address {

    @Override
    public String getTest() {
        return null;
    }

    public static void main(String[] args) throws IOException {

        PriorityQueue queue = new PriorityQueue();
        queue.add("dishes");
        queue.add("laundry");
        queue.add("bills");
        queue.add("bills");
        System.out.print(queue.size() + " " + queue.poll());
        System.out.print(" " + queue.peek() + " " + queue.poll());
        System.out.println(" " + queue.poll() + " " + queue.poll());

        String filename;
        filename = "";
        try {
            Map<String, Integer> hosts = new HashMap<>();
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            while (line != null) {
                String host = line.split(" ")[0];
                if (hosts.containsKey(host)) {
                    hosts.put(host, hosts.get(host) + 1);
                } else {
                    hosts.put(host, 1);
                }
                line = br.readLine();
            }
            StringBuilder content = new StringBuilder();
            for(String key : hosts.keySet()) {
                content.append(key).append(" ").append(hosts.get(key)).append(System.getProperty("line.separator"));
            }

            PrintWriter writer = new PrintWriter("records_" + filename, "UTF-8");
            writer.println(content.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
