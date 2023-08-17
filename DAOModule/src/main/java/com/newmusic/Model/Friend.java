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
@Table(name = "friends")
public class Friend {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	// le compte followed moi me
	@ManyToOne
	@JoinColumn(name = "followed_id")
	private Account followed;
	
	// le compte follower ils hem
	@ManyToOne
	@JoinColumn(name = "follower_id")
	private Account follower;
}
