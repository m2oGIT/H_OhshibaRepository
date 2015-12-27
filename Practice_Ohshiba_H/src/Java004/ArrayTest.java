
package Java004;

import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author （作成者：大柴仁志） <br />
 *         （クラス論理名：頻出ライブラリクラスの使い方 問1および問2） <br />
 *         （説明：コンソールより、整数を5回入力させ、最大値をコンソール出力する。 <br />
 *         　　　　ただし、整数以外の入力があった場合は、エラーメッセージを表示し、処理を終了する。 <br />
 *         　　　　追加の実装として、最大値とともに、合計値、平均値も出力する。） <br />
 *         更新履歴 2015/12/27 （更新者：大柴仁志）：（説明：新規作成） <br />
 */
class ArrayTest {
  /**
   * （メソッド論理名：メイン） <br />
   * （説明：コンソールへのメッセージ表示、コンソール入力処理および計算処理の実行） <br />
   * 
   * @param args 起動時引数
   */
  public static void main( String[] args ) {
    // コンソールの入力値
    int inputint[] = new int[5];
    // 計算結果
    int result[];

    // 入力要求メッセージの表示
    System.out.println( "整数を5回入力してください。" );
    System.out.println();

    try {
      // コンソール入力処理
      inputint = inputproc();
      // 計算処理
      result = calcproc( inputint );

      // 最大値、合計値、平均値をコンソールに表示
      System.out.println( "最大値は" + result[0] );
      System.out.println( "合計値は" + result[1] );
      System.out.println( "平均値は" + result[2] );

      // 例外処理
    } catch ( Exception e ) {
      // エラー時はメッセージを表示
      System.out.println( "整数ではありません。処理を終了します。" );
    }
  }

  /**
   * （メソッド論理名：コンソール入力処理） <br />
   * （説明：コンソールの入力を整数として返す。整数にできない場合は、 <br />
   * エラーメッセージを表示してプログラムを終了する。） <br />
   * 
   * @return コンソールの入力値
   * @throws Exception コンソール入力が整数ではない。
   */
  private static int[] inputproc() throws Exception {
    // コンソールの入力値
    int inputint[] = new int[5];

    // 入力ストリームのインスタンスを仮で生成。
    InputStreamReader input = null;
    // コンソール入力受付処理
    // try {
    // コンソール入力の5回繰り返し処理
    for ( int i = 0; i < 5; i++ ) {
      // コンソール入力待ち
      input = new InputStreamReader( System.in );
      // コンソールの文字型入力ストリームを作成
      BufferedReader inputbr = new BufferedReader( input );
      // コンソール入力の1行を読み込み
      String inputstr = inputbr.readLine();
      // コンソール入力を整数に変換
      inputint[i] = Integer.parseInt( inputstr );
    }

    // Streamのクローズ
    input.close();

    return inputint;
  }

  /**
   * （メソッド論理名：計算処理） <br />
   * （説明：コンソールの入力値の最大値、合計値、平均値を返す。） <br />
   * 
   * @param inputint コンソールの入力値
   * @return 計算結果（最大値、合計値、平均値）
   */
  private static int[] calcproc( int inputint[] ) {
    // 計算結果（最大値、合計値、平均値）
    int result[] = new int[3];

    for ( int i = 0; i < 5; i++ ) {

      // 最大値の判定
      if ( i == 0 ) {
        result[0] = inputint[i];
      } else if ( result[0] < inputint[i] ) {
        result[0] = inputint[i];
      }

      // コンソール入力値を累計
      result[1] += inputint[i];
    }

    // 合計値から平均値を算出
    result[2] = result[1] / 5;

    return result;
  }
}
