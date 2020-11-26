/** Класс модель - категорий блюд со свойством <b>name</b>.
 */
public class Category {
    /** Поле название категории */
    private String nameCategory;

    /**
     * Конструктор - создание нового объекта категории с определенными значениями
     * @param nameCategory - имя категории
     */
    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }
    /**
     * Функция получения значения поля имя категории
     * @return возвращает название категории
     */
    public String getNameCategory() {
        return nameCategory;
    }
    /**
     * Процедура определения категории
     * @param nameCategory - название категории
     */
    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    /**
     * Метод для получения строкового объект
     * @return строку описывающую категорию
     */
   @Override
    public String toString() {
        return "Category{" + "nameCategory: " + nameCategory + '}';
    }


}
