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
@Table(name = "sharings")
public class Sharing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	// le poste a partagez
	@ManyToOne
	@JoinColumn(name = "poste_id")
	private Poste poste;
	// le copmte qui partagez followedSharing
	@ManyToOne
	@JoinColumn(name = "sharingsend_id")
	private Account sharingsend;
	
	// le compte qui resoi le poste	
	@ManyToOne
	@JoinColumn(name = "sharingget_id")
	private Account sharingget;
}
