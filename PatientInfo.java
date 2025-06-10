package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pInfo")
@Data
public class PatientInfo {
	@Value("10023")
	private Integer pid;
	
	@Value("${pi.name}")
	private String pname;
	
	@Value("${pi.mobileNo}")
	private long mobileNo;
	
	@Value("${pi.addrs}")
	private String paddrs;
	
	@Value("#{dcc.xrayPrice+dcc.ctscanPrice+dcc.ecgPrice}")
	private Double billamount;
	
	@Value("#{dcc.ecgPrice<=0}")
	private Boolean ecgFree;
	
	@Value("${os.name}")
	private String osName;
	
	@Value("${Path}")
	private String pathData;
	
	public Integer getPid() {
		return pid;
	}
	
	public void setPid(Integer pid) {
		this.pid=pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname=pname;
	}
	
	public Long getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(Long mobileNo) {
		this.mobileNo=mobileNo;
	}
	
	public String getPaddrs() {
		return paddrs;
	}
	
	public void setPaddrs(String paddrs) {
		this.paddrs=paddrs;
	}
	
	public Double getBillamount() {
		return billamount;
	}
	
	public void setBillamount(Double billamount)
	{
		this.billamount=billamount;
	}
	
	public String getOsName() {
		return osName;
	}
	
	public void setOsName(String osName) {
		this.osName=osName;
	}
	
	public String getPathData() {
		return pathData;
	}
	
	public void setPathData(String pathData) {
		this.pathData=pathData;
	}
	
	public Boolean getecgFree() {
		return ecgFree;
	}
	
	public void setecgFree(boolean ecgFree) {
		this.ecgFree=ecgFree;
	}
	
	@Override
	public String toString() {
		return "Patient Info[pid= "+pid+", pname= "+pname+", mobileNo= "+mobileNo+", paddrs= "+paddrs+
				", billamount= "+billamount+", ecgFree= "+ecgFree+", osName= "+osName+ 
				",pathData= "+pathData+"]";
	}
}
