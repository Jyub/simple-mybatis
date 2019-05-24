package mybatis.model;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/24 11:09
 * @description: 用户角色关联表
 */
public class SysUserRole {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 角色id
     */
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
