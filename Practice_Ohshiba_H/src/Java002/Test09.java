
package Java002;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author �i�쐬�ҁF��Đm�u�j <br />
 *         �i�N���X�_�����FJava��b ��3�j <br />
 *         �i�����F��1�����ɁA1~�u���s�������œn���ꂽ���l�v�܂ł����[�v�ŉ񂵂āA���Z����R�[�h���쐬����B�j <br />
 *         �X�V���� 2015/11/29 �i�X�V�ҁF��Đm�u�j�F�i�����F�V�K�쐬�j <br />
 */
class Test09 {
  /**
   * �i���\�b�h�_�����F���C���j <br />
   * �i�����F1����N���������܂ł̉��Z�����݌v���R���\�[���ɕ\������j <br />
   * 
   * @param args �N��������
   */
  public static void main( String[] args ) {
    int sum = 0;
    int max = Integer.parseInt( args[0] );

    for ( int i = 1; i <= max; i++ ) {
      sum += i;

    }

    System.out.println( "���v��" + sum + "�ł�" );
  }
}
