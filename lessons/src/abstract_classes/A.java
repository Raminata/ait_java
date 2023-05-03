package abstract_classes;

public final class A {
    //использование final:
    /**
     * 1. использование final в методе запрешает overriding метода в subclasses
     * классах
     * 2. использование final в названии класса запрещает наследование этого класса
     * а также overriding его метода
     * 3. использование final с переменной приводит к созданию константыб значение
     * этой переменной нельзя изменить в последующем коде
     */
    final int ABC = 2;


final void method(){
   // ABC = 3; нельзя
    System.out.println("This is final method");
}
}
