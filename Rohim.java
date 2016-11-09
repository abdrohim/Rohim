/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rohim;

/**
 *
 * @author TOSHIBA
 */
public class Rohim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instance
        Tumbuhan tb=new Tumbuhan();
        
        System.out.println(tb.dikotil());
        System.out.println(tb.monokotil());
    }
}
    class Tumbuhan {
        public String dikotil (){
            return"tomat,bunga matahari,pete";
        }
            public String monokotil (){
                return"kunyit,kelapa,jahe";
            }
        }
    }

