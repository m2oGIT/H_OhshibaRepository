
package Java001;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author （作成者：大柴仁志） <br />
 *         （クラス論理名：Java基礎 問4） <br />
 *         （説明：複数の文字列を起動時引数に渡して、コンソールに表示させる<br />
 *         更新履歴 2015/11/22 （更新者：大柴仁志）：（説明：新規作成） <br />
 */
public class Test05 {

  /**
   * （メソッド論理名：メイン） <br />
   * （説明：起動時引数で与えた任意の文字列をコンソールに表示する） <br />
   * 
   * @param args 起動時引数
   */
  public static void main( String[] args ) {
    System.out.println( args[0] );
    System.out.println( args[1] );
    System.out.println( args[2] );
  }

}
