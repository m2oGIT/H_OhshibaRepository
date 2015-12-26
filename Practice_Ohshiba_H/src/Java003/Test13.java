
package Java003;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author （作成者：大柴仁志） <br />
 *         （クラス論理名：Java基礎 問3） <br />
 *         （説明：以下を表示させるコードを作成する。(ループを使用すること) <br />
 *         　　　　* <br />
 *         　　　　** <br />
 *         　　　　*** <br />
 *         　　　　・ <br />
 *         　　　　・ <br />
 *         　　　　・ <br />
 *         　　　　**********） <br />
 *         更新履歴 2015/12/26 （更新者：大柴仁志）：（説明：新規作成） <br />
 */
class Test13 {
  /**
   * （メソッド論理名：メイン） <br />
   * （説明：以下を表示させる <br />
   * 　　　　* <br />
   * 　　　　** <br />
   * 　　　　*** <br />
   * 　　　　・ <br />
   * 　　　　・ <br />
   * 　　　　・ <br />
   * 　　　　**********） <br />
   * 
   * @param args 起動時引数
   */
  public static void main( String[] args ) {
    // 表示処理を10回繰り返す
    for ( int i = 1; i <= 10; i++ ) {
      // 行数に応じてアスタリスクを複数表示する
      for ( int j = 1; j <= i; j++ ) {
        System.out.print( "*" );
      }
      // アスタリスク表示を改行
      System.out.println();
    }
  }

}
