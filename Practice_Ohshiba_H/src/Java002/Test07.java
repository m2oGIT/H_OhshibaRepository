
package Java002;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author （作成者：大柴仁志） <br />
 *         （クラス論理名：Java基礎 問1） <br />
 *         （説明：1から100までの数値をループで回して、加算するコードを作成する。） <br />
 *         更新履歴 2015/11/29 （更新者：大柴仁志）：（説明：新規作成） <br />
 */
class Test07 {
  /**
   * （メソッド論理名：メイン） <br />
   * （説明：1から100までの加算した累計をコンソールに表示する） <br />
   * 
   * @param args 起動時引数
   */
  public static void main( String[] args ) {
    int sum = 0;

    for ( int i = 1; i <= 100; i++ ) {
      sum += i;
    }

    System.out.println( "合計は" + sum + "です" );
  }

  /**
   * （メソッド論理名：累計処理） <br />
   * （説明：渡された2種類の整数の間の数を全て合計して返す） <br />
   * 
   * @param min 累計処理の開始値
   * @param max 累計処理の終了値
   * @return 上記の整数の間の数の全て合計した値
   */
  public static int ruikei( int min, int max ) {
    int sum = 0;

    for ( int i = min; i <= max; i++ ) {
      sum += i;
    }

    return sum;
  }
}
