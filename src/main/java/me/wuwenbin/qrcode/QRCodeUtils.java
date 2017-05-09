package me.wuwenbin.qrcode;

import com.google.zxing.common.BitMatrix;
import me.wuwenbin.qrcode.matrix.MatrixToImageWriterEx;
import me.wuwenbin.qrcode.matrix.MatrixToLogoImageConfig;

import java.io.IOException;

/**
 * 
 * <b>ClassName</b>: QRCodeUtils<br>
 * <b>Description</b>: 二维码工具类<br>
 * <b>Version</b>: Ver 1.0<br>
 *
 * <b>author</b>: Wuwenbin<br>
 * <b>date</b>: 2016年8月31日<br>
 * <b>time</b>: 下午12:35:37 <br>
 */
public class QRCodeUtils {

	/**
	 * 
	 * <b>Author</b> : Wuwenbin<br>
	 * <b>Title</b> : generateQRCode2File<br>
	 * <b>Description</b> : 写入二维码、以及将照片logo写入二维码中，使用默认配置<br>
	 * 
	 * @param qrContent
	 *            二维码文字内容[为了信息安全性，一般都要先进行数据加密]
	 * @param qrWidth
	 *            二维码照片宽度
	 * @param qrHeight
	 *            二维码照片高度
	 * @param qrFormat
	 *            二维码照片格式
	 * @param qrImagePath
	 *            二维码照片保存路径
	 * @param qrLogoPath
	 *            logo路径
	 * @throws IOException
	 */
	public static void generateQRCode2File(String qrContent, int qrWidth, int qrHeight, String qrFormat, String qrImagePath, String qrLogoPath) throws IOException {
		/**
		 * 根据内容生成二维码数据
		 */
		BitMatrix bitMatrix = MatrixToImageWriterEx.createQRCode(qrContent, qrWidth, qrHeight);
		/**
		 * 写二维码
		 */
		MatrixToImageWriterEx.writeToFile(bitMatrix, qrFormat, qrImagePath, qrLogoPath);
	}

	/**
	 * 
	 * <b>Author</b> : Wuwenbin<br>
	 * <b>Title</b> : generateQRCode2File<br>
	 * <b>Description</b> : 写入二维码、以及将照片logo写入二维码中，使用自定义配置<br>
	 * 
	 * @param qrContent
	 *            二维码文字内容[为了信息安全性，一般都要先进行数据加密]
	 * @param qrWidth
	 *            二维码照片宽度
	 * @param qrHeight
	 *            二维码照片高度
	 * @param qrFormat
	 *            二维码照片格式
	 * @param qrImagePath
	 *            二维码照片保存路径
	 * @param qrLogoPath
	 *            logo路径
	 * @param logoConfig
	 *            生成二维码配置
	 * @throws IOException
	 */
	public static void generateQRCode2File(String qrContent, int qrWidth, int qrHeight, String qrFormat, String qrImagePath, String qrLogoPath, MatrixToLogoImageConfig logoConfig) throws IOException {
		/**
		 * 根据内容生成二维码数据
		 */
		BitMatrix bitMatrix = MatrixToImageWriterEx.createQRCode(qrContent, qrWidth, qrHeight);
		/**
		 * 写二维码
		 */
		MatrixToImageWriterEx.writeToFile(bitMatrix, qrFormat, qrImagePath, qrLogoPath, logoConfig);
	}
}
