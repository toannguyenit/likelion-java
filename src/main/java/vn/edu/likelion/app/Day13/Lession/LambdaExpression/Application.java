package vn.edu.likelion.app.Day13.Lession.LambdaExpression;

import java.util.function.Function;

public class Application {

    public static void main(String[] args) {
//        BaseImpl baseImpl = new BaseImpl();
//
//        baseImpl.sayHello();

        BaseInterface baseInterface = ()-> {
            System.out.println("Hello World");
        };
        baseInterface.sayHello();

        Function<String, Integer> function = new Function<>() {

            @Override
            public Integer apply(String s) {
                return 0;
            }
        };

        Function<String, Integer> function2 = (str)->Integer.parseInt(str);
        System.out.println(function2.apply("123"));

    }


}
