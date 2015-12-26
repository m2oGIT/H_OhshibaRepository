
package Java003;

import java.math.BigDecimal;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author （作成者：大柴仁志） <br />
 *         （クラス論理名：Java基礎 問1） <br />
 *         （説明：0.1を10回足した後、10倍にした結果を表示させるコードを作成する。 <br />
 *         　　　　ただし、結果が10.0となるように。） <br />
 *         更新履歴 2015/12/26 （更新者：大柴仁志）：（説明：新規作成） <br />
 */
class Test11 {
  /**
   * （メソッド論理名：メイン） <br />
   * （説明：0.1を10回足した後、10倍にした結果を10.0と表示する。） <br />
   * 
   * @param args 起動時引数
   */
  public static void main( String[] args ) {
    // 累計値を初期化
    BigDecimal bd1 = new BigDecimal( "0.1" );
    BigDecimal bd2 = new BigDecimal( "10.0" );
    BigDecimal sum = new BigDecimal( "0.0" );

    // 累計値に0.1を10回加算
    for ( int i = 1; i <= 10; i++ ) {
      sum = sum.add( bd1 );
    }

    // 累計値を10倍にする
    sum = sum.multiply( bd2 );

    // 累計値の小数点第二位以下を切り捨て
    sum = sum.setScale( 1, BigDecimal.ROUND_DOWN );

    // 累計値をコンソールに表示
    System.out.println( "合計は" + sum + "です" );
  }

}
