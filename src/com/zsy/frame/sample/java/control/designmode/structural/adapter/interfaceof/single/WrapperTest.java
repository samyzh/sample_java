package com.zsy.frame.sample.java.control.designmode.structural.adapter.interfaceof.single;

/**���ӿ�������ģʽ
 * Ĭ��������ģʽ(Default Adapter Pattern)��ȱʡ������ģʽ
 ������Ҫȫ��ʵ�ֽӿ��ṩ�ķ���ʱ���������һ��������ʵ�ֽӿڣ���Ϊ�ýӿ���ÿ�������ṩһ��Ĭ��ʵ�֣��շ�������
 ��ô�ó�������������ѡ��ظ��Ǹ����ĳЩ������ʵ��������������һ���ӿڲ���ʹ�������еķ����������
 ���Ҳ��Ϊ���ӿ�������ģʽ��
 */
public class WrapperTest {
  
    public static void main(String[] args) {  
        Sourceable source1 = new SourceSub1();  
        Sourceable source2 = new SourceSub2();  
          
        source1.method1();  
        source1.method2();  
        source2.method1();  
        source2.method2();  
    }  
} 