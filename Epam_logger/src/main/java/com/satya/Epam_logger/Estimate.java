package com.satya.Epam_logger;

public class Estimate {
	public double estimateHouse(double area,int standard,boolean fullyautomated){
        int arr[] = new int[4];
        arr[0] = 1200;
        arr[1] = 1500;
        arr[2] = 1800;
        arr[3] = 2500;
        int costpersquarefeet = 0;
        double constructionCost = 0;
        if(fullyautomated){
            costpersquarefeet = arr[3];
        }
        else {
            costpersquarefeet = arr[standard-1];
        }
        constructionCost = area*costpersquarefeet;
        return constructionCost;
    }
}