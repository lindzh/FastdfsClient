package net.mikesu.fastdfs.client;

import static org.junit.Assert.*;

import java.io.File;

import net.mikesu.fastdfs.FastdfsClientImpl;
import net.mikesu.fastdfs.FastdfsClient;

import org.junit.Test;

public class DefaultFastdfsClientTest {

//	@Test
	public void testUpload() throws Exception {
		FastdfsClient fastdfsClient = new FastdfsClientImpl();
		File file = new File("E:/Download/Backyard Mushrooms - Kurt Zitzelman.jpg");
		String fileId = fastdfsClient.upload(file);
		System.out.println(fileId);
	}
	
	@Test
	public void testGetUrl() throws Exception {
		FastdfsClientImpl fastdfsClient = new FastdfsClientImpl();
		System.out.println(fastdfsClient.getUrl("group1/M00/00/00/Cn2wilM00puAa0xSAANVQ4eIxAM143.jpg"));
	}
	
//	@Test
	public void testDelete() throws Exception {
		FastdfsClientImpl fastdfsClient = new FastdfsClientImpl();
		String fileId = "group1/M00/00/00/Cn2wilM00puAa0xSAANVQ4eIxAM143.jpg";
		fastdfsClient.delete(fileId);
		System.out.println(fastdfsClient.getUrl(fileId));
		
	}

}
