package com;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;


public class rebecca {
	public static void main(String[] args){
    	int width = 300;
    	int height = 300;
    	String format="png";
    	String content = "czd���������ϵ������ýƱ硣\n " +
    			"�q����r\n "+ 
                "{/ o  o /}\n"+
                 "( (oo) )\n"+
                   "���� \n "+
                   "ͻȻ�����ϴ����Ǹ�ʲô��֤��˵һ�����¼�������ʱ���Ѿ��ż���";
                   
    	HashMap hints = new HashMap();

		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");//���ñ���
		//�����ݴ�ȼ����ȼ�Խ�ߣ�����ԽС
		  hints.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.M);
		//hints.put(EncodeHintType.MARGIN, 2);
		
		//���ɾ���
		
    	try{
    		BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height,hints);
    	    Path file = new File("F:/img2.png").toPath();
           MatrixToImageWriter.writeToPath(bitMatrix, format, file);
            
           
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
}
