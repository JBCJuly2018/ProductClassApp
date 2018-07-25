public class Product {

    private String code; // default: null
    private String description;
    private double price; // default: 0.0

    public Product() {
        code = "NEW CODE";
        description = "NEW DESCRIPTION";
        price = 0.01;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    private String getFormattedPrice(double unformattedPrice) {
        // Use the NumberFormat class to format the price to 2 decimal places
        String formattedData = String.format("%.02f", unformattedPrice);
        return formattedData;
    }
}
