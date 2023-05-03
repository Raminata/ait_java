package inheritance;

public class Main {
    public static void main(String[] args) {
        /**
         * Наследование
         * наследование в Джава это механизм организации и переиспользования при котором подкласс
         * наследует св-ва и методы родительского класса
         *
         *Родительский уласс также может наз-ся базовым классом или Супер классом
         * ро отношению к дочернему классу (base class or super class)
         *
         * Дочерний класс также может наз-ся (sub class or child class)
         *
         * указание на то, что класс яв-ся дочерним яв-ся слово extends, за которым
         * следует наз-ние род-го класса
         *
         * такой вид связи наз-ся "IS-A" JavaTeacher IS A teacher
         */
        Boy jack = new Boy();
         jack.height = 140;
        System.out.println(jack.getHeight());

        //проверить принадлежность обьекта к классу или к родительскому классу
        // можно с помощью метода instanceOf, который возвращает true если да

        System.out.println(jack instanceof Person);

        Person person = new Person();
        System.out.println(person instanceof Boy);

        //Виды наследования в Джава
        /**
         * 1. Single inheritance - одиночное
         * class A{}
         * class B extends A{}
         *
         * 2. Multilevel Inheritance - многоуровневое наследование
         * class A{}
         * class B extends A{}
         * class C extends B{}
         *
         * 3. Hierarchical Inheritance - иерархическое
         * class A{}
         * class B extends A{}
         * class B extends A{}
         * class C extends A{}
         *
         * 4. Hybrid - гибридное
         * сlass A{}
         * class B extends A{}
         * class С extends A{}
         * class D extends C{}
         *
         * Один дочерний класс не может иметь несколько родительских классов.
         * Java does not support multiple inheritance
         *
         *
         * Модификаторы доступа:
         * Public - видны везде в программе
         * Private - видны только в своем классе
         * Default - видны только в пакете, в котором нах-ся данный класс
         * Protected - видны в пакете, в котором нах-ся данный класс любым
         * классам, а также видны классам наследникам, нах-ся в других пакетах
         * Protected Access Modifier - модификатор доступа Protected
         *
         * Дочерний класс может наследовать только те переменные и методы род-го
         * класса, которые яв-ся public or protected. К Private члениы класса
         * можно получить доступ через использование в род-ом классе public or
         * protected getter & setter
         *
         * Использование конструктора при наследовании
         *
         *    При создании обьекта дочернего класса вызывается конструктор
         *    этого класса, но в нем по умолчанию вначале вызывается кон-тор
         *    родительского класса
         *
         *    Если в родительском классе существует конструктор с параметрами,
         *    мы можем вызвать из дочернего класса конструктор родительского
         *    класса  через слово super c соответствующими параметрами в
         *    скобках
         *
         *     Нужно иметь в виду, что вызов родительского конструктора
         *     должен быть первым в дочернем super()
         */
    }
}