package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("pie");
        chart.display();
    }
}
