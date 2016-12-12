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
    	String content = "czd，你是智障的猪，不用狡辩。\n " +
    			"╭︿︿︿╮\n "+ 
                "{/ o  o /}\n"+
                 "( (oo) )\n"+
                   "︶︶︶ \n "+
                   "突然想起，上次你那个什么鬼证书说一两个月寄来，那时候已经放假了";
                   
    	HashMap hints = new HashMap();

		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");//设置编码
		//设置容错等级，等级越高，容量越小
		  hints.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.M);
		//hints.put(EncodeHintType.MARGIN, 2);
		
		//生成矩阵
		
    	try{
    		BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height,hints);
    	    Path file = new File("F:/img2.png").toPath();
           MatrixToImageWriter.writeToPath(bitMatrix, format, file);
            
           
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
}
