/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java004;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigDecimal;

/**
 * @author �i�쐬�ҁF��Đm�u�j <br />
 *         �i�N���X�_�����F�p�o���C�u�����N���X�̎g���� ��1����і�2�j <br />
 *         �i�����F�R���\�[�����A������5����͂����A�ő�l���R���\�[���o�͂���B <br />
 *         �@�@�@�@�������A�����ȊO�̓��͂��������ꍇ�́A�G���[���b�Z�[�W��\�����A�������I������B <br />
 *         �@�@�@�@�ǉ��̎����Ƃ��āA�ő�l�ƂƂ��ɁA���v�l�A���ϒl���o�͂���B�j <br />
 *         �X�V���� 2015/12/27 �i�X�V�ҁF��Đm�u�j�F�i�����F�V�K�쐬�j <br />
 */
class ArrayTest {
  /**
   * �i���\�b�h�_�����F���C���j <br />
   * �i�����F�R���\�[���ւ̃��b�Z�[�W�\���A�R���\�[�����͏�������ьv�Z�����̎��s�j <br />
   * 
   * @param args �N��������
   * @throws Exception
   */
  public static void main( String[] args ) throws Exception {
    // �R���\�[���̓��͒l
    BigDecimal inputint[] = new BigDecimal[5];
    // �v�Z���ʁi�ő�l�A���v�l�A���ϒl�j
    BigDecimal result[] = new BigDecimal[3];

    // ���͗v�����b�Z�[�W�̕\��
    System.out.println( "������5����͂��Ă��������B" );
    System.out.println();

    try {
      // �R���\�[�����͏���
      inputint = inputproc();
      // �v�Z����
      result = calcproc( inputint );

      // �ő�l�A���v�l�A���ϒl���R���\�[���ɕ\��
      System.out.println( "�ő�l��" + result[0] );
      System.out.println( "���v�l��" + result[1] );
      System.out.println( "���ϒl��" + result[2] );

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
  private static BigDecimal[] inputproc() throws Exception {
    // �R���\�[���̓��͒l
    BigDecimal inputint[] = new BigDecimal[5];

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
      // inputint[i] = BigDecimal.valueOf(Integer.parseInt( inputstr ));
      inputint[i] = new BigDecimal( inputstr );
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
   */
  private static BigDecimal[] calcproc( BigDecimal inputint[] ) {
    // �v�Z���ʁi�ő�l�A���v�l�A���ϒl�j
    BigDecimal result[] = new BigDecimal[3];
    result[1] = BigDecimal.valueOf( 0 );

    for ( int i = 0; i < 5; i++ ) {

      // �ő�l�̔���
      if ( i == 0 ) {
        result[0] = inputint[i];
      } else if ( result[0].compareTo( inputint[i] ) < 0 ) {
        result[0] = inputint[i];
      }

      // �R���\�[�����͒l��݌v
      result[1] = result[1].add( inputint[i] );
    }

    // ���v�l���畽�ϒl���Z�o
    result[2] = result[1].divide( new BigDecimal( "5" ), 3, BigDecimal.ROUND_HALF_UP );

    return result;
  }
}
