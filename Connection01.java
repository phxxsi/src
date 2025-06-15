// Клас Connection01, який моделює з'єднання з базою даних
public class Connection01 {

    // Модифікатор private вибрано для безпеки та інкапсуляції
    private String url;

    // Модифікатор private дозволяє контролювати доступ через методи
    private String username;

    // Модифікатор private захищає чутливі дані, наприклад пароль
    private String password;

    // Конструктор класу: дозволяє створити об'єкт із початковими значеннями
    public Connection01(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    // Геттер — метод для отримання значення змінної url
    public String getUrl() {
        return url;
    }

    // Сеттер — метод для зміни значення змінної url
    public void setUrl(String url) {
        this.url = url;
    }

    // Геттер для username
    public String getUsername() {
        return username;
    }

    // Сеттер для username
    public void setUsername(String username) {
        this.username = username;
    }

    // Геттер для password
    public String getPassword() {
        return password;
    }

    // Сеттер для password
    public void setPassword(String password) {
        this.password = password;
    }
}
