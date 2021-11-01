import strategy_double.*;

public class DemoStrategyDouble {

    public static void main(String[] args) {
        Distance distanceEuclidean = new DistanceEuclidean();

        System.out.println("--- KNN with Euclidean Distance ---");
        Context context = new Context(new ClassifierKnn(), distanceEuclidean);
        context.run();

        System.out.println("--- KNN with Manhattan Distance ---");
        context.setDistanceStrategy(new DistanceManhattan());
        context.run();

        System.out.println("--- K-means with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierKmeans());
        context.run();

        System.out.println("--- SOM  with Euclidean distance ---");
        context.setDistanceStrategy(distanceEuclidean);
        context.setClassifierStrategy(new ClassifierSOM());
        context.run();
    }
}
