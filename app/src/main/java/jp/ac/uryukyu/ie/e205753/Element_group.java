package jp.ac.uryukyu.ie.e205753;
import java.util.ArrayList;

/**
 * 原子を出題グループごとに保存するクラス。
 */

public class Element_group {

    private ArrayList<Element> elements1_10 = new ArrayList<>(); //原子番号1~10までの原子を保存する
    private ArrayList<Element> elements11_20 = new ArrayList<>(); //11~20
    private ArrayList<Element> elements21_30 = new ArrayList<>(); //21~30

    private ArrayList<Element> allElements = new ArrayList<>(); //全てのリストを統合したリスト


    /**
     * elements1_10のリストに追加するメソッド。
     * @param element 追加する原子
     */
    public void addElement1_10(Element element){
        elements1_10.add(element);
    }

    /**
     * elements11_20のリストに追加するメソッド。
     * @param element 追加する原子
     */
    public void addElement11_20(Element element){
        elements11_20.add(element);
    }

    /**
     * elements21_30に追加するメソッド。
     * @param element 追加する原子
     */
    public void addElement21_30(Element element){
        elements21_30.add(element);
    }

    /**
     * allElementsに要素を追加するメソッド。
     * @param elementsList 追加する原子リスト
     */
    public void addAllElements(ArrayList<Element> elementsList){
        for(Element i : elementsList){
            allElements.add(i);
        }
    }

    /**
     *  getterメソッド。
     * @return elements1_10
     */
    public ArrayList<Element> getArray1_10(){ return elements1_10; }

    /**
     *  getterメソッド。
     * @return elements11_20
     */
    public ArrayList<Element> getArray11_20(){ return elements11_20; }

    /**
     *  getterメソッド。
     * @return elements21_30
     */
    public ArrayList<Element> getArray21_30(){ return elements21_30; }

    /**
     *  getterメソッド。
     * @return allElements
     */
    public ArrayList<Element> getArrayAll(){ return allElements; }
}
