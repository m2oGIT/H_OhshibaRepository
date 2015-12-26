
package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author （作成者：大柴仁志） <br />
 *         （クラス論理名：Java基礎 問2） <br />
 *         （説明：実行した日時を以下の形式で表示させるコードを作成する。 <br />
 *         　　　　"実行日時はyyyy/MM/dd HH:mm:ssです。"） <br />
 *         更新履歴 2015/12/26 （更新者：大柴仁志）：（説明：新規作成） <br />
 */
class Test12 {
  /**
   * （メソッド論理名：メイン） <br />
   * （説明：実行した日時を以下の形式で表示させる。 <br />
   * 　　　　"実行日時はyyyy/MM/dd HH:mm:ssです。"） <br />
   * 
   * @param args 起動時引数
   */
  public static void main( String[] args ) {
    // 現在日時（マシン日付）の取得
    Date date = new Date();
    // 日時の書式定義
    SimpleDateFormat sdf = new SimpleDateFormat( "実行日時はyyyy/MM/dd HH:mm:ssです。" );

    // 現在日時（マシン日付）を指定書式で編集
    String formatedDate = sdf.format( date );

    // 日時をコンソールに表示
    System.out.println( formatedDate );
  }

}
