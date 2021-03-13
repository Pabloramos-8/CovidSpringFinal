package com.example.demo.modelo.user;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class UserEntity implements UserDetails {

 @Id
 String id;
 @Column(unique = true)
 String username;

 @Column
 String password;

 
 public UserEntity(String username2, Set<UserRole> roles2) {
	// TODO Auto-generated constructor stub
}

@ElementCollection(fetch = FetchType.EAGER)
 @Enumerated(EnumType.STRING)
 Set<UserRole> roles;

 @Override
 public Collection<? extends GrantedAuthority> getAuthorities() {
 Set result = new HashSet<>();
 for (UserRole userRole : roles) {
 SimpleGrantedAuthority sga = new
SimpleGrantedAuthority("ROLE_"+userRole.name());
 result.add(sga);
 }
 return result;
 }
 public String getId() {
 return id;
 }
 public void setId(String id) {
 this.id = id;
 }

 @Override
 public String getPassword() {
 // TODO Auto-generated method stub
 return this.password;
 }
 @Override
 public String getUsername() {// TODO Auto-generated method stub
	 return this.username;
	 }
	 @Override
	 public boolean isAccountNonExpired() {
	 // TODO Auto-generated method stub
	 return true;
	 }
	 @Override
	 public boolean isAccountNonLocked() {
	 // TODO Auto-generated method stub
	 return true;
	 }
	 @Override
	 public boolean isCredentialsNonExpired() {
	 // TODO Auto-generated method stub
	 return true;
	 }
	 @Override
	 public boolean isEnabled() {
	 // TODO Auto-generated method stub
	 return true;
	 }
	 public void setUsername(String username) {
	 this.username = username;
	 }
	 public void setPassword(String password) {
	 this.password = password;
	 }
	 public Set<UserRole> getRoles() {
	 return roles;
	 }
	 public void setRoles(Set<UserRole> roles) {
	 this.roles = roles;
	 }
	}