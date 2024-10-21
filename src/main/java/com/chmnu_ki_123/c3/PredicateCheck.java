package com.chmnu_ki_123.c3;

public class PredicateCheck {
    // Ваш предикат f
    public static boolean f(double a, double b) {
        // Замість цього напишіть вашу умову
        return a < b; // Наприклад, перевірка, чи a менше за b
    }

    public static boolean checkPredicate(double[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (!f(a[i], a[i + 1])) {
                return false; // Якщо хоча б одна пара не задовольняє предикат, повертаємо false
            }
        }
        return true; // Якщо всі пари задовольняють предикат, повертаємо true
    }

    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0, 4.0}; // Приклад масиву
        boolean result = checkPredicate(array);
        System.out.println("Усі елементи масиву задовольняють предикату: " + result);
    }
}
