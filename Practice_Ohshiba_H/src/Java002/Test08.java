
package Java002;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author （作成者：大柴仁志） <br />
 *         （クラス論理名：Java基礎 問2） <br />
 *         （説明：問1を元に、奇数の時のみ加算させる。） <br />
 *         更新履歴 2015/11/29 （更新者：大柴仁志）：（説明：新規作成） <br />
 */
class Test08 {
  /**
   * （メソッド論理名：メイン） <br />
   * （説明：1から100までのうち奇数のみ加算した累計をコンソールに表示する） <br />
   * 
   * @param args 起動時引数
   */
  public static void main( String[] args ) {
    // 累計値を初期化
    int sum = 0;

    // 累計値に1から100までのうち奇数のみ加算
    for ( int i = 1; i <= 100; i++ ) {
      // 奇数判定
      if ( i % 2 != 0 ) {
        sum += i;
      }

    }

    // 累計値をコンソールに表示
    System.out.println( "合計は" + sum + "です" );
  }
}
