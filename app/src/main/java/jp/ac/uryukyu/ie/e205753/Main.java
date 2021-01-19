package jp.ac.uryukyu.ie.e205753;

/**
 * 実際にプログラムを動かすクラス。
 */
public class Main{
    public static void main(String[] args) {
        Question main = new Question();
        CreateList subject = new CreateList();

        main.start(subject.getArrayAll());
    }
}