
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
    int sum = 0;

    for ( int i = 1; i <= 100; i++ ) {
      sum += i;
    }

    System.out.println( "���v��" + sum + "�ł�" );
  }

  /**
   * �i���\�b�h�_�����F�݌v�����j <br />
   * �i�����F�n���ꂽ2��ނ̐����̊Ԃ̐���S�č��v���ĕԂ��j <br />
   * 
   * @param min �݌v�����̊J�n�l
   * @param max �݌v�����̏I���l
   * @return ��L�̐����̊Ԃ̐��̑S�č��v�����l
   */
  public static int ruikei( int min, int max ) {
    int sum = 0;

    for ( int i = min; i <= max; i++ ) {
      sum += i;
    }

    return sum;
  }
}
