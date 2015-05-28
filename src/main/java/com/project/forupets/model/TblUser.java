package com.project.forupets.model;
// Generated May 26, 2015 9:02:03 PM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * TblUser generated by hbm2java
 */
@Entity
@Table(name="tbl_user"
    ,catalog="4upets"
    , uniqueConstraints = @UniqueConstraint(columnNames="email") 
)
public class TblUser  implements java.io.Serializable {


     private Integer userId;
     private String username;
     private String email;
     @JsonIgnore(value = true)
     private String password;
     private String firstName;
     private String lastName;
     private Date dateCreated;
     private Date dateUpdated;
     private int sex;
     @JsonIgnore(value = true)
     private Set<TblTagUser> tblTagUsers = new HashSet<TblTagUser>(0);
     @JsonIgnore(value = true)
     private Set<TblLike> tblLikes = new HashSet<TblLike>(0);
     @JsonIgnore(value = true)
     private Set<TblFollowing> tblFollowingsForUserId = new HashSet<TblFollowing>(0);
     @JsonIgnore(value = true)
     private Set<TblFollowing> tblFollowingsForUserFollowId = new HashSet<TblFollowing>(0);
     @JsonIgnore(value = true)
     private Set<TblFollower> tblFollowersForUserId = new HashSet<TblFollower>(0);
     @JsonIgnore(value = true)
     private Set<TblComment> tblComments = new HashSet<TblComment>(0);
     @JsonIgnore(value = true)
     private Set<TblFollower> tblFollowersForUserFollowId = new HashSet<TblFollower>(0);
     @JsonIgnore(value = true)
     private Set<TblPost> tblPosts = new HashSet<TblPost>(0);

    public TblUser() {
    }

	
    public TblUser(String username, String email, String password, String firstName, String lastName, int sex) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }
    public TblUser(String username, String email, String password, String firstName, String lastName, Date dateCreated, Date dateUpdated, int sex, Set<TblTagUser> tblTagUsers, Set<TblLike> tblLikes, Set<TblFollowing> tblFollowingsForUserId, Set<TblFollowing> tblFollowingsForUserFollowId, Set<TblFollower> tblFollowersForUserId, Set<TblComment> tblComments, Set<TblFollower> tblFollowersForUserFollowId, Set<TblPost> tblPosts) {
       this.username = username;
       this.email = email;
       this.password = password;
       this.firstName = firstName;
       this.lastName = lastName;
       this.dateCreated = dateCreated;
       this.dateUpdated = dateUpdated;
       this.sex = sex;
       this.tblTagUsers = tblTagUsers;
       this.tblLikes = tblLikes;
       this.tblFollowingsForUserId = tblFollowingsForUserId;
       this.tblFollowingsForUserFollowId = tblFollowingsForUserFollowId;
       this.tblFollowersForUserId = tblFollowersForUserId;
       this.tblComments = tblComments;
       this.tblFollowersForUserFollowId = tblFollowersForUserFollowId;
       this.tblPosts = tblPosts;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="user_id", unique=true, nullable=false)
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    @Column(name="username", nullable=false, length=128)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="email", unique=true, nullable=false, length=128)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="password", nullable=false, length=64)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="first_name", nullable=false, length=45)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", nullable=false, length=45)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_created", length=19)
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_updated", length=19)
    public Date getDateUpdated() {
        return this.dateUpdated;
    }
    
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    
    @Column(name="sex", nullable=false)
    public int getSex() {
        return this.sex;
    }
    
    public void setSex(int sex) {
        this.sex = sex;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tblUser")
    public Set<TblTagUser> getTblTagUsers() {
        return this.tblTagUsers;
    }
    
    public void setTblTagUsers(Set<TblTagUser> tblTagUsers) {
        this.tblTagUsers = tblTagUsers;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tblUser")
    public Set<TblLike> getTblLikes() {
        return this.tblLikes;
    }
    
    public void setTblLikes(Set<TblLike> tblLikes) {
        this.tblLikes = tblLikes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tblUserByUserId")
    public Set<TblFollowing> getTblFollowingsForUserId() {
        return this.tblFollowingsForUserId;
    }
    
    public void setTblFollowingsForUserId(Set<TblFollowing> tblFollowingsForUserId) {
        this.tblFollowingsForUserId = tblFollowingsForUserId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tblUserByUserFollowId")
    public Set<TblFollowing> getTblFollowingsForUserFollowId() {
        return this.tblFollowingsForUserFollowId;
    }
    
    public void setTblFollowingsForUserFollowId(Set<TblFollowing> tblFollowingsForUserFollowId) {
        this.tblFollowingsForUserFollowId = tblFollowingsForUserFollowId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tblUserByUserId")
    public Set<TblFollower> getTblFollowersForUserId() {
        return this.tblFollowersForUserId;
    }
    
    public void setTblFollowersForUserId(Set<TblFollower> tblFollowersForUserId) {
        this.tblFollowersForUserId = tblFollowersForUserId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tblUser")
    public Set<TblComment> getTblComments() {
        return this.tblComments;
    }
    
    public void setTblComments(Set<TblComment> tblComments) {
        this.tblComments = tblComments;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tblUserByUserFollowId")
    public Set<TblFollower> getTblFollowersForUserFollowId() {
        return this.tblFollowersForUserFollowId;
    }
    
    public void setTblFollowersForUserFollowId(Set<TblFollower> tblFollowersForUserFollowId) {
        this.tblFollowersForUserFollowId = tblFollowersForUserFollowId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tblUser")
    public Set<TblPost> getTblPosts() {
        return this.tblPosts;
    }
    
    public void setTblPosts(Set<TblPost> tblPosts) {
        this.tblPosts = tblPosts;
    }




}


