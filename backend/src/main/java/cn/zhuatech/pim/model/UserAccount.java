/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.pim.model;
import jakarta.persistence.*;
@Entity @Table(name="pim_user")
public class UserAccount extends BaseEntity {
    public enum Role { ADMIN, PIM_MANAGER, CONTENT_STEWARD, QUALITY }
    @Column(nullable=false,unique=true,length=32) private String username; @Column(nullable=false) private String password;
    @Column(nullable=false,length=50) private String fullName; @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Role role;
    @Column(name="channel_code",length=32) private String channelCode; @Column(nullable=false) private boolean enabled=true;
    protected UserAccount(){}
    public UserAccount(String username,String password,String fullName,Role role,String channelCode){this.username=username;this.password=password;this.fullName=fullName;this.role=role;this.channelCode=channelCode;}
    public String getUsername(){return username;} public String getPassword(){return password;} public String getFullName(){return fullName;} public Role getRole(){return role;} public String getChannelCode(){return channelCode;} public boolean isEnabled(){return enabled;}
}
