// Продемонстрировать срок действия переменной
public class LifeTime {
    public static void main(String args[]){
        int x;

        for (x = 0; x < 3; x++){
            int y = -1; // переменная у инициализируется
                        // при каждом вхождении в блок кода
            System.out.println("у равно: " + y); // здесь всегда
                                                // выводится -1
            y = 1000;
            System.out.println("Теперь у равно: " + y);
        }
    }
}
