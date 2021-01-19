package jp.ac.uryukyu.ie.e205753;
/**
 * 原子のクラス。
 *  String name; //元素名
 *  int number; //原子番号
 *  String explain; //説明
 */

public class Element {
    private String name;
    private int number;
    private String explain;

    /**
     * コンストラクタ。原子番号と原子番号を定義する。
     * @param name 元素名
     * @param number 元素番号
     * @param explain 説明
     */
    public Element(String name, int number, String explain){
        this.name = name;
        this.number = number;
        this.explain = explain;
    }

    /**
     * 名前を得るメソッド。
     * @return name 元素名
     */
    public String getName() {
        return name;
    }

    /**
     * 元素番号を得るメソッド。
     * @return int 元素番号
     */
    public int getNumber() {
        return number;
    }
    
    /**
     * 原子の説明を得るメソッド。
     * @return String 説明
     */
    public String getExplain(){
        return explain;
    }

    /**
     * 原子の説明を出力するメソッド。問題文として出力予定。
     */
    public void explain(){
        System.out.println(explain);
    }
}
