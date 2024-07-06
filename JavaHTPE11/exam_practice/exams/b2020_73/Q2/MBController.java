package JavaHTPE11.exam_practice.exams.b2020_73.Q2;
//
//import javafx.fxml.FXML;
//import javafx.scene.canvas.Canvas;
//import javafx.scene.canvas.GraphicsContext;
//
//import java.util.ArrayList;
//import java.util.Random;
//
//
//public class MBController {
//
//    @FXML
//    private Canvas canv;
//
//    private GraphicsContext gc;
//    private ArrayList<Shape> arr;
//
//    public void initialize() {
//        gc = canv.getGraphicsContext2D();
//        arr = new ArrayList<>();
//
//        // Add random XShape and Triangle to the array
//        Random rand = new Random();
//        for (int i = 0; i < 5; i++) {
//            int x = rand.nextInt((int) canv.getWidth() - 50);
//            int y = rand.nextInt((int) canv.getHeight() - 50);
//            int size = 20 + rand.nextInt(30); // Random size between 20 and 50
//
//            try {
//                arr.add(new XShape(x, y, size));
//            } catch (InvalidException e) {
//                e.printStackTrace();
//            }
//
//            x = rand.nextInt((int) canv.getWidth() - 50);
//            y = rand.nextInt((int) canv.getHeight() - 50);
//            size = 20 + rand.nextInt(30); // Random size between 20 and 50
//
//            try {
//                arr.add(new Triangle(x, y, size));
//            } catch (InvalidException e) {
//                e.printStackTrace();
//            }
//        }
//
//        paintComponent();
//    }
//
//    public void paintComponent() {
//        gc.clearRect(0,0,canv.getWidth(),canv.getHeight());
//        for(Shape s: arr){
//            try {
//                s.draw(gc);
//            }
//            catch(InvalidException e){
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void add(Shape s){
//        arr.add(s);
//        paintComponent();
//    }
//
//    public void remove(Shape s){
//        boolean found = false;
//        for(Shape item: arr){
//            if(item.equals(s)){
//                found = true;
//                arr.remove(s);
//            }
//        }
//
//        if(found)
//            paintComponent();
//    }
//
//}