package lec13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Менеджер GridBagLayout для вікна Frame
 */
public class Ex5_1 {
    public static void main(String[] args) {

        //Внутрішній клас методу
        class GridBagLayoutDemo extends Frame {

            //Конструктор
            public GridBagLayoutDemo(String title) {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                GridBagLayout gbl = new GridBagLayout();// створюємо менеджер
                setLayout(gbl);// встанавллюємо його в контейнер
                GridBagConstraints c = new GridBagConstraints();// задаєм правила розташування за замовчуванням

                Button b1 = new Button("Button 1");// створюємо компонент
                c.gridx  = 0;// змінюємо правила розташування
                c.gridy =0;
                add(b1, c);// додаєм в контейнер


                Button b2 = new Button("Button 2"); // створюємо наступний компонент
                c.gridx  = 1;// змінюємо правила розташування
                c.gridy =1;
                add(b2, c); // додаєм в контейнер

                setVisible(true);//візуалізація форми

                //Обробник для закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }
        }

        //Сценарій роботи
        new GridBagLayoutDemo("GridBagLayoutDemo");
    }
}
