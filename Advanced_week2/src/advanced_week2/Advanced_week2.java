/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced_week2;

/**
 *
 * @author leung
 */
public class Advanced_week2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int length = (int)(Math.random() *100 + 1);
        Shape[] shapes = new Shape[length];
        MakeShape ms = new MakeShape();
        for(int n = 0; n <length; n++){
            int ran = (int)(Math.random() *100 + 1);
            if(ran % 2 ==0){
                shapes[n] = ms.makeRactangle((Math.random() *100 + 1),(Math.random() *100 + 1),
                        new Point((int)(Math.random() *100 + 1),(int)(Math.random() *100 + 1)));
            }else{
                shapes[n] = ms.makeCircle((Math.random() *100 + 1), 
                new Point((int)(Math.random() *100 + 1),(int)(Math.random() *100 + 1)));
            }
        }
        
        for(int i = 0; i<length;i++){
            shapes[i].toString();
        }
        
    }
    
}
