package jp.ac.uryukyu.ie.e205753;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 質問のクラス。
 */
public class Question {
    Input i = new Input();

    /**
     *  引数の値の範囲でランダムに数字を返すメソッド。
     * @param e ランダムに選ぶ範囲
     * @return 範囲内のランダムな数字
     */
    public int random(int e){
        Random random = new Random();
        int randomValue = random.nextInt(e);
        return randomValue;
    }

    /**
     * 起動するメソッド。0を入力すると始まり、1を入力すると終了するようにする。
     * @param list 出題するリスト
     */
    public void start(ArrayList<Element> list){
        System.out.println("選択してください。(半角で入力)");
        System.out.println(0 + ":始める");
        System.out.println("0以外の数字:終わる");
        int selectInt = i.inputInt();

        if(selectInt == 0){
            quiz(list); 
        }else{ System.exit(0); }
    }

    /**
     *  startメソッドから動かすクイズメソッド。startから引数を受け継ぐ。
     * @param list 出題するリスト
     */
    public void quiz(ArrayList<Element> list){
        List<Integer> intList = new ArrayList<>();

        while(true){
            int number = random(list.size());

            if(!intList.contains(number)){
                intList.add(number);
                while(true){
                    System.out.println("次の性質をもつ元素を、化学式で入力してください。（例　水素の場合）H2");
                    System.out.println("終了する場合は、exsitと入力してください。");
                    System.out.println("原子番号" + list.get(number).getNumber());
                    System.out.println(list.get(number).getExplain());
                    String answer = i.inputStr();
                    String Answer = list.get(number).getName();

                    if(answer.equals("exsit")){ System.exit(0); }

                    if(answer.equals(Answer)){
                        System.out.println("正解！\n");
                        break;
                    }else{
                        System.out.println("残念、間違いです。再入力してください。");
                    }
                }
            }

            if(intList.size() == list.size()){ break; }
        }
    }
}