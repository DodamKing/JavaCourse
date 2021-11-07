package test;

public class LoginVo {
	private int idx;
	private String userId;
	private String password;
	private String userNm;
	private String fDate;
	private int vCnt;
	private int point;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getfDate() {
		return fDate;
	}
	public void setfDate(String fDate) {
		this.fDate = fDate;
	}
	public int getvCnt() {
		return vCnt;
	}
	public void setvCnt(int vCnt) {
		this.vCnt = vCnt;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "loginVo [idx=" + idx + ", userId=" + userId + ", password=" + password + ", userNm=" + userNm
				+ ", fDate=" + fDate + ", vCnt=" + vCnt + ", point=" + point + "]";
	}
	
}
