package ru.krista.example;

public final class App {
    private App() {
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.getEquation();
        calc.doMath();
        calc.printResult();
    }
}
