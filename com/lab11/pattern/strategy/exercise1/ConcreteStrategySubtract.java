package com.lab11.pattern.strategy.exercise1;

public class ConcreteStrategySubtract implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
