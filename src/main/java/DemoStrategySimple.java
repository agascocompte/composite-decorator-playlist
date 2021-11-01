import strategy_simple.ClassifierKmeans;
import strategy_simple.ClassifierKnn;
import strategy_simple.ClassifierSOM;
import strategy_simple.ContextSimple;

public class DemoStrategySimple {

    public static void main(String[] args) {
        System.out.println("--- KNN ---");
        ContextSimple context = new ContextSimple(new ClassifierKnn());
        context.run();

        System.out.println("--- K-means ---");
        context.setClassifierStrategy(new ClassifierKmeans());
        context.run();

        System.out.println("--- SOM ---");
        context.setClassifierStrategy(new ClassifierSOM());
        context.run();
    }
}
