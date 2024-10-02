package lecture03.temperature;

import javax.swing.*;

public class View {
    double getTemperature() {
        String input =JOptionPane.showInputDialog(null,"섭씨 온도를 입력해주세요.");
        int i=Integer.parseInt(input);
        return i;
    }

    void showTemperature(double c, double f) {
        System.out.println("섭씨 " + c + "도를 화씨로 바꾸면 " + f + "도입니다.");
    }
}
