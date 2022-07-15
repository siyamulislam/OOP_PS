package Chapter_4;

class Height {

    public double getRecommendedWeight(double age, double height) {
        double recomdWeight = 0;
        recomdWeight = (height - 100 + (age / 10)) * 0.90;
        return recomdWeight;
    }
}
