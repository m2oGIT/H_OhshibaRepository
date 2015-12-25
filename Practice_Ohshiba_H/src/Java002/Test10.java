
package Java002;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author （作成者：大柴仁志） <br />
 *         （クラス論理名：Java基礎 問5） <br />
 *         （説明：問1の機能をTest07内でメソッド化し、 <br />
 *         「渡された2種類の整数の間の数を全て合計して返す」というメソッドに改良。 <br />
 *         これをTest10.javaのmainメソッドから呼び出す。） <br />
 *         更新履歴 2015/11/29 （更新者：大柴仁志）：（説明：新規作成） <br />
 */
class Test10 {
  /**
   * （メソッド論理名：メイン） <br />
   * （説明：1から1000までの加算した累計をコンソールに表示する） <br />
   * 
   * @param args 起動時引数
   */
  public static void main( String[] args ) {
    // 累計の開始値を設定
    int min = 1;
    // 累計の終了値を設定
    int max = 1000;
    // 累計値の定義
    String total;

    // 累計処理の結果を文字列に変換して、累計値に設定
    total = String.valueOf( Test07.ruikei( min, max ) );

    // 累計値をコンソールに表示
    System.out.println( "合計は" + total + "です" );

    // 累計の終了値を再設定
    max = 100;
    // 引数を入れ換えて累計処理を行い、その結果を文字列に変換して累計値に設定
    total = String.valueOf( Test07.ruikei( max, min ) );

    // 累計値をコンソールに表示
    System.out.println( "２回目の合計は" + total + "です" );
  }
}
