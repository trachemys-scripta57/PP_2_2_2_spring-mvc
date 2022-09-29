package web.model;

public class Car {
    private int article;
    private String carBrand;
    private String carBody;

    public Car(int article, String carBrand, String carBody) {
        this.article = article;
        this.carBrand = carBrand;
        this.carBody = carBody;
    }

    public int getArticle() { //используется в представлении
        return article;
    }

    public String getCarBrand() { //используется в представлении
        return carBrand;
    }

    public String getCarBody() { //используется в представлении
        return carBody;
    }
}
