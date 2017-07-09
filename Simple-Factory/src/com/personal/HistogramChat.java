package com.personal;

/**
 * Created by mac on 09/07/2017.
 * 柱状图类：具体产品类
 */
public class HistogramChat implements Chart {
    public HistogramChat() {
        System.out.println("创建柱状图！");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}

// 饼状图类：具体产品类
class PieChart implements Chart {
    public PieChart() {

    }

    @Override
    public void display() {

    }
}

class LineChart implements Chart {
    public LineChart() {

    }

    @Override
    public void display() {

    }
}

class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChat();
        } else if(type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
        }

        return chart;
    }
}
