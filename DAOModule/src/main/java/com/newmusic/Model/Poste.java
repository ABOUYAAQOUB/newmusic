package com.newmusic.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Postes")
public class Poste {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String titre;
	private Date datePoste;
	private String description;
	private String urlmusic;
	
	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "poste",targetEntity = Sharing.class,cascade = CascadeType.ALL)
	protected List<Sharing>sharings;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "poste",targetEntity = Commant.class,cascade = CascadeType.ALL)
	protected List<Commant>commants;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "poste",targetEntity = Reaction.class,cascade = CascadeType.ALL)
	protected List<Reaction>reactions;
	
}
