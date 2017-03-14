package cn.edu.pku.conf;

import java.io.File;
import java.util.ArrayList;

public class BdwmConf {
	
	public static final String HostUrl = "http://bbs.pku.edu.cn/";
	public static final String Source = "北大未名";
	public static final String ConfFile = "";
		
	public int MaxPageNumber = 90;
	public String dataDir = new String();
	public String descriptionDir = new String();
	public ArrayList<String> industryUrl = new ArrayList<String>();
	public ArrayList<String> industryDir = new ArrayList<String>();
	
	public BdwmConf() {
		MaxPageNumber = 90;
		dataDir = "data";
		descriptionDir = "description";
		makeDirs(getDataDir());
		makeDirs(getDescriptionDir());
		
		industryDir.clear();
		industryUrl.clear();
		industryDir.add("招聘版");
		industryUrl.add("https://bbs.pku.edu.cn/v2/thread.php?bid=845&mode=topic&page=");
		makeDirs(getDataDir() + "/" + industryDir.get(0));
		makeDirs(getDescriptionDir() + "/" + industryDir.get(0));
	}
	
	public void makeDirs(String path) {
		File file = new File(path);
		if (!file.exists() && !file.isDirectory()) {
			file.mkdirs();    
		}
	}
	
	public int getMaxPageNumber() {
		return MaxPageNumber;
	}
	
	public void setMaxPageNumber(int maxPageNumber) {
		MaxPageNumber = maxPageNumber;
	}
	
	public String getDataDir() {
		return dataDir;
	}
	
	public void setDataDir(String dataDir) {
		this.dataDir = dataDir;
	}
	
	public ArrayList<String> getIndustryUrl() {
		return industryUrl;
	}
	
	public void setIndustryUrl(ArrayList<String> industryUrl) {
		this.industryUrl = industryUrl;
	}
	
	public ArrayList<String> getIndustryDir() {
		return industryDir;
	}
	
	public void setIndustryDir(ArrayList<String> industryDir) {
		this.industryDir = industryDir;
	}
	
	public static String getHosturl() {
		return HostUrl;
	}
	
	public String getDescriptionDir() {
		return descriptionDir;
	}

	public void setDescriptionDir(String descriptionDir) {
		this.descriptionDir = descriptionDir;
	}

	public static String getSource() {
		return Source;
	}

	public static String getConffile() {
		return ConfFile;
	}

	public static void main(String []args) {
		BdwmConf bd = new BdwmConf();
		//qc.run();
	}
}