package hibernate;
// Generated 2016-12-13 10:58:38 by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Restaurant generated by hbm2java
 */
@Entity
@Table(name = "restaurant", catalog = "db_15")
public class Restaurant implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer resId;
	private String resName;
	private String resAddrProvince;
	private String resAddrCity;
	private String resAddrStreet;
	private String resStyle;
	private Integer resAverageCost;
	private Double resScore;
	private String resPic;
	private Set<ResMark> resMarks = new HashSet<ResMark>(0);
	private Set<Article> articles = new HashSet<Article>(0);
	private Set<User> users = new HashSet<User>(0);

	public Restaurant() {
	}

	public Restaurant(String resName, String resAddrProvince, String resAddrCity, String resAddrStreet, String resStyle,
			Integer resAverageCost, Double resScore, String resPic, Set<ResMark> resMarks, Set<Article> articles,
			Set<User> users) {
		this.resName = resName;
		this.resAddrProvince = resAddrProvince;
		this.resAddrCity = resAddrCity;
		this.resAddrStreet = resAddrStreet;
		this.resStyle = resStyle;
		this.resAverageCost = resAverageCost;
		this.resScore = resScore;
		this.resPic = resPic;
		this.resMarks = resMarks;
		this.articles = articles;
		this.users = users;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "res_id", unique = true, nullable = false)
	public Integer getResId() {
		return this.resId;
	}

	public void setResId(Integer resId) {
		this.resId = resId;
	}

	@Column(name = "res_name", length = 20)
	public String getResName() {
		return this.resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	@Column(name = "res_addr_province", length = 20)
	public String getResAddrProvince() {
		return this.resAddrProvince;
	}

	public void setResAddrProvince(String resAddrProvince) {
		this.resAddrProvince = resAddrProvince;
	}

	@Column(name = "res_addr_city", length = 20)
	public String getResAddrCity() {
		return this.resAddrCity;
	}

	public void setResAddrCity(String resAddrCity) {
		this.resAddrCity = resAddrCity;
	}

	@Column(name = "res_addr_street", length = 50)
	public String getResAddrStreet() {
		return this.resAddrStreet;
	}

	public void setResAddrStreet(String resAddrStreet) {
		this.resAddrStreet = resAddrStreet;
	}

	@Column(name = "res_style", length = 20)
	public String getResStyle() {
		return this.resStyle;
	}

	public void setResStyle(String resStyle) {
		this.resStyle = resStyle;
	}

	@Column(name = "res_average_cost")
	public Integer getResAverageCost() {
		return this.resAverageCost;
	}

	public void setResAverageCost(Integer resAverageCost) {
		this.resAverageCost = resAverageCost;
	}

	@Column(name = "res_score", precision = 22, scale = 0)
	public Double getResScore() {
		return this.resScore;
	}

	public void setResScore(Double resScore) {
		this.resScore = resScore;
	}

	@Column(name = "res_pic", length = 100)
	public String getResPic() {
		return this.resPic;
	}

	public void setResPic(String resPic) {
		this.resPic = resPic;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurant")
	public Set<ResMark> getResMarks() {
		return this.resMarks;
	}

	public void setResMarks(Set<ResMark> resMarks) {
		this.resMarks = resMarks;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "refer", catalog = "db_15", joinColumns = {
			@JoinColumn(name = "refer_res_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "refer_art_id", nullable = false, updatable = false) })
	public Set<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "res_collect", catalog = "db_15", joinColumns = {
			@JoinColumn(name = "cres_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "collector_id", nullable = false, updatable = false) })
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
