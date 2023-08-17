package com.newmusic.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reactions")
public class Reaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private boolean view;
	
	//le poste 
	@ManyToOne
	@JoinColumn(name = "poste_id")
	private Poste poste;
	
	//le compte qui fais la reaction
	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;
}
