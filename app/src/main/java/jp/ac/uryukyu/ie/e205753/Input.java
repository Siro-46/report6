package jp.ac.uryukyu.ie.e205753;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 入力を受け付けるメソッドをまとめたクラス。
 */
public class Input {
    Scanner scanner = new Scanner(System.in);
    /**
     * String型の入力を受け付けるメソッド。
     * @return　入力したString型
     */
    public String inputStr(){
        String selectStr = scanner.next();
        return selectStr;
    }

    /**
     * int型の入力を受け付けるメソッド。intではない入力をした場合、再入力を促す。
     * @return 入力したint型
     */
    public int inputInt(){
        boolean roop = true;
        int selectInt = 0;
        while(roop){
            try{
                selectInt = scanner.nextInt();
                roop = !roop;
            } catch(InputMismatchException e){
                scanner.nextLine();
                System.out.println("入力が数字ではありません。再入力してください。");
            }
        }
        return selectInt;
    }

}
