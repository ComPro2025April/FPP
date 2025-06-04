package lab6.prog6_2;

import java.awt.*;

public class prog6_2 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                StringUtility st = new StringUtility();
                st.setVisible(true);
            }
        });
    }
}
