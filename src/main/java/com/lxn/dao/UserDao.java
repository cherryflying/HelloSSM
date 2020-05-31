package com.lxn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lxn.entity.User;


public interface UserDao {
    /**
     * ����id��ѯ�û���Ϣ
     *
     * @param id
     * @return
     */
    public User queryUserById(@Param("userName") String userName,@Param("password") String password);

    /**
     * ��ѯ�����û���Ϣ
     *
     * @return
     */
    public List<User> queryUserAll();

    /**
     * �����û�
     *
     * @param user
     */
    public int insertUser(User user);

    /**
     * �����û���Ϣ
     *
     * @param user
     */
    public void updateUser(User user);

    /**
     * ����idɾ���û���Ϣ
     *
     * @param id
     */
    public void deleteUser(String id);
    
    
    public User queryUserByUserName(@Param("userName") String userName);
}
