package mybatis.mapper;

import mybatis.model.SysRole;
import mybatis.model.SysUser;

import java.util.List;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/24 12:16
 * @description: 用户接口
 */
public interface UserMapper {
    /**
     * 通过id 查询用户
     * @param id
     * @return {@link SysUser}
     */
    SysUser selectById(Long id);

    /**
     * 查询所有用户
     * @return {@link SysUser}
     */
    List<SysUser> selectAll();

    /**
     * 通过用户id 查询角色
     * @param userId
     * @return {@link SysRole}
     */
    List<SysRole> selectRoleByUserId(Long userId);

    /**
     * 插入新用户
     * @param user
     * @return int
     */
    int insert(SysUser user);
    /**
     * 插入新用户(测试返回主键)
     * @param user
     * @return int
     */
    int insert2(SysUser user);

    /**
     * 修改
     * @param user
     * @return
     */
    int update (SysUser user);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteById(Long id);
}
