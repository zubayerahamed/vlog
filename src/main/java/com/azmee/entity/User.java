/**
 * 
 */
package com.azmee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author METATUDE-07
 *
 */
@Data
@Entity
@Table(name = "users")
public class User {

	private Long id;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
}
