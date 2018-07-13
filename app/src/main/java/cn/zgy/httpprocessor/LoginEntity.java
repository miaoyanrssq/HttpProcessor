package cn.zgy.httpprocessor;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Thinkpad on 2017/11/7.
 */

public class LoginEntity implements Serializable {

    /**
     * user : {"id":3,"username":"chenshaohua","email":null,"truename":"陈少华","isActive":true,"acl":["videoManage","videoManage.videoManage","videoManage.videoManage.getDownloadUrl","videoManage.videoManage.videoManagePublish","videoManage.videoManage.editVideoManage","videoManage.videoManage.delVideoManage","videoManage.class","videoManage.class.addClass","videoManage.class.delClass","videoManage.class.editClass","videoManage.source","videoManage.source.addSource","videoManage.source.delSource","videoManage.source.editSource","traditionalLiveManage","traditionalLiveManage.liveListManage","traditionalLiveManage.liveListManage.traditionalStreamNew","traditionalLiveManage.liveListManage.traditionalStreamDel","traditionalLiveManage.liveListManage.traditionalStreamSave","traditionalLiveManage.liveListManage.traditionalStreamPlayback","traditionalLiveManage.liveUserManage","traditionalLiveManage.liveUserManage.traditionalUserNew","traditionalLiveManage.liveUserManage.traditionalUserDisable","traditionalLiveManage.liveUserManage.traditionalUserEnable","systemManage","systemManage.accountManage","systemManage.accountManage.userRolesAdd","systemManage.accountManage.userLock","systemManage.accountManage.userUnlock","systemManage.rolesManage","systemManage.rolesManage.rolesAdd","systemManage.rolesManage.rolesDel","systemManage.rolesManage.rightAdd","dataMange","dataMange.statisticsVv","dataMange.statisticsVv.rankingIndex","dataMange.statisticsVv.endRankingIndex","dataMange.statisticsVv.detailIndex","dataMange.statisticsVv.detailDuration","dataMange.statisticsVv.detailViewing","dataMange.statisticsUser","dataMange.statisticsUser.userRankingIndex","dataMange.statisticsUser.userEndRankingIndex","dataMange.statisticsUser.userDetail"]}
     */

    private UserBean user;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class UserBean implements Serializable {
        /**
         * id : 3
         * username : chenshaohua
         * email : null
         * truename : 陈少华
         * isActive : true
         * acl : ["videoManage","videoManage.videoManage","videoManage.videoManage.getDownloadUrl","videoManage.videoManage.videoManagePublish","videoManage.videoManage.editVideoManage","videoManage.videoManage.delVideoManage","videoManage.class","videoManage.class.addClass","videoManage.class.delClass","videoManage.class.editClass","videoManage.source","videoManage.source.addSource","videoManage.source.delSource","videoManage.source.editSource","traditionalLiveManage","traditionalLiveManage.liveListManage","traditionalLiveManage.liveListManage.traditionalStreamNew","traditionalLiveManage.liveListManage.traditionalStreamDel","traditionalLiveManage.liveListManage.traditionalStreamSave","traditionalLiveManage.liveListManage.traditionalStreamPlayback","traditionalLiveManage.liveUserManage","traditionalLiveManage.liveUserManage.traditionalUserNew","traditionalLiveManage.liveUserManage.traditionalUserDisable","traditionalLiveManage.liveUserManage.traditionalUserEnable","systemManage","systemManage.accountManage","systemManage.accountManage.userRolesAdd","systemManage.accountManage.userLock","systemManage.accountManage.userUnlock","systemManage.rolesManage","systemManage.rolesManage.rolesAdd","systemManage.rolesManage.rolesDel","systemManage.rolesManage.rightAdd","dataMange","dataMange.statisticsVv","dataMange.statisticsVv.rankingIndex","dataMange.statisticsVv.endRankingIndex","dataMange.statisticsVv.detailIndex","dataMange.statisticsVv.detailDuration","dataMange.statisticsVv.detailViewing","dataMange.statisticsUser","dataMange.statisticsUser.userRankingIndex","dataMange.statisticsUser.userEndRankingIndex","dataMange.statisticsUser.userDetail"]
         */

        private int id;
        private String username;
        private String email;
        private String truename;
        private int isActive;
        private List<String> acl;
        private List<DepInfo> depInfo;


        public static class DepInfo implements Serializable {

            private String depUuid;
            private String depName;

            public String getDepUuid() {
                return depUuid;
            }

            public void setDepUuid(String depUuid) {
                this.depUuid = depUuid;
            }

            public String getDepName() {
                return depName;
            }

            public void setDepName(String depName) {
                this.depName = depName;
            }
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTruename() {
            return truename;
        }

        public void setTruename(String truename) {
            this.truename = truename;
        }

        public int isIsActive() {
            return isActive;
        }

        public void setIsActive(int isActive) {
            this.isActive = isActive;
        }

        public List<String> getAcl() {
            return acl;
        }

        public void setAcl(List<String> acl) {
            this.acl = acl;
        }

        public List<DepInfo> getDepInfo() {
            return depInfo;
        }

        public void setDepInfo(List<DepInfo> depInfo) {
            this.depInfo = depInfo;
        }

        @Override
        public String toString() {
            return "UserBean{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", email='" + email + '\'' +
                    ", truename='" + truename + '\'' +
                    ", isActive=" + isActive +
                    ", acl=" + acl +
                    ", depInfo=" + depInfo +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "LoginEntity{" +
                "user=" + user +
                '}';
    }
}
