
package Java002;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author �i�쐬�ҁF��Đm�u�j <br />
 *         �i�N���X�_�����FJava��b ��1�j <br />
 *         �i�����F1����100�܂ł̐��l�����[�v�ŉ񂵂āA���Z����R�[�h���쐬����B�j <br />
 *         �X�V���� 2015/11/29 �i�X�V�ҁF��Đm�u�j�F�i�����F�V�K�쐬�j <br />
 */
class Test07 {
  /**
   * �i���\�b�h�_�����F���C���j <br />
   * �i�����F1����100�܂ł̉��Z�����݌v���R���\�[���ɕ\������j <br />
   * 
   * @param args �N��������
   */
  public static void main( String[] args ) {
    // �݌v�l��������
    int sum = 0;

    // �݌v�l��1����100�܂ŉ��Z
    for ( int i = 1; i <= 100; i++ ) {
      sum += i;
    }

    // �݌v�l���R���\�[���ɕ\��
    System.out.println( "���v��" + sum + "�ł�" );
  }

  /**
   * �i���\�b�h�_�����F�݌v�����j <br />
   * �i�����F�n���ꂽ2��ނ̐����̊Ԃ̐���S�č��v���ĕԂ��j <br />
   * 
   * @param param1 �݌v�����̊J�n�l�i�܂��͏I���l�j
   * @param param2 �݌v�����̏I���l�i�܂��͊J�n�l�j
   * @return ��L�̐����̊Ԃ̐��̑S�č��v�����l
   */
  public static int ruikei( int param1, int param2 ) {
    // �݌v�l��������
    int sum = 0;
    // �J�n�l�̒�`
    int min;
    // �I���l�̒�`
    int max;

    // �������r�������ʂɉ����āA�J�n�l����яI���l�̐ݒ�
    if ( param1 < param2 ) {
      min = param1;
      max = param2;
    } else {
      min = param2;
      max = param1;
    }

    // �݌v�l�ɊJ�n�l����I���l�܂ŉ��Z
    for ( int i = min; i <= max; i++ ) {
      sum += i;
    }

    // �݌v�l��Ԃ�
    return sum;
  }
}
