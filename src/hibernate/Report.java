package hibernate;
// Generated 2016-12-13 10:58:38 by Hibernate Tools 3.2.2.GA

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Report generated by hbm2java
 */
@Entity
@Table(name = "report", catalog = "db_15")
public class Report implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ReportId id;
	private Article article;
	private User user;
	private Date repTime;

	public Report() {
	}

	public Report(ReportId id, Article article, User user) {
		this.id = id;
		this.article = article;
		this.user = user;
	}

	public Report(ReportId id, Article article, User user, Date repTime) {
		this.id = id;
		this.article = article;
		this.user = user;
		this.repTime = repTime;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "repUserId", column = @Column(name = "rep_user_id", nullable = false) ),
			@AttributeOverride(name = "repArtId", column = @Column(name = "rep_art_id", nullable = false) ) })
	public ReportId getId() {
		return this.id;
	}

	public void setId(ReportId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rep_art_id", nullable = false, insertable = false, updatable = false)
	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rep_user_id", nullable = false, insertable = false, updatable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "rep_time", length = 10)
	public Date getRepTime() {
		return this.repTime;
	}

	public void setRepTime(Date repTime) {
		this.repTime = repTime;
	}

}
