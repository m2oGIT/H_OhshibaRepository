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
 * @author �i�쐬�ҁF��Đm�u�j <br />
 *         �i�N���X�_�����F�p�o���C�u�����N���X�̎g���� ��1�j <br />
 *         �i�����F�R���\�[��������͂��ꂽ�����s�̕�����𗭂ߍ��݁A <br />
 *         �@�@�@�@�\�ߒ�`���ꂽ�I������(end)�����͂��ꂽ�ꍇ�ɁA�ꊇ�ŏo�͂��鏈�����쐬����B�j <br />
 *         �X�V���� 2016/4/29 �i�X�V�ҁF��Đm�u�j�F�i�����F�V�K�쐬�j <br />
 */
class ConsolelnTest {
  /**
   * �i���\�b�h�_�����F���C���j <br />
   * �i�����F�R���\�[���ւ̃��b�Z�[�W�\���A�R���\�[�����͏�������шꊇ�o�͏����̎��s�B <br />
   * �@�@�@�@�G���[�����������ꍇ�́A�G���[���b�Z�[�W��\������B�j <br />
   * 
   * @param args �N��������
   */
  public static void main( String[] args ) {
    // �R���\�[���̓��͕�����
    List<String> inputstr = new ArrayList<String>();
    // �����񌋍�����
    String outputstr;

    // ���͗v�����b�Z�[�W�̕\��
    System.out.println( "���������͂��Ă��������B" );
    System.out.println( "end�̓��͂ŏI�����܂��B" );
    System.out.println();

    // �R���\�[�����͏���
    try {
      inputstr = inputproc();
      // �����񌋍�����
      outputstr = strproc( inputstr );

      // ����������������R���\�[���ɕ\��
      System.out.println( "���߂���������o�͂��܂��B" + outputstr );

      // ��O����
    } catch ( IOException e ) {
      // �G���[���̓��b�Z�[�W��\��
      System.out.println( "�ُ킪�������܂����B�������I�����܂��B" );
    }
  }

  /**
   * �i���\�b�h�_�����F�R���\�[�����͏����j <br />
   * �i�����F�R���\�[���̓��͕������ArrayList�Ƃ��ĕԂ��B�j <br />
   * 
   * @throws IOException �R���\�[�����͂łُ̈�
   * @return �R���\�[���̓��͕�����(ArrayList)
   */
  private static List<String> inputproc() throws IOException {
    // �R���\�[���̓��͕�����
    List<String> inputstr = new ArrayList<String>();
    // �R���\�[���̓��͏I��������
    String breakstr = "end";

    // ���̓X�g���[���̃C���X�^���X�����Ő����B
    InputStreamReader input = null;

    // �R���\�[�����͂̌J��Ԃ�����
    do {
      // �R���\�[�����͑҂�
      input = new InputStreamReader( System.in );
      // �R���\�[���̕����^���̓X�g���[�����쐬
      BufferedReader inputbr = new BufferedReader( input );
      // �R���\�[�����͂�1�s��ǂݍ���
      String inputline = inputbr.readLine();
      // �I��������̏ꍇ�͌J��Ԃ������𔲂���
      if ( inputline.equals( breakstr ) ) {
        break;
      }
      // �R���\�[�����͂�ArrayList�ɃZ�b�g
      inputstr.add( inputline );
    } while ( true );

    // Stream�̃N���[�Y
    input.close();

    return inputstr;
  }

  /**
   * �i���\�b�h�_�����F�����񌋍������j <br />
   * �i�����FArrayList�̕�������������ĕԂ��B�j <br />
   * 
   * @param inputstr �R���\�[���̓��͕�����
   * @return �����񌋍�����
   */
  private static String strproc( List<String> inputstr ) {
    // ������̌�������
    String outputstr = new String();

    // �z��̗v�f���A�J��Ԃ�
    for ( String value : inputstr ) { // �ꎞ�ϐ��ɔz��̒l��W�J���A�����܂ŌJ��Ԃ��C���[�W�B
      outputstr += value;
    }

    return outputstr;
  }
}
