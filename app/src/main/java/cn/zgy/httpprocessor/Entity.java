package cn.zgy.httpprocessor;

public class Entity {

    String code;
    String msg;

    LoginEntity data;

    @Override
    public String toString() {
        return "Entity{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
