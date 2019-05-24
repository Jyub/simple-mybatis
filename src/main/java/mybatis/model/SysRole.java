package mybatis.model;

import java.util.Date;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/24 11:02
 * @description: 角色
 */
public class SysRole {
    /**
     * 角色id
     */
    private Long  id;
    /**
     * 名称
     */
    private String roleName;
    /**
     * 有效标识
     */
    private Integer enabled;
    /**
     * 创建人
     */
    private Integer createBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 级联用户表字段
     */
    private SysUser user;


    public SysUser getUser() {
        return user;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
