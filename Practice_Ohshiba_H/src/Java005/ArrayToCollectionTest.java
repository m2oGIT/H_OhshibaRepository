/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java005;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author �i�쐬�ҁF��Đm�u�j <br />
 *         �i�N���X�_�����F�p�o���C�u�����N���X�̎g���� ��1����і�2�j <br />
 *         �i�����F�uJava004�v�̖�1�̏������AArrayList���g�p���邱�ƂŁA�������ĉ������B <br />
 *         �@�@�@�@�ǉ��̎����Ƃ��āA�ő�l�ƂƂ��ɁA���v�l�A���ϒl���o�͂���B�j <br />
 *         �X�V���� 2015/12/30 �i�X�V�ҁF��Đm�u�j�F�i�����F�V�K�쐬�j <br />
 */
class ArrayToCollectionTest {
  /**
   * �i���\�b�h�_�����F���C���j <br />
   * �i�����F�R���\�[���ւ̃��b�Z�[�W�\���A�R���\�[�����͏�������ьv�Z�����̎��s�j <br />
   * 
   * @param args �N��������
   * @throws Exception �R���\�[�����͂������ł͂Ȃ��B
   */
  public static void main( String[] args ) throws Exception {
    // �R���\�[���̓��͒l
    // ArrayList<Integer> inputint = new ArrayList<Integer>();
    List<Integer> inputint = new ArrayList<>();
    // int inputint[] = new int[5];
    // �v�Z����
    List<BigDecimal> result;
    // int result[];

    // ���͗v�����b�Z�[�W�̕\��
    System.out.println( "������5����͂��Ă��������B" );
    System.out.println();

    try {
      // �R���\�[�����͏���
      inputint = inputproc();
      // �v�Z����
      result = calcproc( inputint );

      // �ő�l�A���v�l�A���ϒl���R���\�[���ɕ\��
      System.out.println( "�ő�l��" + result.get( 0 ) );
      System.out.println( "���v�l��" + result.get( 1 ) );
      System.out.println( "���ϒl��" + result.get( 2 ) );
      // System.out.println( "�ő�l��" + result[0] );
      // System.out.println( "���v�l��" + result[1] );
      // System.out.println( "���ϒl��" + result[2] );

      // ��O����
    } catch ( NumberFormatException e ) {
      // �G���[���̓��b�Z�[�W��\��
      System.out.println( "�����ł͂���܂���B�������I�����܂��B" );
    } catch ( IOException e ) {
      // �G���[���̓��b�Z�[�W��\��
      System.out.println( "�ُ킪�������܂����B�������I�����܂��B" );
    }
  }

  /**
   * �i���\�b�h�_�����F�R���\�[�����͏����j <br />
   * �i�����F�R���\�[���̓��͂𐮐��Ƃ��ĕԂ��B�����ɂł��Ȃ��ꍇ�́A <br />
   * �G���[���b�Z�[�W��\�����ăv���O�������I������B�j <br />
   * 
   * @return �R���\�[���̓��͒l
   * @throws Exception �R���\�[�����͂������ł͂Ȃ��B
   */
  private static List<Integer> inputproc() throws Exception {
    // private static int[] inputproc() throws Exception {
    // �R���\�[���̓��͒l
    List<Integer> inputint = new ArrayList<Integer>();
    // int inputint[] = new int[5];

    // ���̓X�g���[���̃C���X�^���X�����Ő����B
    InputStreamReader input = null;
    // �R���\�[�����͎�t����
    // try {
    // �R���\�[�����͂�5��J��Ԃ�����
    for ( int i = 0; i < 5; i++ ) {
      // �R���\�[�����͑҂�
      input = new InputStreamReader( System.in );
      // �R���\�[���̕����^���̓X�g���[�����쐬
      BufferedReader inputbr = new BufferedReader( input );
      // �R���\�[�����͂�1�s��ǂݍ���
      String inputstr = inputbr.readLine();
      // �R���\�[�����͂𐮐��ɕϊ�
      inputint.add( new Integer( inputstr ) );
      // inputint[i] = Integer.parseInt( inputstr );
    }

    // Stream�̃N���[�Y
    input.close();

    return inputint;
  }

  /**
   * �i���\�b�h�_�����F�v�Z�����j <br />
   * �i�����F�R���\�[���̓��͒l�̍ő�l�A���v�l�A���ϒl��Ԃ��B�j <br />
   * 
   * @param inputint �R���\�[���̓��͒l
   * @return �v�Z���ʁi�ő�l�A���v�l�A���ϒl�j
   * @throws Exception �R���\�[�����͂������ł͂Ȃ��B
   */
  private static List<BigDecimal> calcproc( List<Integer> inputint ) throws Exception {
    // private static int[] calcproc( int inputint[] ) {
    // �v�Z���ʁi�ő�l�A���v�l�A���ϒl�j
    List<BigDecimal> result = new ArrayList<BigDecimal>();
    // int result[] = new int[3];

    for ( int i = 0; i < inputint.size(); i++ ) {
      // for ( int i = 0; i < 5; i++ ) {

      // �ő�l�̔���
      if ( i == 0 ) {
        result.add( BigDecimal.valueOf( inputint.get( i ) ) );
        // result[0] = inputint[i];
      } else if ( result.get( 0 ).compareTo( BigDecimal.valueOf( inputint.get( i ) ) ) < 0 ) {
        // } else if ( result[0] < inputint[i] ) {
        result.set( 0, BigDecimal.valueOf( inputint.get( i ) ) );
        // result[0] = inputint[i];
      }

      // �R���\�[�����͒l��݌v
      if ( i == 0 ) {
        result.add( BigDecimal.valueOf( inputint.get( i ) ) );
      } else {
        result.set( 1, result.get( 1 ).add( BigDecimal.valueOf( inputint.get( i ) ) ) );
        // result[1] += inputint[i];
      }
    }

    // ���v�l���畽�ϒl���Z�o
    result.add( result.get( 1 ).divide( new BigDecimal( "5" ), 3, BigDecimal.ROUND_HALF_UP ) );
    // result[2] = result[1].divide( new BigDecimal( "5" ), 3, BigDecimal.ROUND_HALF_UP );

    return result;
  }
}
