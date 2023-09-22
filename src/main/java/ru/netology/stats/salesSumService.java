package ru.netology.stats;

public class salesSumService {

public int salesSum(long [] sales){
    int sum = 0;
    for (long days : sales){
        sum += days;
    }
    return sum;
    }
}
