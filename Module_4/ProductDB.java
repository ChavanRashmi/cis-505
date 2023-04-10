package Module_4;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ProductDB {

    public static GenericQueue getProduct(String code) {

        if (code.equalsIgnoreCase("b")) {
            GenericQueue<Product> balls = new GenericQueue();
            Ball ball_1 = new Ball();
            ball_1.setCode("B100");
            ball_1.setDescription("Ball 1 description");
            ball_1.setPrice(123.22);
            ball_1.setColor("RED");
            Ball ball_2 = new Ball();
            ball_2.setCode("B200");
            ball_2.setDescription("Ball 2 description");
            ball_2.setPrice(124.22);
            ball_2.setColor("PINK");
            Ball ball_3 = new Ball();
            ball_3.setCode("B300");
            ball_3.setDescription("Ball 3 description");
            ball_3.setPrice(125.22);
            ball_3.setColor("GREEN");
            Ball ball_4 = new Ball();
            ball_4.setCode("B400");
            ball_4.setDescription("Ball 4 description");
            ball_4.setPrice(124.22);
            ball_4.setColor("WHITE");
            Ball ball_5 = new Ball();
            ball_5.setCode("B500");
            ball_5.setDescription("Ball 5 description");
            ball_5.setPrice(123.22);
            ball_5.setColor("ORANGE");
            balls.enqueue(ball_1);
            balls.enqueue(ball_2);
            balls.enqueue(ball_3);
            balls.enqueue(ball_4);
            balls.enqueue(ball_5);
            return balls;
        } else if (code.equalsIgnoreCase("s")) {
            GenericQueue<Product> shoes = new GenericQueue();
            Shoe shoe_1 = new Shoe();
            shoe_1.setCode("S101");
            shoe_1.setDescription("Shoes 1 description");
            shoe_1.setPrice(123.22);
            shoe_1.setSize(6.1);
            Shoe shoe_2 = new Shoe();
            shoe_2.setCode("S201");
            shoe_2.setDescription("Shoes 2 description");
            shoe_2.setPrice(123.22);
            shoe_2.setSize(7.1);
            Shoe shoe_3 = new Shoe();
            shoe_3.setCode("S301");
            shoe_3.setDescription("Shoes 3 description");
            shoe_3.setPrice(123.22);
            shoe_3.setSize(6.1);
            Shoe shoe_4 = new Shoe();
            shoe_4.setCode("S401");
            shoe_4.setDescription("Shoes 4 description");
            shoe_4.setPrice(123.22);
            shoe_4.setSize(6.1);
            Shoe shoe_5 = new Shoe();
            shoe_5.setCode("S501");
            shoe_5.setDescription("Shoes 5 description");
            shoe_5.setPrice(123.22);
            shoe_5.setSize(5.1);
            shoes.enqueue(shoe_1);
            shoes.enqueue(shoe_2);
            shoes.enqueue(shoe_3);
            shoes.enqueue(shoe_4);
            shoes.enqueue(shoe_5);
            return shoes;
        } else if (code.equalsIgnoreCase("a")) {
            GenericQueue<Product> shoes = new GenericQueue();
            Shoe shoe_1 = new Shoe();
            shoe_1.setCode("S101");
            shoe_1.setDescription("Shoes 1 description");
            shoe_1.setPrice(123.22);
            shoe_1.setSize(6.1);
            Shoe shoe_2 = new Shoe();
            shoe_2.setCode("S201");
            shoe_2.setDescription("Shoes 2 description");
            shoe_2.setPrice(123.22);
            shoe_2.setSize(7.1);
            Shoe shoe_3 = new Shoe();
            shoe_3.setCode("S301");
            shoe_3.setDescription("Shoes 3 description");
            shoe_3.setPrice(123.22);
            shoe_3.setSize(6.1);
            shoes.enqueue(shoe_1);
            shoes.enqueue(shoe_2);
            shoes.enqueue(shoe_3);
            return shoes;
        } else {
            return new GenericQueue();
        }

    }
}
