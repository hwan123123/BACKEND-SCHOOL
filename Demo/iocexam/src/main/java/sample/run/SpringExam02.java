package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.bean.Game;
import sample.config.GameConfig;

public class SpringExam02 {
    public static void main(String[] args) {
        System.out.println("공장 생성 전");
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
        System.out.println("공장 생성 후");

        Game game = context.getBean(Game.class);
        game.play();
    }
}
