
package Java002;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author �i�쐬�ҁF��Đm�u�j <br />
 *         �i�N���X�_�����FJava��b ��2�j <br />
 *         �i�����F��1�����ɁA��̎��̂݉��Z������B�j <br />
 *         �X�V���� 2015/11/29 �i�X�V�ҁF��Đm�u�j�F�i�����F�V�K�쐬�j <br />
 */
class Test08 {
  /**
   * �i���\�b�h�_�����F���C���j <br />
   * �i�����F1����100�܂ł̂�����̂݉��Z�����݌v���R���\�[���ɕ\������j <br />
   * 
   * @param args �N��������
   */
  public static void main( String[] args ) {
    int sum = 0;

    for ( int i = 1; i <= 100; i++ ) {
      if (i % 2 != 0) {
        sum += i;
      }
      
    }

    System.out.println( "���v��" + sum + "�ł�" );
  }
}
