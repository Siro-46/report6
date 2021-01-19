package jp.ac.uryukyu.ie.e205753;

/**
 * Element_groupで作ったリストに値を入れていくクラス。
 * Element_groupを継承し、ここから表の出力等を行えるようにする。
 */
public class CreateList extends Element_group {

    /**
     * コンストラクタ。ここで、リストの内容を作る。
     */
    CreateList(){
        //とりあえず原子番号1~10、11、21まで作成
        addElement1_10(new Element("H2", 1, "最も密度が小さく、酸素と反応し燃焼する。"));
        addElement1_10(new Element("He", 2, "希ガス。２番目に密度が小さく、安全な浮遊性ガスとして利用されている。"));
        addElement1_10(new Element("Li", 3, "アルカリ金属。炎色反応は赤を示す。水と激しく反応する。石油に保存。"));
        addElement1_10(new Element("Be", 4, "アルカリ土類金属。硝酸塩、硫酸塩は水に溶ける。"));
        addElement1_10(new Element("B", 5, "融点2300、沸点3658、密度2.34。害虫駆除に使用されることもある。"));
        addElement1_10(new Element("C", 6, "同素体として黒鉛、フラーレン、カーボンナノチューブ、グラフェンなどがある。"));
        addElement1_10(new Element("N2", 7, "工業的には液体空気を分留することで得る。酸化物にアンモニア、硝酸などがある。"));
        addElement1_10(new Element("O2", 8, "工業的には液体空気を分留することで得る。同素体としてオゾンがある。"));
        addElement1_10(new Element("F2", 9, "ハロゲンでその中でも酸化力が最も強い。蛍石から得られる。"));
        addElement1_10(new Element("Ne", 10, "希ガス。低い圧力で放電すると、赤色に発光する。"));

        addElement11_20(new Element("Na", 11, "アルカリ金属。炎色反応は黄を示す。石油に保存。空気中に放置すると潮解し、CO2を吸収する化合物がある。"));

        addElement21_30(new Element("K", 21, "アルカリ金属。炎色反応は赤紫を示す。石油に保存。"));

        addAllElements(getArray1_10());
        addAllElements(getArray11_20());
        addAllElements(getArray21_30());
    }
}
