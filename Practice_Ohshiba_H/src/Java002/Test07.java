
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
    // 累計値を初期化
    int sum = 0;

    // 累計値に1から100まで加算
    for ( int i = 1; i <= 100; i++ ) {
      sum += i;
    }

    // 累計値をコンソールに表示
    System.out.println( "合計は" + sum + "です" );
  }

  /**
   * （メソッド論理名：累計処理） <br />
   * （説明：渡された2種類の整数の間の数を全て合計して返す） <br />
   * 
   * @param param1 累計処理の開始値（または終了値）
   * @param param2 累計処理の終了値（または開始値）
   * @return 上記の整数の間の数の全て合計した値
   */
  public static int ruikei( int param1, int param2 ) {
    // 累計値を初期化
    int sum = 0;
    // 開始値の定義
    int min;
    // 終了値の定義
    int max;

    // 引数を比較した結果に応じて、開始値および終了値の設定
    if ( param1 < param2 ) {
      min = param1;
      max = param2;
    } else {
      min = param2;
      max = param1;
    }

    // 累計値に開始値から終了値まで加算
    for ( int i = min; i <= max; i++ ) {
      sum += i;
    }

    // 累計値を返す
    return sum;
  }
}
