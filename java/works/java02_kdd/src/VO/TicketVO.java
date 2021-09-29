package VO;

public class TicketVO {
	private String customerNm; // 고객이름
	private String customerID; // 고객아이디
	private String theatherNm; // 영화관이름
	private String movieNm; // 영화이름
	private String day; // 예매 날짜
	private String time; // 예매 시간
	private String reserveDate; // 예매한 당시 날짜
	private String cost; // 가격
	private String person; // 총인원
	
	public String getCustomerNm() {
		return customerNm;
	}
	public void setCustomerNm(String customerNm) {
		this.customerNm = customerNm;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getTheatherNm() {
		return theatherNm;
	}
	public void setTheatherNm(String theatherNm) {
		this.theatherNm = theatherNm;
	}
	public String getMovieNm() {
		return movieNm;
	}
	public void setMovieNm(String movieNm) {
		this.movieNm = movieNm;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getReserveDate() {
		return reserveDate;
	}
	public void setReserveDate(String reserveDate) {
		this.reserveDate = reserveDate;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
}
