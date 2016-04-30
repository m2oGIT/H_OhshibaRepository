/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author （作成者：大柴仁志） <br />
 *         （クラス論理名：頻出ライブラリクラスの使い方 問1） <br />
 *         （説明：コンソールから入力された複数行の文字列を溜め込み、 <br />
 *         　　　　予め定義された終了文字(end)が入力された場合に、一括で出力する処理を作成する。） <br />
 *         更新履歴 2016/4/29 （更新者：大柴仁志）：（説明：新規作成） <br />
 */
class ConsolelnTest {
  /**
   * （メソッド論理名：メイン） <br />
   * （説明：コンソールへのメッセージ表示、コンソール入力処理および一括出力処理の実行。 <br />
   * 　　　　エラーが発生した場合は、エラーメッセージを表示する。） <br />
   * 
   * @param args 起動時引数
   */
  public static void main( String[] args ) {
    // コンソールの入力文字列
    List<String> inputstr = new ArrayList<String>();
    // 文字列結合結果
    String outputstr;

    // 入力要求メッセージの表示
    System.out.println( "文字列を入力してください。" );
    System.out.println( "endの入力で終了します。" );
    System.out.println();

    // コンソール入力処理
    try {
      inputstr = inputproc();
      // 文字列結合処理
      outputstr = strproc( inputstr );

      // 結合した文字列をコンソールに表示
      System.out.println( "貯めた文字列を出力します。" + outputstr );

      // 例外処理
    } catch ( IOException e ) {
      // エラー時はメッセージを表示
      System.out.println( "異常が発生しました。処理を終了します。" );
    }
  }

  /**
   * （メソッド論理名：コンソール入力処理） <br />
   * （説明：コンソールの入力文字列をArrayListとして返す。） <br />
   * 
   * @throws IOException コンソール入力での異常
   * @return コンソールの入力文字列(ArrayList)
   */
  private static List<String> inputproc() throws IOException {
    // コンソールの入力文字列
    List<String> inputstr = new ArrayList<String>();
    // コンソールの入力終了文字列
    String breakstr = "end";

    // 入力ストリームのインスタンスを仮で生成。
    InputStreamReader input = null;

    // コンソール入力の繰り返し処理
    do {
      // コンソール入力待ち
      input = new InputStreamReader( System.in );
      // コンソールの文字型入力ストリームを作成
      BufferedReader inputbr = new BufferedReader( input );
      // コンソール入力の1行を読み込み
      String inputline = inputbr.readLine();
      // 終了文字列の場合は繰り返し処理を抜ける
      if ( inputline.equals( breakstr ) ) {
        break;
      }
      // コンソール入力をArrayListにセット
      inputstr.add( inputline );
    } while ( true );

    // Streamのクローズ
    input.close();

    return inputstr;
  }

  /**
   * （メソッド論理名：文字列結合処理） <br />
   * （説明：ArrayListの文字列を結合して返す。） <br />
   * 
   * @param inputstr コンソールの入力文字列
   * @return 文字列結合結果
   */
  private static String strproc( List<String> inputstr ) {
    // 文字列の結合結果
    String outputstr = new String();

    // 配列の要素分、繰り返す
    for ( String value : inputstr ) { // 一時変数に配列の値を展開し、末尾まで繰り返すイメージ。
      outputstr += value;
    }

    return outputstr;
  }
}
