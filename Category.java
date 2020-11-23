public class Category {
    private String nameCategory;

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

   @Override
    public String toString() {
        return "Category{" + "nameCategory: " + nameCategory + '}';
    }


}
