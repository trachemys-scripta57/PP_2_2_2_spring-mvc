package web.model;

public class Car {
    private int article;
    private String carBrand;
    private String carBody;

    public Car() {}

    public Car(int article, String carBrand, String carBody) {
        this.article = article;
        this.carBrand = carBrand;
        this.carBody = carBody;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    @Override
    public String toString() {
        return "Car{" +
                "article=" + article +
                ", carBrand='" + carBrand + '\'' +
                ", carBody='" + carBody + '\'' +
                '}';
    }
}
