package com.newmusic.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accounts")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String username;
	
	private String email;
	
	private String password;
	
	@Column(columnDefinition = "mediumtext")
	private String image;
	
	private Date dateNaissance;
	
	//liste des postes
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "account",targetEntity = Poste.class,cascade = CascadeType.ALL)
	protected List<Poste>postes;
	
	// liste des reactions
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "account",targetEntity = Reaction.class,cascade = CascadeType.ALL)
	protected List<Reaction>reactions;
	
	//liste des commants
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "account",targetEntity = Commant.class,cascade = CascadeType.ALL)
	protected List<Commant>commants;
	
	// liste des partage 
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "sharingsend",targetEntity = Sharing.class,cascade = CascadeType.ALL)
	protected List<Sharing>followedSharings;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "sharingget",targetEntity = Sharing.class,cascade = CascadeType.ALL)
	protected List<Sharing>followerSharings;
	
	// list des amis
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "followed",targetEntity = Friend.class,cascade = CascadeType.ALL)
	protected List<Friend>followedFriends;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "follower",targetEntity = Friend.class,cascade = CascadeType.ALL)
	protected List<Friend>followerFriends;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Role>roles = new ArrayList<Role>();
}
